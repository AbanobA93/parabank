import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class OpenNewAccountTest extends BaseTest {

    @Test
    public void openNewCheckingAccount() {
        OpenNewAccountPage openNewAccountPage = new OpenNewAccountPage(driver);
        IndexPage indexPage = new IndexPage(driver);
        indexPage.login("2","2").moveToRegistrationPage().clickOnOpenNewAccount();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        openNewAccountPage.accountType();
        openNewAccountPage.existingAccount();
        openNewAccountPage.createNewAccount();
        AccountOpenedPage accountOpenedPage = new AccountOpenedPage(driver);
        boolean isNewAccountOpenedMsgDisplayed = driver.findElement(accountOpenedPage.getNewAccountOpenedMsg()).isDisplayed();
        Assert.assertTrue(isNewAccountOpenedMsgDisplayed);


    }

}
