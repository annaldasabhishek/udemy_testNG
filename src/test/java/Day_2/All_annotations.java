package Day_2;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class All_annotations 
{
  @BeforeSuite
  void BS()
  {
	  System.out.println("This is before suite");
  }
  @AfterSuite
  void AS()
  {
	  System.out.println("This is after suite");
  }
  @BeforeTest
  void BT()
  {
	  System.out.println("This is after test method");
  }
  @AfterTest
  void AT()
  {
	  System.out.println("This is after test method");
  }
  @BeforeClass
  void BC()
  {
	  System.out.println("This is before class method");
  }
  @AfterClass
  void AC()
  {
	 System.out.println("This is after class method"); 
  }
  @BeforeMethod
  void BM()
  {
	  System.out.println("This is before method");
  }
  @AfterMethod
  void AM()
  {
	  System.out.println("This is after method");
  }
  @Test(priority=1)
  void abc()
  {
	  System.out.println("This is test method  1");
  }
  @Test(priority=2)
  void xyz()
  {
	  System.out.println("This is test method  2");
  }
}
