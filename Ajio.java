package week3.day2assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");

		// In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);

		// To the left of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();

		Thread.sleep(2000);

		// Under "Category" click "Fashion Bags"
		driver.findElementByXPath("//label[@for='Men - Fashion Bags']").click();

		// Print the count of the items Found
		String count = driver.findElement(By.className("length")).getText();
		System.out.println("The total items are: " + count);

		// Get the list of brand of the products displayed in the page and print the
		// list
		System.out.println("*****List of Brands*****");
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		System.out.println(" Size is:" + brandList.size());

		for (WebElement webElement : brandList) {
			String text = webElement.getText();
			System.out.println(text);
		}

		// Get the list of names of the bags and print it
		System.out.println("*****List of Name*****");
		List<WebElement> nameList = driver.findElements(By.className("name"));
		System.out.println(" Size is:" + nameList.size());

		for (WebElement webElement : nameList) {
			String text = webElement.getText();
			System.out.println(text);
		}

	}

}
