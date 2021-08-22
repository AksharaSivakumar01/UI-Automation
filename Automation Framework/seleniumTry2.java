import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class seleniumTry {
	@Test

public void main() {
	 
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshara\\Desktop\\chromedriver_win32\\chromedriver.exe");
 
// Initialize browser
WebDriver driver=new ChromeDriver();
 
// Open facebook
driver.get("https://growsolutionsau.test-columbus.acsitefactory.com/");
driver.manage().window().maximize();
 driver.findElement(By.xpath("//button[contains(text(),'Advanced')]")).click();
 driver.findElement(By.linkText("Proceed to growsolutionsau.test-columbus.acsitefactory.com (unsafe)")).click();
 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
 WebElement gotIt = driver.findElement(By.linkText("Got it!"));
 WebDriverWait wait= new WebDriverWait(driver,30);
 wait.until(ExpectedConditions.visibilityOf(gotIt));
 System.out.println("Waiting done");
// driver.quit();
// driver.navigate().refresh();

// Maximize browser
 

 
}
 
 
	}

