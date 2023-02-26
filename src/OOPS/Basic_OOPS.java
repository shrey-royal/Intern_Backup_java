package OOPS;

class Animal{
	public void eat() {
		System.out.println("Animal is Eating...");
	}
	void sleep() {
		System.out.println("Animal is sleeping...");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("Dog is barking...");
	}
}

class Cat extends Animal{
	public void meow() {
		System.out.println("Cat is meowing...");
	}
}

public class Basic_OOPS {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.bark();
		d.eat();
		d.sleep();
		
		Cat c = new Cat();
		c.meow();
		c.eat();
		c.sleep();
		

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
 * 
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
 * 
 * 5. Hybrid
 * 
 * 
 * 2. Polymorphism -> code overwrite (many forms)
 * 3. Abstraction -> data hiding (show functionality only)
 * 4. Encapsulation -> data wrapping/binding
 * 
 * 
 * */
