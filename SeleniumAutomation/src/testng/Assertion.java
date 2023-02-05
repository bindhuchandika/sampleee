package testng;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Assertion {

	@Test
	void demoTest()
	{
		Assert.assertEquals("welcome","welcome");
        System.out.println("successful");
	}


}
