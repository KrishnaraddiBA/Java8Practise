package flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Note:To remove the null values from 3 list by using flatmap and map
public class C {

	
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,2,3,null,null);
		List<Integer> li2=Arrays.asList(4,5,null);
		List<Integer> li3=Arrays.asList(new Integer(5),new Integer(7),null);
		
		
		//by using the flatmap first combine the list
		
		List<List<Integer>> li4=Arrays.asList(li,li2,li3);
		List<Integer> collect = li4.stream().flatMap(s->s.stream().filter(j->j!=null)).collect(Collectors.toList());
	
	System.out.println(collect);
	
	}
}
