package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POJOclass {
	public static WebDriver OpenBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO-PC\\Desktop\\New folder\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
     return driver;
}
}