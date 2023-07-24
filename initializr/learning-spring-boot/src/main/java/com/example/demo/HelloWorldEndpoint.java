package com.example.demo;

public class HelloWorldEndpoint {
	private final long id;
	private final String content;
	public HelloWorldEndpoint(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
}
