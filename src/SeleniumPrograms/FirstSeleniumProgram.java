package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FirstSeleniumProgram {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver", "D:\\Batch_2_manual testing_SQL\\Automation\\Softwares\\chromedriver.exe");
  
WebDriver driver= new ChromeDriver();
WebDriver driver1= new ChromeDriver();
driver.get("http://spicejet.com/"); // enter URL
driver.manage().window().maximize();
WebElement date = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
String dateVal = "30/12/2019";
Thread.sleep(5000);
selectDateByJS(driver, date, dateVal);

}


public static void selectDateByJS(WebDriver driver, WebElement element, String dateVal){
	JavascriptExecutor jse= (JavascriptExecutor)driver;
	String script= "arguments[0].setAttribute('value','"+dateVal+"');";
	jse.executeScript(script, element);
}

}   


	


