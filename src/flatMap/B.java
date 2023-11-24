package flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//suppose if i use a arrays 
public class B {
	public static void main(String[] args) {
		
		
		
		
		int[]a= {1,2,3};
		int []b= {4,5,6};
		int []c= {7,8,9};
		Integer []d=new Integer[a.length];
		
		for (int i = 0; i < a.length; i++) {
			d[i]=a[i];
		}
		
		List<Integer> e = Arrays.asList(d);
		
		Integer []f=new Integer[b.length];
		
		for (int i = 0; i < b.length; i++) {
			f[i]=b[i];
		}
		List<Integer> g=Arrays.asList(f);
		
		
		Integer[]h=new Integer[c.length];
		for (int i = 0; i < c.length; i++) {
			h[i]=c[i];
		}
		List<Integer> j=Arrays.asList(h);
		
		
		List<List<Integer>> li=Arrays.asList(e,g,j);
		
		List<Integer> collect = li.stream().flatMap(s->s.stream()).collect(Collectors.toList());
		System.out.println(collect);
		
		
//		List<Integer> li
	}

}
