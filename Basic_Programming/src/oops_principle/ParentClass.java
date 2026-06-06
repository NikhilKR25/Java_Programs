package oops_principle;

public class ParentClass{
	private int a;
	public int getA() {
		return a;
	}
	void eat() {
		System.out.println("eat method...");
	}
	void sleep() {
		System.out.println("sleep method...Parent class method running");
	}
	ParentClass(){
		System.out.println("Parent Class Constructor Loading");
	}
	ParentClass(int a){
		this.a = a;
		System.out.println("Parent Parameterize Constructor loading");
	}
}