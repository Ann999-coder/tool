package com.jwt.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.jwt.filter.*;
@Configuration
public class MyFilterConfig {

	@Bean
	public FilterRegistrationBean<MyNewFilter> registrationBean() {
		FilterRegistrationBean<MyNewFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new MyNewFilter());
	    registrationBean.addUrlPatterns("/register/save");
		return registrationBean;
		
	}
}
