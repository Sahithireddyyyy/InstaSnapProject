package Demo;

import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	@Test
	public void verify() throws IOException
	{
		//Configure the browser
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		//navigate to application
		driver.get("https://www.google.com/");
		WorkbookFactory.create(false);
	}

}
