package seleniumMethods.com;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class DropDownProg {
		public static void chromeBrowserLaunch() throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");

			WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
			Select daydd = new Select(day);
			daydd.selectByIndex(20);
			
			WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			Select monthdd = new Select(month);
			monthdd.selectByValue("3");
			
			
			WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	        Select yeardd = new Select(year);	
	        yeardd.selectByVisibleText("2016");
	        Thread.sleep(2000);
	        
	        driver.quit();
	        }

	public static void main(String[] args) throws InterruptedException {
		chromeBrowserLaunch();
		
	}}


