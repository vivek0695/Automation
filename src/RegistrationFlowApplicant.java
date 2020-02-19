import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFlowApplicant {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		// Initialize browser
			WebDriver driver=new ChromeDriver();
		// Open Landing page of college
		driver.get("https://admission.nopaperforms.com/testing-institute");
		
		// Maximize browser
		driver.manage().window().maximize();
		//Name of the applicant
		driver.findElement(By.id("Name")).sendKeys("vivek");
		
		//declaration  random email for passing variable
	
		int ran;
	    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));

	     //entering the email address will look like this:

	     driver.findElement(By.id("Email")).sendKeys("automation" + ran +"@yopmail.com");
		
	     //Enter Mobile Number
	     
	     Thread.sleep(1000);
	     driver.findElement(By.id("Mobile")).sendKeys("8888888888");
	     //click on register
	    
	     driver.findElement(By.xpath("//button[@id='registerBtn']")).click();
	     
	     Thread.sleep(7000);
	     //Hit on Apply Now or Initial form
	     driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/a[1]")).click();
	   
	     Thread.sleep(4000);
	     
	     driver.findElement(By.id("first_name")).sendKeys("Automation");
	     
	     driver.findElement(By.id("field_152152_69505")).sendKeys("selenium");
	     
	     Thread.sleep(2000);

	     
	     driver.findElement(By.xpath("//div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[3]/a[1]")).click();
	   
	     Thread.sleep(4000);
	 
	    driver.findElement(By.xpath("//div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[3]/a[1]")).click();
	    
	   
	    Thread.sleep(4000);
	    
	   //Hit On Make payment page
	    driver.findElement(By.xpath("//div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[2]/a[1]")).click();
	}
	
	

}
