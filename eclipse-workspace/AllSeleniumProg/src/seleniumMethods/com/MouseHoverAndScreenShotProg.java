package seleniumMethods.com;

	import java.io.File;
	import java.io.IOException;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class MouseHoverAndScreenShotProg {
		public static void mouseAction1() throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
			driver.manage().window().maximize();
			
			WebElement signin = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
			
			WebElement insign = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
			
			Actions ma =new Actions(driver);
			ma.moveToElement(signin).build().perform();
			
			Thread.sleep(2000);
			ma.click(insign).build().perform();
			
			driver.navigate().back();
			
			WebElement category = driver.findElement(By.xpath("//span[text()='Shop by']"));
			
			WebElement music = driver.findElement(By.xpath("(//span[text()='Amazon Prime Music'])[1]"));
			
			WebElement player = driver.findElement(By.xpath("(//span[text()='Open web player'])[1]"));
			
			Thread.sleep(2000);
			Actions ma1 =new Actions(driver);
			ma1.moveToElement(category).build().perform();
			
			Actions ma2 =new Actions(driver);
			ma2.moveToElement(music).build().perform();
			
			Thread.sleep(2000);
			ma2.click(player).build().perform();
			
			// To take Screenshot
			File des = new File("C:\\Users\\Home Pc\\eclipse-workspace\\AllSeleniumProg\\Screenshots\\test.png");
			TakesScreenshot ts = (TakesScreenshot)driver;
			File ssrc = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ssrc, des);
			
			Thread.sleep(2000);
			driver.quit();
			
			
	}
		public static void main(String[] args) throws InterruptedException, IOException {
			mouseAction1();
		}
		}

