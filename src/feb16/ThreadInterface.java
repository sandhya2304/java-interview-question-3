package feb16;

public class ThreadInterface implements Runnable
{

	public static void main(String[] args) {
		ThreadInterface th = new ThreadInterface();
		Thread t = new Thread(th);
		t.start();

	}

	@Override
	public void run() {
		System.out.println("thread with interface");
		
	}

}
