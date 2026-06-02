package oops_principle;

//Data Initialize By reference variable
//By constructor
//Intialize by method
class Student {
	int id;
	String name;
	int rollno;
	String name1;

	void insertRecord(int r, String n) {
		rollno = r;
		name1 = n;
	}

	void displayInformation() {
		System.out.println(rollno + " " + name1);
	}
}

class Employee {

	int id;
	String name;
	double salary;

	public Employee(int id1, String name1, double salary1) {
		this.id = id1;
		this.name = name1;
		this.salary = salary1;
	}

	void empdetails() {
		System.out.println("Employee details :" + id + " : " + name + " : " + salary);
	}
}

public class ObjectData {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("-----Intialize by reference Variable-----");
		s1.id = 101;
		s1.name = "Soham";
		System.out.println(s1.id + " " + s1.name);// printing members with a white space

		System.out.println("-----Intialize by method-----");
		Student s2 = new Student();
		s2.insertRecord(222, "Aryan");
		s2.displayInformation();

		System.out.println("-----Intialize by Constructor-----");
		Employee emp = new Employee(301, "Kumar", 35000);
		emp.empdetails();
	}

}
