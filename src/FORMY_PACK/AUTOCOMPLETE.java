package FORMY_PACK;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AUTOCOMPLETE {

public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "D:\\automation\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		//driver.navigate().to("https://formy-project.herokuapp.com/autocomplete");
		driver.manage().window().maximize();
		
		WebElement Address = driver.findElement(By.id("autocomplete"));
		Address.sendKeys("Nithya,TRA-4,Mundakkal East Kollam");
		
	    WebElement Streetaddress = driver.findElement(By.id("street_number"));
	    Streetaddress.sendKeys("Mundakkal East");
	   
	    WebElement City = driver.findElement(By.cssSelector("#locality"));
	    City.sendKeys("Kollam"); 
	    
	    WebElement State = driver.findElement(By.xpath("//*[@id=\"administrative_area_level_1\"]"));
	    State.sendKeys("Kerala");
	    
	    WebElement Zipcode = driver.findElement(By.id("postal_code"));
	    Zipcode.sendKeys("691001");
	    Thread.sleep(2000);

	    WebElement Country = driver.findElement(By.id("country"));
	    Country.sendKeys("India");
	    driver.close();    
	}
	 
 }


