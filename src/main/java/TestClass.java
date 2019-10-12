
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestClass {
	ChromeDriver driver;

	@Test
	public void myProject() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://acme-test.uipath.com/account/login");
	driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
	driver.findElementById("password").sendKeys("leaf@12");
	driver.findElementByXPath("//button[text()='Log In']").click();
	
	/*Thread.sleep(2000);
	Actions obj=new Actions(driver);*/
	//obj.moveToElement(driver.findElementByXPath("(//button[contains(@class,'btn btn-default')])[5]"));
	//driver.findElement(By.xpath(")).click();
	//driver.findElementByXPath("(//button[contains(@class,'btn btn-default')])[5]")).
	driver.findElementByXPath("(//button[@class='btn btn-default btn-lg'])[4]").click();
	driver.findElementByLinkText("Search for Vendor").click();
	
	driver.findElementById("vendorName").sendKeys("Blue Lagoon");
	driver.findElementById("buttonSearch").click();
	
	WebElement table = driver.findElementByClassName("table");
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	String text = driver.findElement(By.xpath("//td[text()='France']")).getText();
	System.out.println("Country name:  "+text);
	driver.findElementByLinkText("Log Out").click();
	driver.close();
	
	
	
		
		
	}

}
