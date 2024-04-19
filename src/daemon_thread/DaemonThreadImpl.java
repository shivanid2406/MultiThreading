package daemon_thread;

public class DaemonThreadImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread d1 = new Thread(new DaemonThread());
		Thread d2 = new Thread(new DaemonThread());
		Thread d3 = new Thread(new DaemonThread());

		d1.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();
	}

}
