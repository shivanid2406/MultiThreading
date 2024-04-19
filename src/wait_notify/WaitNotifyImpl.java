package wait_notify;

public class WaitNotifyImpl {

	public static void main(String[] args) {
		Integer val = Integer.valueOf(0);
		WaitThread t1 = new WaitThread(val);
		t1.start();
		NotifyThread t2 = new NotifyThread(val);
		t2.start();
	}
}
