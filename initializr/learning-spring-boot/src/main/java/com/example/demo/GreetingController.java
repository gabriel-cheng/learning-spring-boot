package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/home")
	public HelloWorldEndpoint greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new HelloWorldEndpoint(counter.incrementAndGet(), String.format(template, name));
	}
	
	@RequestMapping("/home/test")
	public void testRequest() {
		System.out.println("Acessado!");
	}	
	
	@RequestMapping("/home/param")
	public void testParam(@RequestParam("param") String param) {
		System.out.println(param);
	}
	
	@RequestMapping("/home/pathVariable")
	public void pathVariable(@PathVariable("param") String param) {
		System.out.println(param);
	}
}
