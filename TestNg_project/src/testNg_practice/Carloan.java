package testNg_practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Carloan {
	@Test
	public void carLoan_web() {
		System.out.println("This is car loan web");
	}
	@Test
	public void carLoan_mobile() {
		System.out.println("This is car loan mobile");
	}
	@Test
	public void carLoan_api() {
		System.out.println("This is car loan api");
	}
	@BeforeMethod
	public void bMethod() {
		System.out.println("execute before every method");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Execute before every test");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("execute before every class");
	}

}
