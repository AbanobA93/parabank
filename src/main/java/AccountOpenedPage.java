import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountOpenedPage {
    private WebDriver driver;
    public AccountOpenedPage (WebDriver driver){
        this.driver=driver;
    }
    //elements
    private static By newAccountOpenedMsg = By.xpath("//h1[@class=\"title\"]");
    private By moveToBillPayPage = By.xpath("//a[text()=\"Bill Pay\"]");
    //getter
    public By getNewAccountOpenedMsg(){
        return newAccountOpenedMsg;
    }
    //methods

    public BillPayPage moveToBillPayPage(){
        driver.findElement(moveToBillPayPage).click();
        return new BillPayPage(driver);
    }


}
