package com.giffing.bucket4j.spring.boot.starter.context;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;

import io.github.bucket4j.ConsumptionProbe;

/**
 * Used to check if the rate limit should be performed independently from the Servlet {@link Filter} or {@link ZuulFilter}.  
 *
 */
@FunctionalInterface
public interface RateLimitCheck {

	/**
	 * @param request the http servlet request of the current request
	 * 
	 * @return null if no rate limit should be performed. (maybe skipped or shouldn't be executed).
	 */
	ConsumptionProbe rateLimit(HttpServletRequest request);
	
}
