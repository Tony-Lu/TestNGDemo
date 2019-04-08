package test;




import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class PerformanceSample {

	@Test
	public void Testing() {

		WebDriver driver = new HtmlUnitDriver();
//		ChromeOptions options = new ChromeOptions();
//		// the below 2 steps CAN NOT be skipped, otherwise it will launch chrome minimize as an icon
//		options.addArguments("window-size=1400,800");			
//		options.addArguments("headless");
//		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.ca");
		System.out.println(driver.getTitle());
		driver.close();
		driver=null;
	}





}
