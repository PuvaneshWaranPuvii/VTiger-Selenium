package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionPractice {
	@Test
	
	public void StrictLevelComparision() {
		String expectedName="Bhuvi";
		String actualName="Rohith";
		System.out.println("Hard Assertion starts");
		Assert.assertEquals(actualName, expectedName);
		Assert.assertEquals(actualName.contains(expectedName),true);
		System.out.println("Hard Assert mid");
		Assert.assertFalse(actualName.equals(expectedName));
		Assert.assertTrue(actualName.equals(expectedName));
		System.out.println("Hard assertion Ends");
		
	}

}
