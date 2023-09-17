package dailypractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		String driverPath = System.setProperty("webdriver.driver.chrome","\"C:\\Program Files\\chrome-win64\\chrome.exe\"");
		   System.out.println(driverPath);
		   // Launch the browser
		   ChromeOptions options = new ChromeOptions();
		   options.addArguments("--remote-allow-origins=*");
		   DesiredCapabilities capabilities = new DesiredCapabilities();
		   capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		   options.merge(capabilities);
		   ChromeDriver driver = new ChromeDriver(options);
		   driver.manage().window().maximize();
		   
		   driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		   //Simple Alert
		   driver.findElement(By.xpath("//div[@class='col-lg-6']/input[@name='alert']")).click();
		   Alert alert = driver.switchTo().alert();
		   System.out.println(alert.getText());
		   Thread.sleep(5000);
		   alert.accept();
		   
		   //Confirmation Alert
		   driver.findElement(By.xpath("//div[@class='col-lg-6']/input[@name='confirmation']")).click();
		   Alert confirm = driver.switchTo().alert();
		   System.out.println(confirm.getText());
		   Thread.sleep(5000);
		   confirm.dismiss();
		   
		   //Prompt
		   driver.findElement(By.xpath("//div[@class='col-lg-6']/input[@name='prompt']")).click();
		   Alert prompt = driver.switchTo().alert();
		   prompt.sendKeys("Hello");
		   Thread.sleep(3000);
		   System.out.println(prompt.getText());
		   prompt.accept();
	}

}
