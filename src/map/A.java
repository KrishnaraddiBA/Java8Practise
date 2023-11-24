package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}


public class A {

	

	public static void main(String[] args) {
		
		
		List<Employee> li=Arrays.asList(new Employee(1, "krishna", 2000),new Employee(2, "Rahamath", 25000),new Employee(3, "Islam",10000));
		
		
		List<Object> collect = li.stream().filter(s->s.getSalary()<=10000).map(s->{s.setSalary(s.getSalary()*(1.2));return s;}).collect(Collectors.toList());
	collect.forEach(System.out::println);
	
	}
}
