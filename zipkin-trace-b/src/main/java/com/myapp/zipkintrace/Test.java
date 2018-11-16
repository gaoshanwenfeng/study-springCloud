package com.myapp.zipkintrace;

public class Test {
	 static int r1,r2,a,b;
	    public static class ThreadA implements Runnable {
	        @Override
	        public void run() {
	            r1 = b;//0
	            a = 1;//1
	        }
	    }

	    public static class ThreadB implements Runnable {
	        @Override
	        public void run() {
	            r2 = a;//0
	            b = 2;//2
	        }
	    }

	    public static void main(String[] arg) throws InterruptedException {
	        Thread t1 = new Thread(new ThreadA());
	        Thread t2 = new Thread(new ThreadB());
	        t1.start();
	        t2.start();
	        Thread.sleep(200);
	        System.out.println(r1);
	        System.out.println(r2);

	    }
	}