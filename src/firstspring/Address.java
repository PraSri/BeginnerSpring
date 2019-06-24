package firstspring;

public class Address {

	private String city, state, country;
	
	public Address() {
	}

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString() {
		return city+" "+state+" "+country;
	}

}
