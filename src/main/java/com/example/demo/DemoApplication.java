package com.example.demo;

import org.springframework.boot.web.server.WebServerFactory;
import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean appServletRegistrationBean(){
    return new ServletRegistrationBean(new AppServlet(),"/app");
	}

	@Bean
	public ServletRegistrationBean thriftServletRegistrationBean(){
    return new ServletRegistrationBean(new ThriftServlet(),"/thrift");
	}

	@Bean
	public WebServerFactoryCustomizer containerCustomizer() {
	    return new WebServerFactoryCustomizer() {
	        @Override
	        public void customize(WebServerFactory webServerFactory) {
	            if (webServerFactory instanceof TomcatServletWebServerFactory) {
	                TomcatServletWebServerFactory tomcatServletWebServerFactory =
	                        (TomcatServletWebServerFactory) webServerFactory;

	                Connector connector = new Connector(TomcatServletWebServerFactory.DEFAULT_PROTOCOL);
	                connector.setPort(9043);
	                tomcatServletWebServerFactory.addAdditionalTomcatConnectors(connector);
	            }
	        }
	    };
	}

}
