package com.info.demo2.LocksDemo;
public class SynchronizedLockExample implements Runnable{

	private Resource resource;
	
	public SynchronizedLockExample(Resource r){
		this.resource = r;
	}
	
	@Override
	public void run() {
		synchronized (resource) {
			try {
				resource.doSomething();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		resource.doLogging();
	}
}