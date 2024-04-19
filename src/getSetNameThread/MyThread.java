package getSetNameThread;

public class MyThread extends Thread{

	public void run() {
		//System.out.println("Current Thread is: "+Thread.currentThread().getName());
		System.out.println("run() called");
	}
}
