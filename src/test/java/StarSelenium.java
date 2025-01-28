import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StarSelenium {

    WebDriver wd;

    @Test
    public void test(){
        wd = new ChromeDriver(); // open browser
     //   wd.get("https://telranedu.web.app/home");  //go to the link --not saving history of moving, navigating actions
        wd.navigate().to("https://telranedu.web.app/home"); //go to the link -- saving navigations
        wd.navigate().back(); // вернуться на шаг назад
        wd.navigate().forward();
        wd.navigate().refresh();

     //   wd.close(); // close only one tab and browser
        wd.quit(); // close all the tabs and browser

    }


}
