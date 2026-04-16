package practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Test
public class TestNGPractice2 {
	
	@Test(priority='a')
	public void bhuviWakes() {
		System.out.println("Morning 7 ");
	}
	@Test(dependsOnMethods = {"bhuviWakes","bhuviFinishClass"})
	public void bhuviEats() {
		System.out.println("Briyani");
	}
	@Test(invocationCount =5 )
	public void bhuviClass() {
		System.out.println("bhuvi attend selenium class");
	}
	@Ignore
	@Test(priority=3)
	public void bhuviMeetFriends() {
		System.out.println("Bhuvi Hi saying");
	} 
	@Test(priority=-2)
	public void bhuviFinishClass() {
		System.out.println("bhuvi return room");
	}

}
