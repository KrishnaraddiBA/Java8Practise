package TerminalAndNonTerminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//findFirst(),findAny(),allmatch(),anymatch(),noneMatch()
public class B {
	
	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		li.add("one");
		li.add("two");
		li.add("three");
		li.add("four");
		li.add("onetwo");
		li.add("onethree");
		
		boolean anyMatch = li.stream().anyMatch(s->s.startsWith("one"));
		
		System.out.println(anyMatch);
		boolean allMatch = li.stream().allMatch(s->s.startsWith("one"));
	System.out.println(allMatch);
	boolean noneMatch = li.stream().noneMatch(s->s.startsWith("two"));
	System.out.println(noneMatch);
	
	
	Optional<String> findAny = li.stream().findAny();
	
	System.out.println(findAny.get());
	
	Optional<String> findFirst = li.stream().findFirst();
	System.out.println(findFirst.get());
	
	
	}

}
