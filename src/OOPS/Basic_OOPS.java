package OOPS;	//encapsulation

abstract class Calculator{	//abstract class
	protected int Addition(int a, int b) {
		return a+b;
	}	//hidden methods
	
	protected int Addition(int a, int b, int c) {		//method overloading
		return a+b+c;
	}
}	//encapsulation

class SubCalc extends Calculator{
	public int add(int a, int b) {
		return super.Addition(a, b);
	}
	
	public int add(int a, int b, int c) {
		return super.Addition(a, b, c);
	}
}


public class Basic_OOPS {
	public static void main(String[] args) {
		
//		SubCalc s = new SubCalc();
//		System.out.println(s.Addition(1, 2));
		
		SubCalc c = new SubCalc();
		System.out.println(c.add(1, 2));
		System.out.println(c.add(1, 2, 3));

	}

}

/* OOPS Concepts -> Object Oriented Programming System
 * 
 * Scanner sc = new Scanner(System.in);
 * 
 * Scanner sc;	//object declaration
 * sc = new Scanner();	//memory allocation to the object
 * 
 * Object -> any real world entity that has state and behaviour
 * 
 * Instance -> When memory gets allocated to that object
 * 
 * 
 * 4 pillars of OOPS
 * 1. Inheritance	-> code reusability
 * 
 * 	-> It is a process of reusing the existing code multiple times
 * 
 * Terms: - 
 * 
 * Parent/Super/Base class.
 * Child/Sub/Derived class.
 * 
 * 
 * 4 types of inheritance
 * 
 * 1. Single
 * one parent class -> one child class
 * 
 * 2. Multiple -> not supported in java
 * multiple base classes -> single child class
 * 
 * 3. Multilevel
 * one super class -> one super class / child class -> one child class
 * 
 * 4. Hierarchical
 * one base class -> multiple child classes
 * 
 * 5. Hybrid	
 * when we combine two or more types of inheritance.
 * 
 * 
 * 2. Polymorphism -> code overwrite (many forms)
 * -> performing one task using different ways
 * -> overloading/overriding
 * 
 * 3. Abstraction -> data hiding (show functionality only)
 * 4. Encapsulation -> data wrapping/binding
 * 
 * 
 * */
