package FORMY_PACK;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Complete_web_form {
	
public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver-win64\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://formy-project.herokuapp.com/form");
		    driver.manage().window().maximize();
		    
		    WebElement firstNameField = driver.findElement(By.id("first-name"));
	        firstNameField.sendKeys("Nithyapriya");
	        
	        WebElement lastNameField = driver.findElement(By.id("last-name"));
	        lastNameField.sendKeys("M.N.");
	        
	        WebElement jobTitleField = driver.findElement(By.id("job-title"));
	        jobTitleField.sendKeys("Software Tester");
	        
	        WebElement collegeRadio = driver.findElement(By.xpath("//*[@id=\"radio-button-2\"]"));
	        collegeRadio.click();
	        
	        WebElement genderCheckbox = driver.findElement(By.id("checkbox-2"));
	        genderCheckbox.click();
	        
	        WebElement experienceDropdown = driver.findElement(By.id("select-menu"));
	        experienceDropdown.sendKeys("0-1");
	        
	        WebElement dateField = driver.findElement(By.id("datepicker"));
	        dateField.sendKeys("05/15/1994");
	        dateField.sendKeys(Keys.ENTER);
	        
	        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
	        submitButton.click();
	        Thread.sleep(5000);
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("alert('The form was successfully submitted!');");
            Thread.sleep(3000);
            driver.switchTo().alert().accept();
            
            Thread.sleep(5000);
            
	        driver.close();
	        


	}

}
