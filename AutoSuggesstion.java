package dailypractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AutoSuggesstion {

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
		   
		   driver.get("https://www.google.com/");
		   WebElement qt = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		   qt.click();
		   Thread.sleep(3000);
		   qt.sendKeys("Quality Thought");
		   
		   List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		   System.out.println(elements.size());
		   for(WebElement we : elements)
		   {
			   String element = we.getText();
			   //System.out.println(element);
			   if(element.equalsIgnoreCase("Quality Thought reviews")) {
				   we.click();
				   break;
			   }
		   }
		   
		   
		   
	}

}
