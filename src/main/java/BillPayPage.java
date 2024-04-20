import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class BillPayPage {
    WebDriver driver;
            public BillPayPage(WebDriver driver){
                this.driver=driver;
            }
    //elements
    private By payeeNameFiled = By.xpath("//input[@name=\"payee.name\"]");
    private By payeeAddressFiled = By.xpath("//input[@name=\"payee.address.street\"]");
    private By payeeCityFiled = By.xpath("//input[@name=\"payee.address.city\"]");
    private By payeeStateFiled = By.xpath("//input[@name=\"payee.address.state\"]");
    private By payeeZipCodeFiled = By.xpath("//input[@name=\"payee.address.zipCode\"]");
    private By payeePhoneFiled = By.xpath("//input[@name=\"payee.phoneNumber\"]");
    private By payeeAccountNumberFiled = By.xpath("//input[@name=\"payee.accountNumber\"]");
    private By payeeVerifyAccountNumberFiled = By.xpath("//input[@name=\"verifyAccount\"]");
    private By amountFiled = By.xpath("//input[@name=\"amount\"]");
    private By sendPaymentButton = By.xpath("//input[@class=\"button\"]");
    private By nameIsRequired = By.xpath("//span[text()=\"Payee name is required.\"]");
    private By addressIsRequired = By.xpath("//span[text()=\"Address is required.\"]");
    private By cityIsRequired = By.xpath("//span[text()=\"City is required.\"]");
    private By stateIsRequired = By.xpath("//span[text()=\"State is required.\"]");
    private By zipCodeIsRequired = By.xpath("//span[text()=\"Zip Code is required.\"]");
    private By phoneNumberIsRequired = By.xpath("//span[text()=\"Phone number is required.\"]");



    //getter

    public By getCityIsRequired(){
        return cityIsRequired;
    }


    //methods

    public BillPaymentCompletePage payBill (String payeeName,
                         String payeeAddress,
                         String payeeCity,
                         String payeeState,
                         String payeeZipCode,
                         String payeePhone,
                         String AccountNumber,
                         String VerifyAccountNumber,
                         String amount){
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.findElement(payeeNameFiled).sendKeys(payeeName);
     driver.findElement(payeeAddressFiled).sendKeys(payeeAddress);
     driver.findElement(payeeCityFiled).sendKeys(payeeCity);
     driver.findElement(payeeStateFiled).sendKeys(payeeState);
     driver.findElement(payeeZipCodeFiled).sendKeys(payeeZipCode);
     driver.findElement(payeePhoneFiled).sendKeys(payeePhone);
     driver.findElement(payeeAccountNumberFiled).sendKeys(AccountNumber);
     driver.findElement(payeeVerifyAccountNumberFiled).sendKeys(VerifyAccountNumber);
     driver.findElement(amountFiled).sendKeys(amount);
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     WebElement drpFromAccount = driver.findElement(By.xpath("//select[@name=\"fromAccountId\"]"));
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     Select dropdownFromAccount = new Select(drpFromAccount);
     dropdownFromAccount.selectByIndex(0);
     driver.findElement(sendPaymentButton).click();
     return new BillPaymentCompletePage(driver);


    }



}



