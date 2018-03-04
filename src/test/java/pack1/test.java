package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ecomm.shopclues.genlibraries.BaseClass;

public class test extends BaseClass{

		@Test(invocationCount=5)
	public  void test1() {
		// TODO Auto-generated method stub
			System.out.println("Test");
		Assert.assertEquals(true, true);
	}

}
