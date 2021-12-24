package com.example.aoploggingdemo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
//@Order(2)
public class MessageFilter implements Filter {

	Logger LOGGER = LoggerFactory.getLogger(MessageFilter.class);

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		LOGGER.info("[MessageFilter] - Inside doFilter method");
		chain.doFilter(request, response);
	}

}
