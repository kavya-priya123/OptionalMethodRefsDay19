package ai.jobiak.java8;

import java.util.Optional;
import java.util.function.Predicate;

public class Methods {

	public static void main(String[] args) {
		
		Optional<Integer> value1 = Optional.ofNullable(10);	
		Optional<Integer> value2 = Optional.ofNullable(null);	//NoSuchElementException

		  System.out.println(value1);
		  System.out.println(value2);

		  System.out.println(value1.get());
		//System.out.println(value2.get());
		
		System.out.println(value1.isPresent());
		System.out.println(value2.isPresent());
	
		System.out.println(value1.equals(value2));
		
		System.out.println(value1.hashCode());
		System.out.println(value2.hashCode());
		
		System.out.println(value1.isEmpty());
		System.out.println(value2.isEmpty());
		
		System.out.println(value1.toString());
		System.out.println(value2.toString());

		System.out.println(value1.getClass());
		System.out.println(value2.getClass());
		
		System.out.println(value1.orElse(null));
		System.out.println(value2.orElse(null));
		
		System.out.println(value1.orElseThrow());
		//System.out.println(value2.orElseThrow());
		
		System.out.println(value1.stream());
		System.out.println(value2.stream());
		
		System.out.println(value1.of(value2));
		System.out.println(value2.of(value1));
		
		System.out.println(value1.ofNullable(value2));
		System.out.println(value2.ofNullable(value1));
	}
}
