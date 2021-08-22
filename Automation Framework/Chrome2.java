import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshara\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.primevideo.com/");
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("amazon");
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='cfxYMc JfZTW c4Djg MUxGbd v0nnCb']"));
		driver.close();
	}
	public static void launch() {
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver1.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("amazon");
//		driver.close();
	}

}
