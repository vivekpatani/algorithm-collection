package interviews.godaddy;

public class ThreadTesting implements Runnable{
	public void run() {
		System.out.println("Hello Patani");
	}

	public static void main(String[] args) {
		ThreadTesting t1 = new ThreadTesting();
	}

}
