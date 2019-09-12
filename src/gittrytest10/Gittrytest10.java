package gittrytest10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gittrytest10 {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Alex\\WorkFolder\\Gittry10\\lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		
		
	}

}
