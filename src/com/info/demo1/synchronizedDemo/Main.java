package com.info.demo1.synchronizedDemo;

class Main {
	public static void main(String[] args) {

		Runnable r = new Runnable() {
			Test t = new Test();

			@Override
			public void run() {

				t.foo();
				//t.bar();

			}
		};
		
	
		Thread th = new Thread(r);
		th.start();
	
		
		

	}

}