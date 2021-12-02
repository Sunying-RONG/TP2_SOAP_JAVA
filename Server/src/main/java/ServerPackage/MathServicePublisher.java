package ServerPackage;

import javax.xml.ws.Endpoint;

public class MathServicePublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/mathservice", 
				new MathServiceImpl());
		System.err.println("Server is ready");
	}
}
