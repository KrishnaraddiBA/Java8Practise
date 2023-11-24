package flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



class Student{
	private int id;private String name;
	private String college;
	private String marks;
	public Student(int id, String name, String college, String marks) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.marks = marks;
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
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", college=" + college + ", marks=" + marks + "]";
	}
	
	
	
	
}
public class E {
	
	//studntlist by using flatmap
	
	public static void main(String[] args) {
		
		
		List<Student>li=new ArrayList<Student>();
		li.add(new Student(1, "krishna", "TOCE", "50"));
		li.add(new Student(2, "Manohar", "TOCE", "55"));
		li.add(new Student(3, "Bopanna", "TOCE", "60"));
		li.add(new Student(4, "Kaushik", "TOCE", "55"));
		li.add(new Student(5, "Uddaneshwar", "TOCE","65"));
		
		
		List<Student> li2=new ArrayList<Student>();
		li.add(new Student(6, "Vnkatesh", "Alvas","54"));
		li.add(new Student(7, "Devadatta", "Alvas", "61"));
		
		List<List<Student>> li3=Arrays.asList(li,li2);
		
		List<Student> collect = li3.stream().flatMap(s->s.stream()).map(k->{k.setMarks(k.getMarks()+5);return k;}).collect(Collectors.toList());
		
	collect.forEach(System.out::println);
	}

}
