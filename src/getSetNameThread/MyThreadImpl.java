package getSetNameThread;

public class MyThreadImpl {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		
		System.out.println("Thread name: "+t1.currentThread().getName());
		t1.start();
		t1.setName("UpdatedThread1");
		
		System.out.println("Thread name after updating the name");
		
		System.out.println(t1.getName());
	}
}
