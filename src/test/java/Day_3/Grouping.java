package Day_3;
import org.testng.annotations.Test;
public class Grouping
{
   /*   login byemail----------------------sanity and regression
        login byfacebook-------------------sanity 
        login bytwitter--------------------sanity 
        
        signup by email--------------------sanity and regression
        signup by facebook-----------------regression
        signup by twitter------------------regression
        
        payment in rupees------------------sanity and regression
        payment in dollor------------------sanity 
        payment in returnbybank------------regression
   */
	@Test(priority=1,groups= {"sanity" ,"regression"})
    void loginbyemail()
    {
		System.out.println("This is loginbyemail");
    }
	
	@Test(priority=2,groups= {"sanity"})
    void loginbyfacebook()
    {
		System.out.println("This is login by facebook");
    }
	
	@Test(priority=3,groups= {"sanity"})
    void loginbytwitter()
    {
		System.out.println("This is login by twitter");
    }
	
	@Test(priority=4,groups= {"sanity" ,"regression"})
    void  signupbyemail()
    {
		System.out.println("This is  signup by email");
    }
	
	@Test(priority=5,groups= {"regression"})
    void  signupbyfacebook()
    {
		System.out.println("This is  signup by facebook");
    }
	
	@Test(priority=6,groups= {"regression"})
    void  signupbytwitter()
    {
		System.out.println("This is  signup by twitter");
    }
	
	@Test(priority=7,groups= {"sanity" ,"regression"})
    void paymentinrupees()
    {
		System.out.println("This is payment in rupees");
    }
	
	@Test(priority=8,groups= {"sanity"})
    void paymenindollor()
    {
		System.out.println("This is payment in dollor");
    }
	
	@Test(priority=9,groups= {"regression"})
    void paymentinreturnbybank()
    {
		System.out.println("This is payment in returnbybank");
    }	
}
