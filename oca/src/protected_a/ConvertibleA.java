package protected_a;

public class ConvertibleA extends SportsCarA {

	public void doSomething() {
		goFast();
	}

	public void doSomethingElse() {
		SportsCarA sportsCarA = new SportsCarA();
		sportsCarA.goFast();
	}
	
}
