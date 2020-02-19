import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginbackenduser {

	public static void main(String[] args) throws InterruptedException {
		
		String a,b;
		
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		// Open Landing page
		driver.get("https://test.nopaperforms.in/colleges/login");
		// Maximize browser
		driver.manage().window().maximize();
		//enter the user details
		
	     driver.findElement(By.id("Email")).sendKeys("test13091824@yopmail.com");
	     driver.findElement(By.id("Password")).sendKeys("Shweta0523#");
	    
	     //click on productivity report
	     driver.findElement(By.xpath("//button[@class='btn btn-lg btn-npf btn-block']")).click();
	     
	     driver.findElement(By.xpath("//a[contains(text(),'Productivity Report')]")).click();
	     Thread.sleep(3000);
	     
	     //click on count of productivity lead assign
	      a = driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[2]/a[1]")).getText();
	     System.out.println(a);
	   
	     
	  driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[2]/a[1]")).click();
	  
	  Thread.sleep(6000);
	 
      //window switch to another tab
	  ArrayList<String> w = new ArrayList<String> (driver.getWindowHandles());
	 // page 1(LM)
	  driver.switchTo().window(w.get(1));
	  Thread.sleep(10000);

	  
	  			
	  //check the current active window text
	  // WebElement wq = driver.switchTo().activeElement();
	  // System.out.println(wq.getText());
	    
	  //Compare  the total record in LM or productivity report a=b
	  
	  b=driver.findElement(By.xpath("//div[2]/div[2]/div[1]/div[1]/div[1]/div[1]//div[1]/strong[1]")).getText();
	  System.out.println(b);
	  
	 // driver.close();
	 // driver.switchTo().window(w.get(0));
	     
	     
	 if(a.equals(b)) {
		 
		 System.out.println("true");
 }
	 else 
 {
		 System.out.println("not equal false"); 
	 }

	}

}
