package firstspring;

public class A {

	B b;

	A() {
		System.out.println("A is created");
	}

	public B getB() {
//		System.out.println("HELLO in getB");
		return b;
	}

	public void setB(B b) {
//		System.out.println("HELLO in setB");
		this.b = b;
	}

	void print() {
		System.out.println("Hello A");
	}

	void display() {
		print();
		b.print();
	}

}
