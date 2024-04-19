package thread_priority;

public class PriorityImpl {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadPriority());
		Thread t2 = new Thread(new ThreadPriority());
		Thread t3 = new Thread(new ThreadPriority());

		System.out.println("Priority of  Thread 1 is: " + t1.getPriority());
		System.out.println("Priority of  Thread 2 is: " + t2.getPriority());
		System.out.println("Priority of  Thread 3 is: " + t3.getPriority());

		t1.setPriority(3);
		t2.setPriority(6);
		t3.setPriority(9);

		System.out.println("Priority of  Thread 1 is: " + t1.getPriority());
		System.out.println("Priority of  Thread 2 is: " + t2.getPriority());
		System.out.println("Priority of  Thread 3 is: " + t3.getPriority());
	}

}
