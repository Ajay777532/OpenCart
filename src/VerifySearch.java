import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySearch {
	public static void main(String[] args) {
		// Initialize the ChromeDriver
		WebDriver driver = new ChromeDriver();

		try {
			// Navigate to the website (e.g., Google)
			driver.get("https://www.google.com");

			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("OpenCart");

			WebElement searchButton = driver.findElement(By.name("btnK"));
			searchButton.click();

			Thread.sleep(2000);

			String pageTitle = driver.getTitle();

			if (pageTitle.contains("OpenCart")) {
				System.out.println("Search verification passed! The search query is in the title.");
			} else {
				System.out.println("Search verification failed! The search query is not in the title.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			driver.quit();
		}
	}
}
