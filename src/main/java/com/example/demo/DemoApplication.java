package com.example.demo;

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

}
