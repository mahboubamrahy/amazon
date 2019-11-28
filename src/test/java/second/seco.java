package second;

import org.testng.annotations.Test;

import first.Home;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class seco {
	WebDriver driver;
  @Test
  public void f() {
	  Home obj =new Home(driver);
	  obj.in("efhbjvi");
	  obj.lo("eroihjqebjg");
	  obj.payee("rfeqijnh");
	  obj.price("eruiuiherf");
	  obj.clicky();
	  
	  System.out.println("oijegvijningrtngnigi");
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rober\\eclipse-workspace\\New eclipse\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.navigate().to("https://www.mortgagecalculator.org/");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
