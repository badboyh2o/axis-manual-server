package com.baboyh2o.ws;

public class HelloService {

	public String sayHello(String xml) {
		System.out.println("request come in ...");
		return "server: " + xml;
	}
	
}
