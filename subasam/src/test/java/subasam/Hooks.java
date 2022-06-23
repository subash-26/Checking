package subasam;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class Hooks {

	@Before(order = 1)
	public void Before1() {
		System.out.println("*****Navigation******");
	}

	@Before(order = -2)
	public void Before() {
		System.out.println("*****browser lanuch******");
	}

	@After(order=0)
	public void After() {
		System.out.println("****Data base close*******");
	}

	@After(order = -4)
	public void After1() {
		System.out.println("****Kill Browser*******");
	}

}
