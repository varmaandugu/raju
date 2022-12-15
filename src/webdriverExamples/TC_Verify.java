package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TC_Verify {

	public static void main(String[] args)throws Exception {
// Test Steps
System.setProperty("webdriver.gecko.driver","C:\\Users\\VARMA\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
// VeSysterify page Title
// Actual Result    ExpectedResult
if(driver.getTitle().equals("OrangeHRM-New Level of HR Management")) {
	System.out.println("Title matched");
}
else {
	System.out.println("Title not matched");
	System.out.println("driver.getTitle()");
}
driver.findElement(By.name("txtUsername")).sendKeys("nareshit");
driver.findElement(By.name("Password")).sendKeys("nareshit");
Thread.sleep(3000);
driver.findElement(By.name("Submit")).click();
System.out.println("Login completed");
Thread.sleep(3000);
// Verify page title
if(driver.getTitle().equals("OrangeHRM")){
		System.out.println("Title matched");
}
else {
	System.out.println("Title not matched");
	System.out.println(driver.getTitle());
}
driver.findElement(By.linkText("Logout")).click();
Thread. sleep(3000);
System.out.println("logout completed");
driver. close();
	}

	}
		
		


	


