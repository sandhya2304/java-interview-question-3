package feb13;


class Engine{
	
	public void start(){
		System.out.println("Engine started");
	}
}

class Car{
	
	private Engine engine;

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}
	
     public void work(){
    	 engine.start();
        System.out.println("Engine here started work");
     }
	
}



public class Composition2
{
	public static void main(String[] args)
	{
		Engine eng = new Engine();
		Car car = new Car(eng);
				car.work();
		
	}

}
