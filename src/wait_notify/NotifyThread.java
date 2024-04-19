package wait_notify;

public class NotifyThread extends Thread{
	
	Integer val;

	public NotifyThread(Integer val) {
		super();
		this.val = val;
	}
	

	public void run() {
		synchronized (val) {
			try {
				Thread.sleep(2000);
				System.out.println("Notifer Thread begins notifying waiting thread");
				val.notify();
				System.out.println("Notification sent..");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
