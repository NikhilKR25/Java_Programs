package oops_principle;
/* we can not create object of abstract class
 * Abstract method - declare without an implementation
 * Abstract Class - includes abstract method then it is called.
 * provide implementation for interface.
 */
abstract class Base{
	public Base() {
		System.out.println("Constructor of Base loading");
	}
	public void say() {
		System.out.println("Say Method from Base");
	}
	abstract public void run();
}
class Derive extends Base{
//Concrete class - where implementations provide
	@Override
	public void run() {
		System.out.println("Run mathod invoke from derived class");
	}	
}
public class AbstractClass {

	public static void main(String[] args) {
		Derive der = new Derive();
		der.say();
		der.run();
	}
}
