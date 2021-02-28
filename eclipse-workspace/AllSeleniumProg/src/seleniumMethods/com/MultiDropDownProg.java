package seleniumMethods.com;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class MultiDropDownProg {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home Pc\\eclipse-workspace\\GreenTech\\Drivers\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		    
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    
		    //parent xpath for multi drop down
		    WebElement SelectOption = driver.findElement(By.id("multi-select"));
		    
		    Select s = new Select(SelectOption);
		    
		    // to check whether the options are selected or not
		    boolean multiple = s.isMultiple();
		    System.out.println(multiple);
		    
		    if (multiple) {
		    	s.selectByVisibleText("California");
		    	s.selectByValue("New York");
		    	s.selectByIndex(4);
		    	
		    	List<WebElement> all = s.getAllSelectedOptions(); 
		    	for (int i = 0; i < all.size(); i++) {
		    		System.out.println(all.get(i).getText()); // to get all text which we have selected in dropdown
					
				}
			Thread.sleep(5000);	
			
			//s.deselectByVisibleText("California");
			s.deselectAll();
			Thread.sleep(5000);
			
			driver.quit();
			}
	   }
	}


