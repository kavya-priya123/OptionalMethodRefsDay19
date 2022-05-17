package ai.jobiak.java8;

import java.util.Optional;

public class OptionalPractice {
	
	public static void main(String[] args)
	{
		// Creating a String Array
		String[] str = new String[10];
		str[6]="Welcome to Optional";
		Optional<String> checkNull = Optional.ofNullable(str[6]);
		if(checkNull.isPresent())
		{
			String lc = str[6].toLowerCase();
			System.out.println(lc);
		}
		else
		{
			System.out.println("6th String is Null");
		}
		
		
		/*Optional<String> checkNull = Optional.of(str[6]);
		if(checkNull.isPresent())
		{
			String lc = str[6].toLowerCase();
			System.out.println(lc);
		}
		else
		{
			System.out.println("6th String is Null");
		}*/
	}
}
