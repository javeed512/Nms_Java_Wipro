package lambdexp.methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdExpDemo {

	public static void main(String[] args) {


		
	List<String>  list =Arrays.asList("apple","mango","orange","kiwi","banana");
		
		
				for (String name : list) {
					
					System.out.println(name);
				}

				System.out.println("Print list using lambda");
				
			//	list.forEach((name)->{  System.out.println(name);});
	
				list.forEach(System.out::println);
				
				list.sort((s1,s2)->{ return s1.compareTo(s2);});
				
				System.out.println("sorted list");
				list.forEach(System.out::println);
				
				System.out.println("using comparing()");
				
				list.sort(Comparator.comparing( (s1)->{return s1;}));
				
				list.forEach(System.out::println);
				
				System.out.println("Natural order");
				list.sort(Comparator.naturalOrder());
				
				
				list.forEach(System.out::println);
				
				System.out.println("Reserve order");
				list.sort(Comparator.reverseOrder());
				
				
				list.forEach(System.out::println);
				
				
				
	}

}
