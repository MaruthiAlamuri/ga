package com.javafeatures.lamdaexpression;


// Instead of Creating like these just use java 8 feature
/*class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child-Thread");
		}
		
	}
	
}*/




public class MultiThreading {
	
	
	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i =0;i<10;i++) {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main-Thread");
		}
		
		
	}

}
