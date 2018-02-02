package com.info.demo1.synchronizedDemo;

public class Test {

	public synchronized void foo() {
		System.out.println("I am in foo");
		bar();
	}

	public synchronized void bar() {
		System.out.println("I am in bar");
	}

}