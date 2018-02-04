package com.info.demo2.LocksDemo;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyLockExample implements Runnable{

	private Resource resource;
	//Go through Java Doc of Lock Interface for more Explanation
	private Lock lock;
	
	public ConcurrencyLockExample(Resource r){
		this.resource = r;
		this.lock = new ReentrantLock();
	}
	
	@Override
	public void run() {
		try {
			if(lock.tryLock(10, TimeUnit.SECONDS)){
			resource.doSomething();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			//release lock
			lock.unlock();
		}
		resource.doLogging();
	}

}