package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//rule:convert all letters into uppercase and store into anather collection
//rule:to find a length of a given string in list
public class B {
	
	public static void main(String[] args) {
		List<String> li=Arrays.asList("krishna","Rakshitha");
		List<String> collect = li.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	collect.forEach(System.out::println);
	List<Integer> collect2 = li.stream().map(s->s.length()).collect(Collectors.toList());
	collect2.forEach(System.out::println);
	}

}
