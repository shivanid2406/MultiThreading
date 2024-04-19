package deadlock;

public class Thread1 implements Runnable {

	private Resource1 r1;
	private Resource2 r2;

	public Thread1(Resource1 r1, Resource2 r2) {
		super();
		this.r1 = r1;
		this.r2 = r2;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (r1) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread1 acquired lock on r1, waiting to get locked on r2");
			
			synchronized (r2) {
				System.out.println("Thread1 acquired lock on r2 as well");
				
			}
		}

	}

}
