package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GlobalParameters {   //No.143
	public WebDriver driver = null;
	
	@BeforeClass
	public void Login_GlobalPara() throws IOException {
		
		System.out.println("Before BeforeMethod ===== testng Login_GlobalPara");
		Properties prop = new Properties();
		FileInputStream fls = new FileInputStream("F:\\Java\\TestNGDemo\\src\\test\\configData.properties");
		prop.load(fls);
		
		System.out.println(prop.getProperty("username"));
		
		if(prop.getProperty("browser").contains("chrome")) {
			driver= new ChromeDriver();
			
		}
		else if(prop.getProperty("browser").contains("firefox")){
			driver = new FirefoxDriver();
		}
		else {
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
	
	}
	
	@AfterClass
	public void CloseBrowser() {
		
		driver.close();
		driver.quit();
		System.out.println("AfterMethod ===== testng CloseBrowser");
		
	}
	
	@Test
	public void GlobalPara_A_Test() {
		
		System.out.println("testng GlobalPara_A_Test");	
		
		
		
		
	}
	
	@Test
	public void GlobalPara_B_Test() {
		
		System.out.println("testng GlobalPara_B_Test");
	}

}
