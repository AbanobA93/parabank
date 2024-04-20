import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfileUpdatedPage {
    private WebDriver driver;
    public ProfileUpdatedPage(WebDriver driver){
        this.driver=driver;
    }
    //elements
    private By profileUpdatedMsg = By.xpath("//h1[@class=\"title\"]");
    private By moveToRequestLoanPage = By.xpath("//a[text()=\"Request Loan\"]");

    //getters
    public By getProfileUpdatedMsg (){return profileUpdatedMsg;}

    //methods
    public RequestLoanPage setMoveToRequestLoanPage(){driver.findElement(moveToRequestLoanPage).click();
    return new RequestLoanPage(driver);}

}
