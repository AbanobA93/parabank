import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    public WebDriver driver;


    @BeforeMethod
    public void setDriver(){
        driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
    }

    //@AfterMethod
    //public void tearDown (){
    //driver.quit();
    //}

}
