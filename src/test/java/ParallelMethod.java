import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelMethod {
	
	
	
	@Test
	public void logoTest()
	{
		WebDriver driver=null;
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		
		
	}

}
