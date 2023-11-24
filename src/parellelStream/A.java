package parellelStream;

import java.util.ArrayList;
import java.util.List;

//diferences between stream and parellel streams 
//in stream we process process thestream of data sequentially 
//but in parellel stream we we process the data parellely which increases the performance of the data managing
//below is the example

class Student{
	private int id;
	private String name;
	private int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public Student() {
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
public class A {
	
	
	public static void main(String[] args) {
		
		List<Student> li=new ArrayList<Student>();
		
		li.add(new Student(1,"krishnaraddi",60));
		li.add(new Student(2, "Sanaulla", 55));
		li.add(new Student(3, "Rohit", 70));
		li.add(new Student(4,"Rahamath",80));
		li.add(new Student(5, "Islam", 90));
		li.add(new Student(6,"Mohammad",95));
		
		
		
		//now to process the data sequentially
		li.stream().filter(s->s.getMarks()>80).limit(3).forEach(System.out::println);
		
		
		//now to process the data parellely so it can increase the performance of the hd we cannot see but it would happen internally
		li.parallelStream().filter(s->s.getMarks()>70).limit(3).forEach(System.out::println);
		
		
		
		//converting the normal stream to parellelstream
		li.stream().parallel().filter(s->s.getMarks()>80).forEach(System.out::println);
	}

}
