package java_features;

import java.util.*;
import java.util.stream.Collectors;

class Employee
{
	String fullName;
	long salary;
	String city;
	public Employee(String fullName,long salary,String city)
	{
		this.fullName=fullName;
		this.salary=salary;
		this.city=city;
	}
}
public class Main42 {
         public static void main(String[] args)
         {
        	 List<Employee> employees=new ArrayList<>();
        	 employees.add(new Employee("Bill james",2000,"delhi"));
        	 employees.add(new Employee("Suraj kumar",3000,"mumbai"));
        	 employees.add(new Employee("San husky",4000,"delhi"));
        	 employees.add(new Employee("lokesh kumar",8000,"delhi"));
        	 employees.add(new Employee("thomas cook",10000,"hyderabad"));
        	 
        	 List<Employee> namesObjects=employees.stream().filter(e->e.salary<5000 && e.city.equals("delhi")).collect(Collectors.toList());
        	 List<String> names=namesObjects.stream().map(e->e.fullName).collect(Collectors.toList());
        	 
        	 System.out.println("People who live in delhi and salary less than 5000 are : "+names);
         }
}
