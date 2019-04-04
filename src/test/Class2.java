package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2 {	//No.127

	@Test(dataProvider="getData")
	public void Demo3(String userName, String passWord) {

		System.out.println("testng dataProvider: "+userName);
		System.out.println("testng dataProvider: "+passWord);
	}

	@DataProvider
	public Object[][] getData() {

		System.out.println("DataProvider ============  ");

		//1st: combination: username + password -- good credit history
		//2nd:  username + psw  - no credit history
		//3rd:  fraudelent credit history
		Object[][] data = new Object[3][2];  // here means: create array: 3 rows + 2 cols
		// 1st set of data:
		data[0][0] = "first username";
		data[0][1] = "first password";

		// 2nd set of data:
		data[01][0] = "second username";
		data[1][1] = "second password";

		// 3rd set of data:
		data[2][0] = "third username";
		data[2][1] = "third password";
		
		return data;



	}

	@Parameters({"URL","APIKey/username"})
	//	@Parameters("URL")
	@Test
	public void Demo4(String URLstring, String keyUsername) {

		System.out.println("testng demo4");
		System.out.println(URLstring);
	}

	public void Demo5() {

		System.out.println("testng demo5");

	}

	@BeforeTest
	public void PreRequisite() {

		System.out.println("Before Test ===== testng PreRequisite");
	}

	@AfterSuite
	public void AfterSuiteTest() {

		System.out.println("After Suite ********** testng AfterSuiteTest");
	}


}
