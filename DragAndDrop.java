package dailypractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DragAndDrop {

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
		   
		   driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		   WebElement from=  driver.findElement(By.id("draggable"));
		   WebElement to =  driver.findElement(By.id("droppable"));
		   Actions act = new Actions(driver);
		   Thread.sleep(5000);
		   act.dragAndDrop(from, to).build().perform();

	}

}
