package feb12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	String empName;
	int age;
	int roll;
	
	public Employee(String empName, int age, int roll) {
		super();
		this.empName = empName;
		this.age = age;
		this.roll = roll;
	}
}

class AgeCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.age == e2.age)
		  return 0;
		else if(e1.age > e2.age)
			return 1;
			else
				return -1;
		}
	}
	
class NameCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.empName.compareTo(e2.empName);
	}
	
}
public class ComparatorEx
{
	public static void main(String[] args)
	{
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("abc",19, 3));
		al.add(new Employee("tha",5, 2));
		al.add(new Employee("love",1, 1));
		
		Collections.sort(al,new AgeCompare());
		System.out.println("sorting age :");
		for(Employee ee:al)
		{
			
			System.out.println(ee.age);
		}
		
		Collections.sort(al,new NameCompare());
		System.out.println("sorting Name :");
		for(Employee ee:al)
		{
			
			System.out.println(ee.empName);
		}
	  
	  
	}

}
