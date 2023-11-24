package map;

import java.util.ArrayList;
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

//note:perform stream operation on employee class and select the salary that is less than 20000 and increase the salary by 12% by using stream api
public class D {
	
	
	public static void main(String[] args) {
		List<Employee> li=new ArrayList<Employee>();
		li.add(new Employee(1,"Krishnaraddi",47000));
		li.add(new Employee(2, "Keshav", 50000));
		li.add(new Employee(3, "Shrini", 170000));
		li.add(new Employee(4, "Shivanand", 10000));
		li.add(new Employee(5, "Basavaraddi", 130000));
		List<Employee> collect = li.stream().map(s->{s.setSalary(s.getSalary()*1.2); return s;}).collect(Collectors.toList());
	collect.forEach(System.out::println);
	
	}

}
