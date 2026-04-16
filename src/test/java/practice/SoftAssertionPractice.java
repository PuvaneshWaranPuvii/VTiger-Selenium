package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionPractice {
	@Test
	public void softAssertion() {
		String expectedFood="Briyani";
		String actualFood="Chicken Briyani";
		System.out.println("soft Assertion starts");
		SoftAssert s =new SoftAssert();
		s.assertEquals(actualFood,expectedFood);
		s.assertTrue(actualFood.contains(expectedFood));
		System.out.println("soft  Assertion ends");
		s.assertAll();
		
	}

}
