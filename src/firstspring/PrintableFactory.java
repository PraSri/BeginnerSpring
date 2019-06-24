package firstspring;

public class PrintableFactory {
	
	public static Printable getPrintable() {
		return new PrintableA();
	}
	
	public Printable getPrintableNonStatic() {
		return new PrintableA();
	}

}
