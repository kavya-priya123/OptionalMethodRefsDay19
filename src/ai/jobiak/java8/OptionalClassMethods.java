package ai.jobiak.java8;

import java.util.Optional;

public class OptionalClassMethods {

	public static void main(String[] args) {
		//Creating a String Array
		String[] str = new String[5];
		
		//Setting value for 1st index
		str[2] = "JAVA8";
		
		//It returns an empty instance of Optional class
		Optional<String> empty = Optional.empty();
		System.out.println(empty);   // Output : Optional.empty
		
		 // It returns a non-empty Optional
		Optional<String> value = Optional.of(str[2]);
		System.out.println(value);	
		System.out.println(value.get());	//It returns value of an Optional. If value is not present, it throws an NoSuchElementException
		System.out.println(value.hashCode());   // It returns hashCode of the value	
		System.out.println(value.isPresent());  // It returns true if value is present, otherwise false

		

	}

}
