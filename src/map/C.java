package map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C {

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,20,3,40,50,6);
		List<Integer> collect = li.stream().map(s->s*3).collect(Collectors.toList());
	collect.forEach(System.out::println);
	
	}
}
