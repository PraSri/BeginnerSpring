package firstspring;
//this is a singleton class
public class factoryA {
	
	private static final factoryA obj = new factoryA();
	
	private factoryA() {
		System.out.println("private Constructor");
	}
	
	public static factoryA getA() {
		System.out.println("factory Method");
		return obj;
	}
	
	public void msg() {
		System.out.println("hello user");
	}

}
