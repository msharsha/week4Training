package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class SimpleFilter extends ZuulFilter {

	private static Logger log = org.slf4j.LoggerFactory.getLogger(SimpleFilter.class);
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// TODO Auto-generated method stub
		RequestContext requestContext = RequestContext.getCurrentContext();
		HttpServletRequest request = requestContext.getRequest();
		log.info(String.format("%s request to %s", request.getMethod(),request.getRequestURL().toString()));
		return null;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
