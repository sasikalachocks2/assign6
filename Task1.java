package assign6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
Try to use contains , xpath axes, text functions
Write a minimum 3 XPath and 3 CSS Selector for the username 
Write a minimum 3 XPath and 3 CSS Selector for the password
Write a minimum 3 XPath and 3 CSS Selector for the login button  
 */

public class Task1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		//driver.findElement(By.xpath("//input[contains(@placeholder,'User')]")).sendKeys("Admin");
		//driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		
		//using contains method in css we are using *
		//driver.findElement(By.cssSelector("input[name*='user']")).sendKeys("Admin");
		
		//ends with in css we are using $
		//driver.findElement(By.cssSelector("input[name$='name']")).sendKeys("Admin");
		
		
		
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]")).sendKeys("admin123");
		//driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("admin123");
		
		//value should be exact match ie)including space
		//driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
			

	}

}
