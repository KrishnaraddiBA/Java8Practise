import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEcvenNum {
	
	public static void main(String[] args) {
		
		
		List<Integer> li=Arrays.asList(10,30,40,2,20,70,60);
		List<Integer> evenNum = li.stream().filter(s->s%2==0).collect(Collectors.toList());
	
	evenNum.sort((x,y)->x-y);
	evenNum.forEach(System.out::println);
	}

}
