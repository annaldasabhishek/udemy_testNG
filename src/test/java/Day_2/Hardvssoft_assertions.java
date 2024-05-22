package Day_2;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Hardvssoft_assertions 
{
  @Test
  void test_hard_assertions()
  {
	  System.out.println("ABHISHEK");
	  System.out.println("ABHISHEK");
	  System.out.println("ABHISHEK");
	  System.out.println("ABHISHEK");
	  System.out.println("ABHISHEK");
	  Assert.assertEquals(1, 2);  //if it will fail then below statement will not be executed.
	  
	  System.out.println("Hard assertion completed");
	  
	  Assert.assertEquals(1,1);
  }
  
  @Test
  void test_soft_assertions()
  {
	  System.out.println("ABHISHEK");
	  System.out.println("ABHISHEK");
	  System.out.println("ABHISHEK");
	  System.out.println("ABHISHEK");
	  System.out.println("ABHISHEK");
	  
	  SoftAssert object = new SoftAssert();
	
	    object.assertEquals(1, 1);
	    System.out.println("soft assertions completed");
	    object.assertAll();          //mandatory.
  }
	
}
