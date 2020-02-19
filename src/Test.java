import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

		// Initialize browser
		WebDriver driver=new ChromeDriver();

		// Open Landing page
		driver.get("https://158-test.nopaperforms.in");

		// Maximize browser

		driver.manage().window().maximize();
		
		 driver.findElement(By.id("Name")).sendKeys("viek");
		

	}

}
