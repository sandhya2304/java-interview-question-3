package feb13;

class Address{
	
	
	String city;
	String state;
	
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

}

class Employee1
{
	String EmpName;
	Address addr;
	public Employee1(String empName, Address addr) {
		super();
		EmpName = empName;
		this.addr = addr;
	}
	
	public void display(){
		System.out.println("Employee name :"+EmpName);
		System.out.println(addr.city+" : "+addr.state);
	}
	
}


public class AggregationEx
{
	public static void main(String[] args) {
		
		Address adr1 = new Address("Meerut","UP");
		Employee1 empp = new Employee1("Sandhya", adr1);
		empp.display();
		

	}

}
