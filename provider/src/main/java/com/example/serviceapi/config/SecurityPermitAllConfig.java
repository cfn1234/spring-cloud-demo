package com.example.serviceapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * com.example.serviceapi.config
 *
 * @author caofengnian
 * @Date 2020-03-05
 */
@Configuration
public class SecurityPermitAllConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().permitAll()
				.and().csrf().disable();
	}
}
