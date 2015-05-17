package chapter1.package_a;

public class DoubleClass {

	static public final String X = "x";
	public String publicName = "Public Name";
	String defaultName = "Default Name";
	public DoubleDefaultClass doubleDefaultClass = new DoubleDefaultClass();
	
	public DoubleDefaultClass getDoubleDefaultClass() {
		return this.doubleDefaultClass;
	}
}

class DoubleDefaultClass {

	public String publicName = "Public Default Name";
	String defaultName = "Default Default Name";

}