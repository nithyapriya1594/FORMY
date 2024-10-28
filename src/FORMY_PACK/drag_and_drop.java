package FORMY_PACK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		driver.manage().window().maximize();
	    
		WebElement SourceElement = driver.findElement(By.id("image"));
		WebElement TargetElement = driver.findElement(By.id("box"));
		Actions ac = new Actions(driver);
		ac.clickAndHold(SourceElement).moveToElement(TargetElement).release().build().perform();
		Thread.sleep(3000);
		driver.close();
		
	}

}
