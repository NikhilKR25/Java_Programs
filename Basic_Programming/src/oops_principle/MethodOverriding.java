package oops_principle;

class A{
	public int a;
	public int demo() {
		System.out.println("Method one - Class A");
		return 1;
	}
	public void meth() {
		System.out.println("Method two - Class A");
	}
}
class B extends A{
	@Override
	public void meth() {
		System.out.println("Method overridden in Class B");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		A var = new A();
		var.demo();
		var.meth();
		B var1 = new B();
		var1.meth();
	}
}
