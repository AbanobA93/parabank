import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BillPayTest extends BaseTest{
    @Test
    public void BillPayTest(){
        IndexPage indexPage = new IndexPage(driver);
        indexPage.login("1","1");
        AccountOpenedPage accountOpenedPage = new AccountOpenedPage(driver);
        accountOpenedPage.moveToBillPayPage().payBill("bara","pro","wqe","wqdw","12345","0099578","12345","12345","100").moveToTransferPage();
        //assertion
        BillPaymentCompletePage billPaymentCompletePage = new BillPaymentCompletePage(driver);
        boolean isBillPaymentCompleteMsgDisplayed;
        isBillPaymentCompleteMsgDisplayed = driver.findElement(billPaymentCompletePage.getBillPaymentCompleteMsg()).isDisplayed();
        Assert.assertTrue(isBillPaymentCompleteMsgDisplayed);

  }
  @Test
    public void BillPayTestFail(){
        IndexPage indexPage = new IndexPage(driver);
        indexPage.login("1","1");
        AccountOpenedPage accountOpenedPage = new AccountOpenedPage(driver);
        accountOpenedPage.moveToBillPayPage().payBill("","","","","","","","","");
        BillPayPage billPayPage = new BillPayPage(driver);

        //assertion
        boolean isErrorMessagesDisplayed = driver.findElement(billPayPage.getCityIsRequired()).isDisplayed();
        Assert.assertTrue(isErrorMessagesDisplayed);
  }


}
