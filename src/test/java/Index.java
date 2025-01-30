import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("file:///D:/Study/QA/Auto/21.index.html");
    }

    @Test
    public void tableTest(){
        //Canada
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals(canada.getText(),"Canada");
    }



    @Test
    public void cssLocators(){
        //by tag name
       WebElement button = wd.findElement(By.tagName("button"));
       WebElement button1 = wd.findElement(By.cssSelector("button"));

       WebElement a = wd.findElement(By.tagName("a"));
       WebElement a1 = wd.findElement(By.cssSelector("a"));

        List<WebElement> listA = wd.findElements(By.tagName("a"));
        List<WebElement> listA1 = wd.findElements(By.cssSelector("a"));

        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));

        //by class
        WebElement div = wd.findElement(By.className("container"));
        WebElement div1 = wd.findElement(By.cssSelector(".container"));  // dot name - means looking for class not just element

        List<WebElement> a_list = wd.findElements(By.className("nav-item"));
        List<WebElement> a_list1 = wd.findElements(By.cssSelector(".nav-item"));

        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav1 = wd.findElement(By.cssSelector("#nav")); // indicate that search by id

        WebElement form2 = wd.findElement(By.id("form1"));
        WebElement form3 = wd.findElement(By.cssSelector("#form1"));

        //by attribute
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder = 'Type your name']"));
        //start
        WebElement inputEmail1 = wd.findElement(By.cssSelector("[placeholder ^= 'Type']")); //starts with
        //ends
        WebElement inputEmail2 = wd.findElement(By.cssSelector("[placeholder $= 'name']")); //end word
        //contains
        WebElement inputEmail3 = wd.findElement(By.cssSelector("[placeholder *= 'your']"));

        WebElement a2 = wd.findElement(By.cssSelector("[href = '#item3']"));

        //by name
        WebElement inputS = wd.findElement(By.name("surename"));
        WebElement inputS1 = wd.findElement(By.cssSelector("[name = 'surename']"));



        //linkText --old and slow
    //    WebElement a3 = wd.findElement(By.linkText("Item 1"));

        //partialLinkText -- old and slow
     //   WebElement a3 = wd.findElement(By.partialLinkText("m 1"));

       /*
       * - find any elements
       *div -
      * # id
      * .class
      * [name = 'value'] - attribute
      * .c1.c2 - find 2 classes
      * a#id.c1.c2
        *
        *  ul li:nth-child(3)   ---найти 3го дочернего li по списку
        * tr:nth-child(3) td:last-child
         */



    }

}
