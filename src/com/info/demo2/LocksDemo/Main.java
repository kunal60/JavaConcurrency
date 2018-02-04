package com.info.demo2.LocksDemo;

public class Main {

	public static void main(String[] args) {

		Resource resource = new Resource();

		//SynchronizedLockExample
		/*SynchronizedLockExample sc = new SynchronizedLockExample(resource);
		Thread thread0 = new Thread(sc);
		thread0.start();
		Thread thread1 = new Thread(sc);
		thread1.start();*/
		
		
		//ConcurrentLockExample
		
		ConcurrencyLockExample cl = new ConcurrencyLockExample(resource);
		Thread thread0 = new Thread(cl);
		thread0.start();
		Thread thread1 = new Thread(cl);
		thread1.start();

	}

}
