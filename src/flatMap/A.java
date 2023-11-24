package flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
//	Note:By using flatmap flatten the elements in an array given and add a number to it.
	public static void main(String[] args) {
		
		
		List<Integer> li=Arrays.asList(1,2,3);
		List<Integer> li2 = Arrays.asList(4,5,6);
		List<Integer> li3 = Arrays.asList(7,8,9);

		List<List<Integer>> li4=Arrays.asList(li,li2,li3);
		List<Integer> collect = li4.stream().flatMap(s->s.stream().map(K->K+10)).collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

}
