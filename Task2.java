package assign6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Employee Name']//following::input[1]")).sendKeys("A");
		driver.close();
		
		/*
		driver.findElement(By.xpath("//span[text()='PIM']"));
		driver.findElement(By.xpath("//span[text()='Leave']"));
		driver.findElement(By.xpath("//span[text()='Time']"));
		driver.findElement(By.xpath("//span[text()='Recruitment']"));
		driver.findElement(By.xpath("//span[text()='My Info']"));
		driver.findElement(By.xpath("//span[text()='Performance']"));
		driver.findElement(By.xpath("//span[text()='Dashboard']"));
		driver.findElement(By.xpath("//span[text()='Directory']"));
		driver.findElement(By.xpath("//span[text()='Maintenance']"));
		driver.findElement(By.xpath("//span[text()='Buzz']"));
		*/
	}

}
