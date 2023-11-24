package ConcatinateTwoStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class A {

	
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		
		List<Integer> li2=new ArrayList<Integer>();
		li2.add(40);
		li2.add(50);
		li2.add(60);
		
		Stream<Integer> stream = li.stream();
		Stream<Integer> stream2 = li2.stream();
		Stream<Integer> concat = Stream.concat(stream, stream2);
		concat.forEach(System.out::println);
	}
}
