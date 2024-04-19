package deadlock;

public class DeadLockIMPL {

	public static void main(String[] args) {
		
		final Resource1 r1 = new Resource1();
		final Resource2 r2 = new Resource2();

		Thread t1 = new Thread(new Thread1(r1, r2));
		Thread t2 = new Thread(new Thread2(r1, r2));
		
		t1.start();
		t2.start();

	}

}
