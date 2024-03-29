package Thread;

public class MyThread extends Thread{
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread m1=new MyThread();
		MyThread2 m2=new MyThread2();
		
		m1.yield();
		m1.start();
		
		m2.start();
		
	}

		@Override
		public void run() {
			
			for(int i=1;i<=5;i++) {
				
				System.out.println("child thread1..");
			}
		}
}
class MyThread2 extends Thread{
	
		@Override
		public void run() {
			
			for(int i=1;i<=5;i++) {
				
				System.out.println("child thread2..");
			}
		}
		
		
			
		
	}


