package FORMY_PACK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DROPDOWN {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/dropdown");
        driver.manage().window().maximize();
        
        WebElement dropdown = driver.findElement(By.id("dropdownMenuButton"));
        dropdown.click();
        
        WebElement option = driver.findElement(By.xpath("/html/body/div/div/div/a[10]"));
        option.click();
        Thread.sleep(3000);
        driver.close();
        
       
        
	}

}
