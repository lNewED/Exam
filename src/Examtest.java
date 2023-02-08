import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

class Examtest {

	@Test
	void testX3() throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.edge.driver", "D:\\WebDrivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.findElement(By.xpath("//*[@id=\"vfb-5\"]")).sendKeys("Supphalak");
		driver.findElement(By.xpath("//*[@id=\"vfb-7\"]")).sendKeys("Maneepanpanit");
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("21/3 M.3 T.Santor Thamaka kanchanaburi");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]")).sendKeys("-");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("-");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("-");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]")).sendKeys("Thailand");
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-14\"]")).sendKeys("Supphalak.sm@gmail.com");

		
		driver.findElement(By.xpath("//*[@id=\"vfb-19\"]")).sendKeys("0982510776");
		
		
		driver.findElement(By.xpath("//*[@id=\"vfb-23\"]")).sendKeys("Hello World!!");
		driver.findElement(By.xpath("//*[@id=\"vfb-3\"]")).sendKeys("99");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"vfb-4\"]")).sendKeys(Keys.ENTER);
		
        String result = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div/h2")).getText();
        assertEquals("Dynamic Transaction Verification", result);
        
	        
        driver.close();

	}

}
