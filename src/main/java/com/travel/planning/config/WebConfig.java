package com.travel.planning.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;

@Configuration
public class WebConfig {

	public void configureViewResolvers(ViewResolverRegistry registry)
	{
//		registry.jsp("/WEB-INF/views/",".html");
	}
}
