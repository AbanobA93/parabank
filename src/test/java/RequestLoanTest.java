import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RequestLoanTest extends BaseTest{
    @Test
    public void requestApprovedLoanTest(){
        IndexPage indexPage = new IndexPage(driver);
        indexPage.login("1","1");
        ProfileUpdatedPage profileUpdatedPage = new ProfileUpdatedPage(driver);
        profileUpdatedPage.setMoveToRequestLoanPage().requestLoan("1000","200").getStatusApproved();
        LoanRequestProcessedPage loanRequestProcessedPage = new LoanRequestProcessedPage(driver);
        boolean isLoanAcceptedMsgDisplayed = driver.findElement(loanRequestProcessedPage.getStatusApproved()).isDisplayed();
                Assert.assertTrue(isLoanAcceptedMsgDisplayed);
    }
    @Test
    public void requestUnlogicalLoanTest(){
        //((FLECKY))
        IndexPage indexPage = new IndexPage(driver);
        indexPage.login("1","1");
        ProfileUpdatedPage profileUpdatedPage = new ProfileUpdatedPage(driver);
        profileUpdatedPage.setMoveToRequestLoanPage().requestLoan("1","1").getError();
        //assertion

        LoanRequestProcessedPage loanRequestProcessedPage = new LoanRequestProcessedPage(driver);
        boolean isErrorMsgDisplayed = driver.findElement(loanRequestProcessedPage.getError()).isDisplayed();
                Assert.assertTrue(isErrorMsgDisplayed);
    } @Test
    public void requestDeniedLoanTest(){
        IndexPage indexPage = new IndexPage(driver);
        indexPage.login("1","1");
        ProfileUpdatedPage profileUpdatedPage = new ProfileUpdatedPage(driver);
        profileUpdatedPage.setMoveToRequestLoanPage().requestLoan("1.5","1").getStatusDenied();
        LoanRequestProcessedPage loanRequestProcessedPage = new LoanRequestProcessedPage(driver);
        //assertion
        boolean isDeniedMsgDisplayed = driver.findElement(loanRequestProcessedPage.getStatusDenied()).isDisplayed();
                Assert.assertTrue(isDeniedMsgDisplayed);
    }
}
