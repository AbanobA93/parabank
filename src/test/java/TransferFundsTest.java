import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TransferFundsTest extends BaseTest{
    @Test
    public void transferFundsTest(){
        IndexPage indexPage = new IndexPage(driver);
        indexPage.login("1","1");
        BillPaymentCompletePage billPaymentCompletePage = new BillPaymentCompletePage(driver);
        billPaymentCompletePage.moveToTransferPage().amountFiled("100").setTransferButton();
        //assertion
        TransferCompletePage transferCompletePage = new TransferCompletePage(driver);
        boolean isTransferCompleteMsgDisplayed = driver.findElement(transferCompletePage.getTransferCompleteMsg()).isDisplayed();
        Assert.assertTrue(isTransferCompleteMsgDisplayed);
        transferCompletePage.setMoveToUpdateContactInfo();


    }


}
