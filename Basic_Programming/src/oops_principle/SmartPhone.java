package oops_principle;
//	same methods in different interfaces , it gives Ambiguity problems and to solve this by override method or super keyword. 
interface Camera {
	default void run() {
		System.out.println("Click Photo from Camera");
	}
}

interface Mobile {
	default void run() {
		System.out.println("Click Photo from Mobile");
	}
}
	
public class SmartPhone implements Camera,Mobile {

//	@Override
//	public void run() {
//		System.out.println("Click Photo from SmartPhone");
//	} 
//	another way calling only one interface method
	@Override
	public void run() {
		Camera.super.run(); 
		System.out.println("Running custom method");
	}
	public static void main(String[] args) {
		 SmartPhone sp = new SmartPhone();
		sp.run();
	}


}

	
