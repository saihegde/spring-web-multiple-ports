package  com.example.demo;



import com.example.demo.ThriftServlet;
import javax.servlet.Filter;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.FilterChain;

import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.OncePerRequestFilter;

@Configuration
public class ThriftConfiguration {

  // @Bean(name = "javaMelodyRestrictingFilter")
	// public FilterRegistrationBean javaMelodyRestrictingFilter(Filter thriftFilter) {
  //
	// 	FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
	// 	filterRegistrationBean.setFilter(thriftFilter);
	// 	filterRegistrationBean.setOrder(-100);
	// 	filterRegistrationBean.setName("javaMelodyPortRestriction");
	// 	filterRegistrationBean.addServletNames("ThriftServlet");
	// 	return filterRegistrationBean;
	// }

}
