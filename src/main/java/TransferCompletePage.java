import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferCompletePage {
    WebDriver driver;
    public TransferCompletePage(WebDriver driver){
        this.driver=driver;
    }
    //elements
    private By transferCompleteMsg = By.xpath("//h1[@class=\"title\"] ");
    private By moveToUpdateContactInfo = By.xpath("//a[text()=\"Update Contact Info\"]");

    //getters
    public By getTransferCompleteMsg(){
      return transferCompleteMsg;
    }

    public UpdateContactInfoPage setMoveToUpdateContactInfo(){
        driver.findElement(moveToUpdateContactInfo).click();
        return new UpdateContactInfoPage(driver);
    }

}
