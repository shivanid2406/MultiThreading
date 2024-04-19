package daemon_thread;

public class DaemonThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName()+" is Daemon Thread");
		}
		else {
			System.out.println(Thread.currentThread().getName()+" is User Thread");
		}
		
	}

}
