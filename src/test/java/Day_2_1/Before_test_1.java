package Day_2_1;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class Before_test_1
{
      @Test
      void xyz()
      
      {
         System.out.println("This is xyz from test" );    	  
      }
      @AfterTest
      void n()
      {
    	  System.out.println("This is after test method");
      }
}
