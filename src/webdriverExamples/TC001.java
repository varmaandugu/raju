package webdriverExamples;
//To access webdriver classes & methods
import org.openqa.selenium.WebDriver;
//To access chrome browser
import org.openqa.selenium.chrome.ChromeDriver;
// To access object Ind:methods
import org.openqa.selenium.By;
public class TC001 {
	
public static void main(String args[])throws Exception{
	// Test Steps
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\VARMA\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
driver.navigate().to("http://183.82.103.245/nareshit/login.php");
// wait for sometime
Thread.sleep(3000);
System.out.println("Application Opened");
driver.findElement(By.name("txtUsername")).sendKeys("nareshit");
driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);
driver.findElement(By.name("submit")).click();
Thread.sleep(3000);
System.out.println("Login completed");
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
System.out.println("Logout completed");
driver.close();
}

}
