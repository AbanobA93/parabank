import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegistrationPage {
    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }
    //elements
    private By firstNameFiled = By.id("customer.firstName");
    private By lastNameFiled = By.id("customer.lastName");
    private By addressFiled = By.id("customer.address.street");
    private By cityFiled = By.id("customer.address.city");
    private By stateFiled= By.id("customer.address.state");
    private By zipCodeFiled = By.id("customer.address.zipCode");
    private By phoneNumberFiled = By.id("customer.phoneNumber");
    private By ssnFiled = By.id("customer.ssn");
    private By newUsernameFiled = By.id("customer.username");
    private By passwordFiled = By.id("customer.password");
    private By confirmPasswordFiled = By.id("repeatedPassword");
    private By registrationFinalButton = By.xpath("//input[@value=\"Register\"]");
    private By moveToOpenNewAccount = By.xpath("//a[text()=\"Open New Account\"]");



    // getters
        public By getCityFiled(){
        return cityFiled;
    }
        public By getRegistrationFinalButton(){
        return registrationFinalButton;
    }







    // methods

    public RegistrationSuccessMsgPage Registration (String firstName,
                              String lastName,
                              String address,
                              String city,
                              String state,
                              String userName,
                              String password,
                              String confirmPassword,
                              String zipCode,
                              String phoneNumber,
                              String ssn) {
        driver.findElement(firstNameFiled).sendKeys(firstName);
        driver.findElement(lastNameFiled).sendKeys(lastName);
        driver.findElement(addressFiled).sendKeys(address);
        driver.findElement(cityFiled).sendKeys(city);
        driver.findElement(stateFiled).sendKeys(state);
        driver.findElement(newUsernameFiled).sendKeys(userName);
        driver.findElement(passwordFiled).sendKeys(password);
        driver.findElement(confirmPasswordFiled).sendKeys(confirmPassword);
        driver.findElement(zipCodeFiled).sendKeys(zipCode);
        driver.findElement(phoneNumberFiled).sendKeys(phoneNumber);
        driver.findElement(ssnFiled).sendKeys(ssn);
        driver.findElement(registrationFinalButton).click();
        return new RegistrationSuccessMsgPage(driver);
        }

    public void clickOnOpenNewAccount(){
    driver.findElement(moveToOpenNewAccount).click();}
    }


