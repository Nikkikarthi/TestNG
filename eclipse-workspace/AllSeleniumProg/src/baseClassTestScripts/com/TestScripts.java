package baseClassTestScripts.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumBaseclass.com.BaseClasses;

public class TestScripts extends BaseClasses {
	 
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		driver = getBrowser("chrome");
		driver.get("https://www.facebook.com");
		
	    inputValuestoWebelement(driver.findElement(By.id("email")), "nikkithakarthi@gmail.com");
	    inputValuestoWebelement(driver.findElement(By.id("pass")), "ghjhghsdf");
	    clickonWebelement(driver.findElement(By.xpath("//input[@value='Log In']")));
	}

}
