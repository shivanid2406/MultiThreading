package threads;

public class ThreadIMPL {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			Thread1 t1 = new Thread1();
			t1.start();
			Thread2 t2 = new Thread2();
			t2.start();
		}
	}
}
