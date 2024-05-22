package Day_2;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class Before_and_after_suite 
{
	@BeforeSuite
    void login()
    {
    	  System.out.println("This is login method");
    }
	@Test(priority=1)
	void search()
	{
		System.out.println("This is search method");
	}
    @Test(priority=2)
    void advancedsearch()
    {
    	System.out.println("This is advanced search");
    }
    @AfterSuite
    void logout()
    {
    	System.out.println("This is logout methods");
    } 
}
