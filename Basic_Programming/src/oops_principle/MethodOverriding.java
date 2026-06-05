package oops_principle;

class A{
	public int a;
	public int demo() {
		System.out.println("method one class 1");
		return 1;
	}
	public void meth() {
		System.out.println("method two class 1");
	}
}
class B extends A{
	@Override
	public void meth() {
		System.out.println("method override in class 2");
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
