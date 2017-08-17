package Test1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/**
 * Unit test for simple App.
 */
public class AppTest 
   // extends TestCase
{


    public WebDriver driver = new ChromeDriver();

    @Before//opening the driver
    public void setUp() throws Exception {
        //invoke the driver
        System.setProperty("web.chrome.driver", "C:User\\user-pc\\IdealProject\\Test1\\chromedriver.exe");
        //driver = new ChromeDriver();
        //open url
        driver.get("http://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
    }

    @Test
    public void MyTest() {
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Rafeh");
        driver.findElement(By.id("LastName")).sendKeys("Ahmed");
        //driver.findElement(By.name("DateOfBirthDay"));
        Select dropdown = new Select(driver.findElement(By.name("DateOfBirthDay")));
        dropdown.selectByIndex(6);
        Select dropdown2 = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        dropdown2.selectByVisibleText("June");
        Select dropdown3 = new Select(driver.findElement(By.name("DateOfBirthYear")));
        dropdown3.selectByVisibleText("1982");
        Select dropdown4 = new Select(driver.findElement(By.name("DateOfBirthYear")));
        //dropdown4.selectBy
    }


}