import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void validLogin(){
    IndexPage indexPage = new IndexPage(driver);

    indexPage.login("2","2");
    boolean isAccountOverViewDisplayed = driver.findElement(indexPage.getAccountsOverView()).isDisplayed();
    Assert.assertTrue(isAccountOverViewDisplayed);
    }






    @Test
    public void invalidLogin (){
        IndexPage indexPage = new IndexPage(driver);
        indexPage.login("2","wdasaw");
        boolean isErrorMsgDisplayed = driver.findElement(indexPage.getErrorMsg()).isDisplayed();
        Assert.assertTrue(isErrorMsgDisplayed);

    }




}
