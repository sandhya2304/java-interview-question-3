package feb13;


 class Bank
 {
	 
	 String name;
	 
   public Bank(String name) {
	   this.name = name;
	
   }	
   
   public String getName() {
	return name;
}
}
 
 class Employee{
	 String EmpName;
	 
	 public Employee(String empname) {
		 EmpName = empname;
		
	}
	 
	 public String getEmpName() {
		return EmpName;
	}
 }



public class AssociationEx
{

	public static void main(String[] args) {
		Bank bank = new Bank("Axis");
		Employee emp = new Employee("Sandhya");
		System.out.println(bank.getName() +" : "+emp.getEmpName());

	}

}
