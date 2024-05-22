package Day_4;
import org.testng.annotations.Test;
public class Invocation_count 
{
	@Test(invocationCount=20)
	void test()
	{
		System.out.println("ABHISHEK");
	}

}
