import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EliminateNullValues {
	
	
	public static void main(String[] args) {
		List<String> li=Arrays.asList("KRISHNA","Govinda","HariNarayana",null,"BhajaGovinda",null);
		
		List<String> collect = li.stream().filter(s->s!=null).collect(Collectors.toList());
	
	collect.forEach(System.out::println);
	
	}
	

	

}
