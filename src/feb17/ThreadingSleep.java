package feb17;

public class ThreadingSleep extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++){
			try
			{
				Thread.sleep(500);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
	   ThreadingSleep t1 = new ThreadingSleep();
	   ThreadingSleep t2 = new ThreadingSleep();
	   
	   t1.run();
	   t2.run();
	   
	    
	}

}
