package seleniumMethods.com;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class IsOptionsProg {
		public static void chromeBrowserLaunch() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\AllSeleniumProg\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();

			//Thread.sleep(2000);
			
			WebElement emailfield = driver.findElement(By.id("email"));
			boolean displayed = emailfield.isDisplayed();  //to check whether the email is present or not in dom
			boolean enabled = emailfield.isEnabled();    //to check the text box is enabled or not to provide the input
			if(displayed&&enabled) {
				emailfield.clear();   // to clear before values if present
				emailfield.sendKeys("Hello");
			}
			String attribute = emailfield.getAttribute("value");  
			System.out.println(attribute);
			WebElement radiobtn = driver.findElement(By.xpath("//input[@value='1']"));
			radiobtn.click();
			boolean selected = radiobtn.isSelected();  //to check whether the tickbox or check box is selected or not in dom 
			System.out.println("Radio button ="+selected);
			
			String text = driver.findElement(By.xpath("//div[@class='_5iyx']")).getText();
			System.out.println("get text for facebook header "+text);
			
			WebElement mobfield = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
			String attribute2 = mobfield.getAttribute("class");
			//mobfield.getTagName();
			System.out.println("class attribute value "+attribute2);
			
			WebElement month = driver.findElement(By.id("month"));
			Select s = new Select(month);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			String beforeSelecting = firstSelectedOption.getText();
			System.out.println("Before Selecting = "+beforeSelecting);
			s.selectByValue("5");
			WebElement firstSelectedOption2 = s.getFirstSelectedOption();
			String afterSelecting = firstSelectedOption2.getText();
			System.out.println("After selecting = "+afterSelecting);
			System.out.println("Options in month Dropdown");
			List<WebElement> options = s.getOptions();
			for (int i = 0; i < options.size(); i++) {
				System.out.println(options.get(i).getText());
				Thread.sleep(4000);
				
				driver.quit();
				
			}
	}
	public static void main(String[] args) throws InterruptedException {
		chromeBrowserLaunch();
	}}


