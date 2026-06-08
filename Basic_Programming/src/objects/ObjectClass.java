package objects;


import java.util.ArrayList;
public class ObjectClass {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ObjectClass oc = new ObjectClass();
		ObjectClass oc1 = oc;
		ObjectClass oc2 = oc1;
		System.out.println("Object class name :"+oc2.getClass().getName());
		
		ArrayList al = new ArrayList();
		al.add(11);
		al.add(10.5);
		al.add(null);
		al.add('k');
		System.out.println("Object :"+al);
		
		ArrayList alc = (ArrayList)al.clone();
		System.out.println("Clone object :"+alc);
	}

}
