package oops_principle;

public class Abstraction {
	
	private int id;
	private String name;
	
//	Getter and Setter method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Abstraction var = new Abstraction();
		var.id = 11;
		var.name = "Shyam"; //@throws error due to private access
		var.setId(54);
		var.setName("Shyam");
		System.out.println("Id :"+var.getId());
		System.out.println("Name :"+var.getName());
	}

}
