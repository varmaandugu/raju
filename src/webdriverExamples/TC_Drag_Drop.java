package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static org.testng.Assert.assertEquals;
public class TC_Drag_Drop {

	public static void main(String[] args) throws Exception {
		// Test Steps
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VARMA\\Selenium\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/&quot");
	Thread.sleep(3000);
	// Verify Title - stop exe-cond:failed
	assertEquals(driver.getTitle(),"Droppable  | jQuery UI");
	System.out.println("Title matched");
driver.switchTo().frame(0);
Actions ac = new Actions (driver);
ac.dragAndDrop(driver.findElement(By.id("draggable")),
		driver.findElement(By.id("draggable"))).perform();
		System.out.println("Drag&Drop");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.close();


	}

	
	}

	
		
	


