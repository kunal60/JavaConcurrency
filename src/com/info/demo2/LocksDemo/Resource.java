package com.info.demo2.LocksDemo;

public class Resource {

	public void doSomething() throws InterruptedException {

		System.out.println(Thread.currentThread().getName() + " is doing something");

	}

	public void doLogging() {
		System.out.println(Thread.currentThread().getName() + "is doing logging");
	}
}