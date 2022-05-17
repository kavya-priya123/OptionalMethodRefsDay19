package ai.jobiak.java8;
import java.util.Optional;
public class TestOptional {
	
	static void method(String input)
	{
		if(input!=null)
		{
			System.out.println(input.length());
		}
	}
	public static void main(String[] args) {
		String str=null;		//object
		String str2= new String("hello");	//object
		//What is the difference between (13th and 14th Line) these two objects?
		// 1)13th line it is not instantiated ,but 14th line is Instantiated.
		//Instantiated means Memory is allocated and it is pointing to an object in the memory.
		// 2)13th line is not used,we can't call any methods on str in 13th line because it is not Method ready it is null
		//NullPointerException
//System.out.println(str.length());	//Once the Exception occurs,the code will not move a head.
//System.out.println(str2.length());
		//method(str);
	
	//IN ORDER TO DEAL WITH NULLS,WE HAVE SOMETHING CALLED AS "OPTIONAL".
		//Optional optional1=Optional.of(str);	//Optional.of throws NULLPOINTEREXCEPTION//Optional require NonNull
		//Optional optional1=Optional.of(str2);	//******************ANYTHING THAT is ITALIC IS STATIC METHOD 
		//System.out.println(optional1.get());
		
		//Optional optional1=Optional.ofNullable(str); 
		//System.out.println(optional1.get()); //NoSuchElementException
		
		//Optional optional1=Optional.ofNullable(str2); 
		//System.out.println(optional1.get()); 
		
		/*Optional optional1=Optional.ofNullable(str);
		if(optional1.isPresent())
		{
			System.out.println(optional1.get()); // this exception is not thrown NoSuchElementException
		}*/
		
		Optional optional1=Optional.ofNullable(str);
		System.out.println(optional1.orElse("Alternate String"));	//orElse --> If a value is present, returns the value, otherwise returns other.
	
		Optional optional2=Optional.ofNullable(str2);
		System.out.println(optional2.orElse("Alternate String"));	//orElse --> If a value is present, returns the value, otherwise returns other.
	}

}
