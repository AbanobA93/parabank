import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class RequestLoanPage {
    private WebDriver driver;
    public RequestLoanPage(WebDriver driver){this.driver=driver;}
    //elements
    private By loanAmountFiled = By.id("amount");
    private By downPaymentFiled = By.id("downPayment");
    private By applyButton = By.xpath("//input[@class=\"button\"]");



    //methods

    public LoanRequestProcessedPage requestLoan(String amount, String downPayment){
        driver.findElement(loanAmountFiled).sendKeys(amount);
        driver.findElement(downPaymentFiled).sendKeys(downPayment);
        //WebElement drpFromAccount = driver.findElement(By.id("fromAccountId"));
        //Select dropFromAccount = new Select(drpFromAccount);
        //dropFromAccount.selectByVisibleText("19671");
        driver.findElement(applyButton).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return new LoanRequestProcessedPage(driver);


    }

}
