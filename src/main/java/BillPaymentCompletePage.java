import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPaymentCompletePage {
    private WebDriver driver;

    public BillPaymentCompletePage(WebDriver driver) {
        this.driver=driver;
    }


    //elements
    private By billPaymentCompleteMsg = By.xpath("//p[contains(text(), 'was successful')]");
    private By transferFundsButton = By.xpath("//a[text()=\"Transfer Funds\"]");


    //getter
    public By getBillPaymentCompleteMsg(){
      return   billPaymentCompleteMsg;
    }

    //move to transfer FundsButton
    public TransferFundsPage moveToTransferPage(){
        driver.findElement(transferFundsButton).click();
        return new TransferFundsPage(driver);
    }


}
