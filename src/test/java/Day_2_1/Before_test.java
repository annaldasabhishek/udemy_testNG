package Day_2_1;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Before_test
{
  @Test	
  void abc()
  {
	  System.out.println("This is abc from test");
  }
  @BeforeTest
  void m()
  {
	  System.out.println("This is before test method");
  }
  
}

