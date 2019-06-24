package firstspring;

public class Employee {
	
	private String name , city;
	private int id;
	private Address address;
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(int id) {
		this.id = id;
	}
	
	public Employee(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id , String name , String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public Employee(int id , String name , Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void displayInfo() {
		System.out.println("Name: " + name + " id: " + id );
		System.out.println("Address: " + address);
	}
	
	public void displayInfoCity() {
		System.out.println("Name: " + name + " id: " + id );
		System.out.println("City: " + city);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name  = name;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
}
