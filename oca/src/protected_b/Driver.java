package protected_b;

import protected_a.ConvertibleA;
import protected_a.SportsCarA;

public class Driver extends ConvertibleB {

	void doThat() {
		ConvertibleA convertibleA = new ConvertibleA();
//		convertibleA.goFast();
		
		SportsCarA sportsCarA = new SportsCarA();
//		sportsCarA.goFast();
		
		doSomething();
		goFast();
		
		ConvertibleB convertibleB = new ConvertibleB();
		convertibleB.doSomething();
//		convertibleB.goFast();
	}
	
}
