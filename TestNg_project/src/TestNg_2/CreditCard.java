package TestNg_2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
public class CreditCard {
	@Test
	public void creditcard_Web() {
		System.out.println("this is credit card web");
	}
	@Test
	public void creditcard_mobile() {
		System.out.println("this is credit card mobile");
	}
	@Test
	public void creditcard_api() {
		System.out.println("this is credit card api");
	}
	
@BeforeTest
public void before() {
System.out.println("before second test");
}
}
