package practice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(genaricUtility.ListenersImplementation.class)
public class TestNgPractice {
	//@Ignore
	@Test(priority=2)
	public void bhuviSpeak() {
		System.out.println("Hi");
	}
	  
      @Test(priority=2)
	public void bhuviChats() {
		System.out.println("Hi Chlm");
	}
	 
      @Test(priority=3,invocationCount = 2)
	public void bhuviEats() {
		System.out.println("Briyani");
	}
	 @Test(dependsOnMethods = {"bhuviChats","bhuvicall"})
	public void bhuviSleep() {
		// Assert.fail();
		System.out.println("bye chlm");
	}
	@Test
	 public void bhuvicall() {
		 System.out.println("Girl friend");
	 }
}
