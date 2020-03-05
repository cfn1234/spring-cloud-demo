package com.example.springfunction.pojo;

import lombok.Data;

/**
 * com.example.springfunction.pojo
 *
 * @author caofengnian
 * @Date 2020-01-19
 */
@Data
public class Foo {
	private String value;
	
	Foo() {
	}
	
	public String lowercase() {
		return value.toLowerCase();
	}
	
	public Foo(String value) {
		this.value = value;
	}
	
	public String uppercase() {
		return value.toUpperCase();
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

}
