package useWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchByXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement searchButton = driver.findElement(By.xpath(".//*[@id='gbqfba']"));
		System.out.println(searchButton.getText());
	}

}
