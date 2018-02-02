package com.info.demo1.synchronizedDemo;



//Example with no Synchronization

class First {
	
	//unsynchronized.Such condition will lead to race condition
	public void display(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
	
	
	
	/*public synchronized void display(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}*/
	
	
}

class Second extends Thread {
	String msg;
	First fobj;

	Second(First fp, String str) {
		fobj = fp;
		msg = str;
		start();
	}

	public void run() {
		fobj.display(msg);
	}
}

public class Syncro1 {
	public static void main(String[] args) {
		First fnew = new First();
		Second ss = new Second(fnew, "welcome");
		// ss.start();
		Second ss1 = new Second(fnew, "new");
		// ss1.start();
		Second ss2 = new Second(fnew, "programmer");
		// ss2.start();
	}
}
