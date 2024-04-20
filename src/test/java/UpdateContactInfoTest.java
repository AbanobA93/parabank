import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateContactInfoTest extends BaseTest{
    @Test
    public void updateContactInfo(){
        IndexPage indexPage = new IndexPage(driver);
        indexPage.login("1","1");
        TransferCompletePage transferCompletePage = new TransferCompletePage(driver);
        transferCompletePage.setMoveToUpdateContactInfo().updateContactInfo("","","","","","").getProfileUpdatedMsg();
        ProfileUpdatedPage profileUpdatedPage = new ProfileUpdatedPage(driver);
        //assertion
        boolean isProfileUpdatedMsgDisplayed = driver.findElement(profileUpdatedPage.getProfileUpdatedMsg()).isDisplayed();
        Assert.assertTrue(isProfileUpdatedMsgDisplayed);
    }


}
