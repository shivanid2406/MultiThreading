package thread_join;

public class ThreadJoin extends Thread {

	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("Current Thread name is: " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Thread ended. Name of the thread is: " + Thread.currentThread().getName());
	}

}
