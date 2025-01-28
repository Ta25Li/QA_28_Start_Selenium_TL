import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver  wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }
    @Test
    public void cssLocators(){
        //by tag name
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement a = wd.findElement(By.tagName("a"));
        WebElement button = wd.findElement(By.tagName("button"));
        List<WebElement> list = wd.findElements(By.tagName("a"));
        WebElement input = wd.findElement(By.tagName("input"));
        WebElement form = wd.findElement(By.tagName("form"));

    }
}
