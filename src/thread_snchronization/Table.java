package thread_snchronization;

public class Table {

	// synchronized void multiples(int n){
	void multiple(int n) {
		// non-static methods lock on this
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(n * i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
