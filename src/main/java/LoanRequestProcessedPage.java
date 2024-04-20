import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoanRequestProcessedPage {
    private WebDriver driver;
    public LoanRequestProcessedPage(WebDriver driver){this.driver=driver;}

    //elements
    private By statusApproved = By.xpath("//td[text()=\"Approved\"]");
    private By statusDenied = By.xpath("//td[text()=\"Denied\"]");
    private By error = By.xpath("//h1[@class=\"title\"]");

    //getters
    public By getStatusApproved(){return statusApproved;}
    public By getStatusDenied(){return statusDenied;}
    public By getError(){return error;}
}
