package oops_principle;

//all properties of Parent class acquired in child class with the help of extends keyword
public class ParentChild extends ParentClass{
	public void speak() {
		System.out.println("child speaking...Child class method running");
	}
	ParentChild(){
		System.out.println("Child Class Constructor Loading");
	}
	ParentChild(int i){
		super(i);
		System.out.println("Child Class 2 Constructor Loading");
	}
}
