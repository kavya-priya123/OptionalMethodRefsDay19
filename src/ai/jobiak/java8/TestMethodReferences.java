package ai.jobiak.java8;

import java.util.Arrays;
import java.util.List;

class Utility 
{
	Utility()
	{
		System.out.println("from default constructor of Utility()");
	}
	void method()
	{
		System.out.println("from instance method()");
	}
	static void method2()
	{
		System.out.println("from static method2()");
	}
}

interface TestRefs
{
	void substitute();	//abstract method	//define interface,implements the interface,override the methods
}
public class TestMethodReferences {

	public static void main(String[] args) {
		
		Utility util=new Utility();
		//util.method();
		//util.method2();
		//TestRefs ref=new Utility();
		TestRefs ref=util::method;	// the instance method reference //instance method so we can call by creating object
		ref.substitute();
		
		TestRefs ref2=Utility::method2; //static method reference	//static method so we can call by using class name
		ref2.substitute();
		
		//upto java7, data goes to the code ,but in java8 ,code goes to the data(methods)
		
		TestRefs ref3=Utility::new;	//Constructor Reference //new means it will implicitly calls the constructor,allocates memory
		ref3.substitute();
		
		List<Integer> list=Arrays.asList(1,2,3,4,45,5,5);
		list.stream().forEach(System.out::println);	//System.out is a Object and println is a method //Instance method reference
										// :: method reference operator in java	//:: Scope resolution in c++
	}

}
