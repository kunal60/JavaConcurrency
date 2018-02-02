package com.info.demo1.synchronizedDemo;

class First2 {
	public void display(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}

class Second2 extends Thread {
	String msg;
	First2 fobj;

	Second2(First2 fp, String str) {
		fobj = fp;
		msg = str;
		start();
	}

	public void run() {
		synchronized (fobj) // Synchronized block
		{
			fobj.display(msg);
		}
	}
}

public class Syncro2 {
	public static void main(String[] args) {
		First2 fnew = new First2();
		Second2 ss = new Second2(fnew, "welcome");
		Second2 ss1 = new Second2(fnew, "new");
		Second2 ss2 = new Second2(fnew, "programmer");
	}
}
