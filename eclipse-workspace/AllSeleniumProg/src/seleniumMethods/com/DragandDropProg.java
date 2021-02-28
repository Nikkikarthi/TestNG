package seleniumMethods.com;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class DragandDropProg {
		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://demo.guru99.com/test/drag_drop.html");
	        
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        
	        WebElement bank = driver.findElement(By.xpath("//li[@id='credit2']"));
	        WebElement place1 = driver.findElement(By.xpath("//ol[@id='bank']"));
	        
	        Actions ma = new Actions(driver);
	        ma.dragAndDrop(bank, place1).build().perform();
	        Thread.sleep(2000);
	        
	        WebElement amount1 = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
	        WebElement place2 = driver.findElement(By.xpath("//ol[@id='amt7']"));
	        
	        ma.dragAndDrop(amount1, place2).build().perform();
	        Thread.sleep(2000);

	        
	        WebElement sales = driver.findElement(By.xpath("//li[@id='credit1']"));
	        WebElement place3 = driver.findElement(By.xpath("//ol[@id='loan']"));
	        
	        ma.dragAndDrop(sales, place3).build().perform();
	        Thread.sleep(2000);

	        
	        WebElement amount2 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
	        WebElement place4 = driver.findElement(By.xpath("//ol[@id='amt8']"));
	        
	        ma.dragAndDrop(amount2, place4).build().perform();
	        Thread.sleep(2000);
	        
	        driver.quit();
		}

	}



