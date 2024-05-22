package Day_2;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Hardassertions
{
	@Test
	void test()
	{
		//int x=100;
		//int y=500;
		
		/*if(x==y)
		{
			System.out.println("Test is passed");
		}
		else
		{
			System.out.println("Test is failed");
		}*/
		
		/*Assert.assertEquals(x, y);
	    Assert.assertTrue(true);
		Assert.assertTrue(false);  */
		
		
		 /*  int a=10;
		int b=20;
		//syntax   Assert.assertEquals(actual,expected,description)
		
		Assert.assertEquals(a>b, true);
		Assert.assertEquals(a<b, false);   */ 
		
		String a1="abhishek";
		String a2="abhishek123";
		//Assert.assertEquals(a1, a2,"string are not equal");
	    //Assert.assertNotEquals(a1, a2);
		
		if(true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			//Assert.assertTrue(false);
			Assert.fail();
			
		}
	    
		
		
	}

}
