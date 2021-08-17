package testNg_dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@Test(dataProvider="data")
	public void getdata(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object data() {
		Object[][] data = new Object[3][2];
		data[0][0]="first username";
		data[0][1]="first password";
		data[1][0]="second username";
		data[1][1]="second password";
		data[2][0]="third username";
		data[2][1]="third password";
		return data;
	}
}
