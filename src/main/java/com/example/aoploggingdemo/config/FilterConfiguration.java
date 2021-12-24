package com.example.aoploggingdemo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.aoploggingdemo.filter.MessageFilter;

@Configuration
public class FilterConfiguration {

	@Bean
	public FilterRegistrationBean<MessageFilter> registrationBean() {
		FilterRegistrationBean<MessageFilter> registrationBean = new FilterRegistrationBean<MessageFilter>();
		registrationBean.setFilter(new MessageFilter());
		registrationBean.addUrlPatterns("/message/*");
		return registrationBean;
	}
}
