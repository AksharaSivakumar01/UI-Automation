import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.primevideo.com/");
		driver.findElement(By.className("pv-nav-search-query")).click();
		driver.findElement(By.className("pv-nav-search-query")).sendKeys("mean");
		List<WebElement> auto = driver.findElements(By.className("pv-nav-search-suggestion-item"));
		String search = "mean girls";
		for(WebElement option: auto) {
			if(option.getText().equalsIgnoreCase(search)) {
				option.click();
				break;
			}
		}

	}

}
