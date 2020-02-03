import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String args[]){
        System.out.println("Selenium");
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");

        WebDriver browser = new ChromeDriver();
        browser.get("https://www.bing.com");

        WebElement searchField = browser.findElement(By.id("sb_form_q"));
        searchField.sendKeys("Baranauskas");
        searchField.sendKeys(Keys.ENTER);

        browser.close();
    }
}
