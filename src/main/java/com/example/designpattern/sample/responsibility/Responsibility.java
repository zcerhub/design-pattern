package com.example.designpattern.sample.responsibility;

public interface Responsibility {

	void process(Request request, ResponsibilityChain chain);
}
