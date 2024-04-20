import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class TransferFundsPage {
    private WebDriver driver;

    public TransferFundsPage(WebDriver driver) {
        this.driver = driver;
    }
    //elements
    private By transferAmountFiled = By.xpath("//input[@id=\"amount\"] ");
    private By transferButton = By.xpath("//input[@class=\"button\"]");

    //Drop Lists
    public void fromAccount(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement drpListFromAccount = driver.findElement(By.xpath("//select [@id=\"fromAccountId\"]"));
        Select dropListFromAccount = new Select(drpListFromAccount);
        dropListFromAccount.selectByVisibleText("15009");


    }
    public TransferFundsPage toAccount(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement dropListToAccount = driver.findElement(By.xpath("\"//select [@id=\\\"toAccountId\\\"]\""));
        Select drpListToAccount = new Select(dropListToAccount);
        drpListToAccount.selectByVisibleText("15009");
        return this;
    }

    //methods
    public TransferFundsPage amountFiled(String dollars) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(transferAmountFiled).sendKeys(dollars);
        return this;
    }
    public TransferCompletePage setTransferButton(){
        driver.findElement(transferButton).click();
        return new TransferCompletePage(driver);
    }

}
