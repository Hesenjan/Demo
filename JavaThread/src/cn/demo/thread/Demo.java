package cn.demo.thread;

public class Demo {

	 public static void main(String[] args) {
	        A a = new A();
	        B b = new B();
	        C c = new C();
	        a.start();
	        b.start();
	        c.start();
	    }


	}

	class A extends Thread {
	    public A() {

	    }

	    @Override
	    public void run() {
	        for (int i = 0; i < 10; i++) {
	            System.out.println("A" + i);
	        }
	    }
	}

	class B extends Thread {
	    public B() {

	    }

	    @Override
	    public void run() {
	        for (int i = 0; i < 10; i++) {
	            System.out.println("B" + i);
	        }
	    }
	}

	class C extends Thread {
	    public C() {

	    }

	    @Override
	    public void run() {
	        for (int i = 0; i < 10; i++) {
	            System.out.println("C" + i);
	        }
	    }
	}