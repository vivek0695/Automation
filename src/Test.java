import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

		// Initialize browser
		WebDriver driver=new ChromeDriver();

		// Open facebook
		driver.get("https://171-test.nopaperforms.in/btech");

		// Maximize browser

		driver.manage().window().maximize();
		
		//driver.findElement(By.id());
		

	}

}
