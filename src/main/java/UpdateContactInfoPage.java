import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class UpdateContactInfoPage {
    private WebDriver driver;

    public  UpdateContactInfoPage(WebDriver driver){
        this.driver=driver;
    }
    //elements
   private By firstNameFiled = By.xpath("//input[@id=\"customer.firstName\"]");
   private By lastNameFiled = By.xpath("//input[@id=\"customer.lastName\"]");
   private By addressFiled = By.xpath("//input[@id=\"customer.address.street\"]");
   private By cityFiled = By.xpath("//input[@id=\"customer.address.city\"]");
   private By stateFiled = By.xpath("//input[@id=\"customer.address.state\"]");
   private By zipCodeFiled = By.xpath("//input[@id=\"customer.address.zipCode\"]");
   private By phoneNumberFiled = By.xpath("//input[@id=\"customer.phoneNumber\"]");
   private By updateProfileButton = By.xpath("//input[@class=\"button\"] ");
   private By firstNameRequiredMsg = By.xpath("//span[text()=\"First name is required.\"]");
   private By lastNameRequiredMsg = By.xpath("//span[text()=\"Last name is required.\"]");
   private By addressRequiredMsg = By.xpath("//span[text()=\"Address is required.\"]");
   private By cityRequiredMsg = By.xpath("//span[text()=\"City is required.\"]");
   private By stateRequiredMsg = By.xpath("//span[text()=\"State is required.\"]");
   private By zipCodeRequiredMsg = By.xpath("//span[text()=\"Zip Code is required.\"]");

   public ProfileUpdatedPage updateContactInfo (
                                  String lastName,
                                  String address,
                                  String city,
                                  String state,
                                  String zipCode,
                                  String phone){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(firstNameFiled).sendKeys (Keys.chord(Keys.CONTROL,"clear"), "Abanob");
        driver.findElement(lastNameFiled).sendKeys(lastName);
        driver.findElement(addressFiled).sendKeys(address);
        driver.findElement(cityFiled).sendKeys(city);
        driver.findElement(stateFiled).sendKeys(state);
        driver.findElement(zipCodeFiled).sendKeys(zipCode);
        driver.findElement(phoneNumberFiled).sendKeys(phone);
        driver.findElement(updateProfileButton).click();

        return new ProfileUpdatedPage(driver);

   }
}
