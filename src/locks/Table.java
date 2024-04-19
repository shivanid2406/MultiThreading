package locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Table {

	// synchronized void multiples(int n){
	void multiple(int n) {
		// non-static methods lock on this
		//synchronized (this) {
		Lock locker = new ReentrantLock();
		locker.lock();
			for (int i = 1; i <= 10; i++) {
				System.out.println(n * i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			locker.unlock();
		
		}
	
}
