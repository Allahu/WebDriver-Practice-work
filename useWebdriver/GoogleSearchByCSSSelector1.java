package useWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchByCSSSelector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement searchButton = driver.findElement(By.cssSelector("#gs_htif0"));
		System.out.println(searchButton.getText());

		//WebElement searchButton2 = driver.findElement(By.cssSelector("#flrs>a[href='/intl/en/about.html']"));    
		//System.out.println(searchButton.getText()); 

	}

}
