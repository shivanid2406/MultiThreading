package wait_notify;

public class WaitThread extends Thread{
	Integer val;

	public WaitThread(Integer val) {
		super();
		this.val = val;
	}
	

	public void run() {
		synchronized (val) {
			try {
				Thread.sleep(2000);
				System.out.println("Waiting to get lock");
				val.wait();
				System.out.println("Waiting to get notified by Notifier Thread");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
