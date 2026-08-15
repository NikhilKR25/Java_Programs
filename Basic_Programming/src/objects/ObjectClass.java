package objects;


import java.util.ArrayList;
public class ObjectClass {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		// All three references point to the same ObjectClass object.
		ObjectClass oc = new ObjectClass();
		ObjectClass oc1 = oc;
		ObjectClass oc2 = oc1;
		
		// getClass() returns the runtime class of the object.
		System.out.println("Object class name :"+oc2.getClass().getName());
		
		ArrayList al = new ArrayList();
		
		// Primitive values are automatically converted to wrapper objects
		al.add(11);
		al.add(10.5);
		al.add(null);
		al.add('k');
		System.out.println("Object :"+al);
		
		// clone() creates a shallow copy of the ArrayList.
		ArrayList alc = (ArrayList)al.clone();
		System.out.println("Clone object :"+alc);
	}

}
