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
    public void cssLocators() {
        //by tag name
        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));
        WebElement div2 = wd.findElement(By.xpath("//div"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_1 = wd.findElement(By.cssSelector("h1"));
        WebElement h1_2 = wd.findElement(By.xpath("//h1"));

        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a1 = wd.findElement(By.cssSelector("a"));
        WebElement a2 = wd.findElement(By.xpath("//a"));

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));
        WebElement button2 = wd.findElement(By.xpath("//button"));

        List<WebElement> list = wd.findElements(By.tagName("a"));
        List<WebElement> list1 = wd.findElements(By.cssSelector("a"));
        List<WebElement> list2 = wd.findElements(By.xpath("//a"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement input2 = wd.findElement(By.cssSelector("input"));
        WebElement input3 = wd.findElement(By.xpath("//input"));

        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));
        WebElement form3 = wd.findElement(By.xpath("//form"));

        WebElement body = wd.findElement(By.tagName("body"));
        WebElement body1 = wd.findElement(By.cssSelector("body"));
        WebElement body3 = wd.findElement(By.xpath("//body"));
    }

        // ====================================================================
        @Test
        public void cssLocators2() {

            //by class
            WebElement el1 = wd.findElement(By.className("active"));
            WebElement el2 = wd.findElement(By.cssSelector(".active"));
            WebElement el3 = wd.findElement(By.xpath("//*[@class = 'active']"));


            //by id
            WebElement el4 = wd.findElement(By.id("root"));
            WebElement el5 = wd.findElement(By.cssSelector("#root"));
            WebElement el6 = wd.findElement(By.xpath("//*[@id='root']"));


            //by attribute
            WebElement el7_1 = wd.findElement(By.cssSelector("[placeholder ='Password']"));
            WebElement el7 = wd.findElement(By.cssSelector("input[placeholder ='Password']"));
            WebElement el8 = wd.findElement(By.xpath("//input[@placeholder ='Email']"));

            //by attribute --> starts & ends & contains

            WebElement el13 = wd.findElement(By.cssSelector("input[placeholder ^='Em']"));
            WebElement el14 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Em')]"));

            WebElement el15 = wd.findElement(By.cssSelector("input[placeholder *='ai']"));
            WebElement el16 = wd.findElement(By.xpath("//input[contains(@placeholder,'ss')]"));

            WebElement el17 = wd.findElement(By.cssSelector("input[placeholder $='il']"));
            WebElement el18 = wd.findElement(By.xpath("//input[contains(@placeholder,'il')]"));
        }
//===============
            @Test
            public void classWork2feb() {
                //parent
                WebElement el = wd.findElement(By.xpath("//h1/parent::*"));
                WebElement el19 = wd.findElement(By.xpath("//h1/parent::div"));
               WebElement el20 = wd.findElement(By.xpath("//h1/.."));

                //ancestor
                WebElement el21 = wd.findElement(By.xpath("//h1/ancestor::*"));
                WebElement el22 = wd.findElement(By.xpath("//h1/ancestor::div"));
                WebElement el23 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));

                //ancestor or self
                WebElement el24 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
                List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

                //following-sibling
                List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

                //preceding-sibling
                WebElement h1 = wd.findElement(By.xpath("//a[last()]/preceding-sibling::h1"));
                List<WebElement> list_a = wd.findElements(By.xpath("//a[3]/preceding-sibling::a"));

            }
@Test
    public void classWork2 (){
        WebElement el = wd.findElement(By.cssSelector("[name ='login']"));
        String text = el.getText(); //get text from innerText
    System.out.println(text);

    WebElement form = wd.findElement(By.xpath("//form"));
    String textForm = form.getText();
    System.out.println("*************");
    System.out.println(textForm);

    WebElement body = wd.findElement(By.tagName("body"));
    String textAll = body.getText();
    System.out.println("*************");
    System.out.println(textAll);



}


}
