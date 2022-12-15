package webdriverExamples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitStmt {

	public static void main(String[] args)throws Exception {
	// Test Steps
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VARMA\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	    //wait until Login btn -available:Explicit wait
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
	    driver.findElement(By.name("Submit")).click();
	    //wait until empinfo:page to be available
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	    System.out.println("Login completed");
	    driver.findElement(By.linkText("Logout")).click();
	    Thread.sleep(4000);
	    System.out.println("Logout completed");
	    driver.close();
	

}
	

	}
