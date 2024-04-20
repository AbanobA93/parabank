import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class OpenNewAccountPage {
    private WebDriver driver;

    public OpenNewAccountPage(WebDriver driver){
        this.driver=driver;
    }

    //elements

    public OpenNewAccountPage accountType(){
        WebElement drpAccountType = driver.findElement(By.id("type"));
        Select dropdownAccountType = new Select(drpAccountType);
        dropdownAccountType.selectByVisibleText ("CHECKING");
        return this;

    }

    public OpenNewAccountPage existingAccount(){
        WebElement drpExistingAccount = driver.findElement(By.id("fromAccountId"));
        Select dropdownExistingAccount = new Select(drpExistingAccount);
        dropdownExistingAccount.selectByIndex(0);
        return this;
    }


    private By createNewAccountButton = By.xpath("//input[@class=\"button\"]");



    public AccountOpenedPage createNewAccount(){
        driver.findElement(createNewAccountButton).click();
        return new AccountOpenedPage(driver);
    }


}
