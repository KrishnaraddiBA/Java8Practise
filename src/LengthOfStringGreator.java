import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LengthOfStringGreator {
	public static void main(String[] args) {
		
		List<String> li=Arrays.asList("krishna","ragini","sajini","Raja","Magetya");
	//without using stream
//		
//		for (String string : li) {
//			if (string.length()>4&&string.length()<8) {
//				System.out.println(string);
//				
//			}
//		}
		
		
		//with using stream
		
		
		List<String> collect = li.stream().filter(s->s.length()>4&&s.length()<8).collect(Collectors.toList());
	
//	System.out.println(collect);
		
		collect.forEach(System.out::println);
	}

}
