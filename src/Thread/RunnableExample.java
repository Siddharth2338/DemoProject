package Thread;

public class RunnableExample implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i < 10; i++) {
			System.out.println("child thread..");
		}
	}

	public static void main(String[] args) throws InterruptedException {

		RunnableExample r1 = new RunnableExample();
		Thread t1 = new Thread(r1);
		t1.start();
		
		for (int i = 1; i < 10; i++) {
			
			System.out.println("main thread..");
		}
	}

}
