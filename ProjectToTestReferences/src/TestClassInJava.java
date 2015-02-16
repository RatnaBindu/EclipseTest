import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClassInJava {
 
	@Test
	public void firstTestMethod()
	{
		System.out.println("Hello World");
	}
	
	@Test
	public void secondTestMethod()
	{
		System.out.println("Hello World");
	  WebDriver driver = new FirefoxDriver();
	  driver.navigate().to("http://google.co.in");
	  driver.manage().window().maximize();
	  driver.close();
	}
}

