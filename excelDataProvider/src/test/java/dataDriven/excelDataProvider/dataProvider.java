package dataDriven.excelDataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

	@Test(dataProvider = "driverTest")
	public void testcaseData(String greeting, String massege, int ids) {
		System.out.println(greeting +" "+ massege+" " + ids);
	}

	@DataProvider(name = "driverTest")
	public Object[][] getData() {

		Object[][] data = { { "Hello", "Srikanth", 1 }, { "Hello", "Swathi", 2 }, { "Hello", "Priyanka", 3 },
				{ "Hello", "Harsha", 4 } };
		return data;

	}

}
	