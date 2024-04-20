import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegistrationTest extends BaseTest{


    @Test
    public void registration (){
        IndexPage indexPage = new IndexPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        indexPage.moveToRegistrationPage();
        registrationPage.Registration
                ("Abanob",
                        "Ashraf",
                        "slash",
                        "berebe2",
                        "slap",
                        "1",
                        "2",
                        "2",
                        "12231",
                        "01000223567",
                        "12334"
                );
        RegistrationSuccessMsgPage registrationSuccessMsgPage = new RegistrationSuccessMsgPage(driver);
        boolean isWelcomeMsgDisplayed = driver.findElement(registrationSuccessMsgPage.getSuccessMsg()).isDisplayed();
        Assert.assertTrue(isWelcomeMsgDisplayed);

    }


@Test
    public void passwordErrorRegistration (){
        RegistrationPage registrationPage = new RegistrationPage(driver);
        IndexPage indexPage = new IndexPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        indexPage.moveToRegistrationPage();
        registrationPage.Registration
                        ("1 ","2 ","3 ","4 ","5 ","6 ","7 ","8 ","9 ","10 ","11 ");
        RegistrationSuccessMsgPage registrationSuccessMsgPage = new RegistrationSuccessMsgPage(driver);
        boolean isWelcomeMsgDisplayed = driver.findElement(registrationSuccessMsgPage.getSuccessMsg()).isDisplayed();
        Assert.assertTrue(isWelcomeMsgDisplayed);

    }



}
