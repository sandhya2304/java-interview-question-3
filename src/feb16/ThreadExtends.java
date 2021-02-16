package feb16;

public class ThreadExtends extends Thread
{
	
	public void run(){
		System.out.println("thread with inheritance ...");
	}
	
	public static void main(String[] args) {
		 ThreadExtends th =new ThreadExtends();
		 th.start();
	}

}
