package flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class D {
	
	public static void main(String[] args) {
		List<String>li=Arrays.asList("krishna","keshav","ganesh");
		List<String> li2=Arrays.asList("kumar","venugopal","bopanna");
		List<String> li3=Arrays.asList("Saujanya","Srujala","ganga","soumya");
		List<String> li4=Arrays.asList("sanaulla","Revengouda","Manish");
		List<List<String>> asList = Arrays.asList(li,li2,li3,li4);
		List<String> collect = asList.stream().flatMap(s->s.stream()).collect(Collectors.toList());
	
	collect.forEach(System.out::println);
	
	}

}
