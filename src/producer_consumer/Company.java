package producer_consumer;

public class Company {

	int n;
	boolean f = false;

	synchronized public void produce_item(int n) throws InterruptedException {
		if (f) {
			wait();
		}
		this.n = n;
		f = true;
		notify();
		System.out.println("Produced: " + this.n);

	}

	synchronized public int consume_item() throws InterruptedException {
		if (!f) {
			wait();
		}
		System.out.println("Consumed: " + this.n);
		f = false;
		notify();
		return this.n;

	}

}
