package protected_b;

import protected_a.SportsCarA;

public class ConvertibleB extends SportsCarA {
	
	public void doSomething() {
		goFast();
	}

	public void doSomethingElse() {
		SportsCarA sportsCarA = new SportsCarA();
//		sportsCarA.goFast();
	}
	
}
