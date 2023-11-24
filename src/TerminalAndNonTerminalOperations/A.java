package TerminalAndNonTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//terminal methods are min,max,collect,forEach,count,toArray,reduce etc

//Nonterminal methods or processing methods are distinct,limit,map,filter,flatmap,sorted
public class A {
	
	public static void main(String[] args) {
		
		List<Integer> li=Arrays.asList(10,20,30,40,50);
//		List<Integer> collect = li.stream().sorted((a,b)->{return a-b;}).collect(Collectors.toList());
//		collect.forEach(System.out::println);
		
		Optional<Integer> min = li.stream().min((x,y)->{return x>y?1:-1;});
		System.out.println(min.get());
		
	Optional<Integer> max = li.stream().max((x,y)->{return x-y;});
		System.out.println(max.get());
		
		Optional<Integer> min2 = li.stream().min((x,y)->{if(x>y)return 1;return -1;});
	
	System.out.println(min2.get());
	
	Optional<Integer> max2 = li.stream().max((x,y)->{return x-y;});
	
	System.out.println(max2.get());
	
	List<Integer> collect = li.stream().limit(3).collect(Collectors.toList());
	
	collect.forEach(System.out::println);
	
	Object[] array = li.stream().toArray();
	Stream.of(array).forEach(System.out::println);
	long count = Stream.of(array).count();
	
	System.out.println(count);
	}

}
