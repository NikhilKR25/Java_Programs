package oopsPrinciple;

public class JavaConstructor {
	
	private int id;
	private String name;
	
//	constructor can be overloaded and other parameterize constructor also work as method
	public JavaConstructor(){
		id = 15;
		name = "Abhinav";
	}
	public JavaConstructor(int id1, String name1){
		id = id1;
		name = name1;
	}

	public static void main(String[] args) {
		
		JavaConstructor con = new JavaConstructor();
		System.out.println(con.id);
		System.out.println(con.name);
		System.out.println("---------------------");
		JavaConstructor con2 = new JavaConstructor(10,"Harry");
		System.out.println(con2.id);
		System.out.println(con2.name);
		
	}

}
