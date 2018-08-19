package firstthingfirst;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2sms {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumdownloadsandinstall\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2sms.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='mobileNo']")).sendKeys("9007272498");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("456557");
		driver.findElement(By.xpath("//*[contains(@src,'android')]")).click();
		String x=driver.getTitle();
		System.out.println(x);
		driver.switchTo().window("");
		driver.close();
		
		

	}

}
