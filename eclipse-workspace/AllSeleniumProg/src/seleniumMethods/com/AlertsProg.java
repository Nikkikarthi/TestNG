package seleniumMethods.com;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class AlertsProg {
		public static void diffAlerts() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
			
			driver.manage().window().maximize();
			
			WebElement simple = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
			simple.click();
			Thread.sleep(2000);
			Alert simpleAlert = driver.switchTo().alert();
			//ok - accept, cancel - dismiss
			simpleAlert.accept();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();		
		
			WebElement confirm = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
			confirm.click();
			Thread.sleep(2000);
			Alert confirmAlert = driver.switchTo().alert();
			confirmAlert.dismiss();
			Thread.sleep(2000);
			driver.switchTo().defaultContent();		
			
			WebElement prompt = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
		prompt.click();
		Thread.sleep(2000);
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Greens");
		promptAlert.accept();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();	
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
		}
	public static void main(String[] args) throws InterruptedException {
		diffAlerts();
		}}



