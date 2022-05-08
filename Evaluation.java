package SeleniumPCKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Evaluation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/webtables");
		
		driver.findElement(By.id("addNewRecordButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstName")).sendKeys("Jhanvi");
		Thread.sleep(2000);
		
		driver.findElement(By.id("lastName")).sendKeys("Asodiya");
		Thread.sleep(2000);
		
		driver.findElement(By.id("userEmail")).sendKeys("jhanvi@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("age")).sendKeys("20");
		Thread.sleep(2000);
		
		driver.findElement(By.id("salary")).sendKeys("50000");
		Thread.sleep(2000);
		
		driver.findElement(By.id("department")).sendKeys("QA");
		Thread.sleep(2000);
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		
		

		
	}

}
