import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage {
    private WebDriver driver;

    public IndexPage (WebDriver driver) {
        this.driver = driver;
    }

    //elements
    private By registerPageButton = By.xpath("//a[text()=\"Register\"]");
    private By usernameFiled = By.xpath("//input[@name=\"username\"]");
    private By passwordFiled = By.xpath("//input[@name=\"password\"]");
    private By errorMsg = By.xpath("//p[@class=\"error\"]");
    private By loginButton = By.xpath("//input[@type=\"submit\"]");
    private By accountsOverView = By.xpath("//th[text()=\"Account\"]");


    //getter

    public By getErrorMsg(){
        return errorMsg;
    }

    public By getAccountsOverView(){
        return accountsOverView;
    }



    //Login Methods
    public IndexPage login (String username, String password){
    driver.findElement(usernameFiled).sendKeys(username);
    driver.findElement(passwordFiled).sendKeys(password);
    driver.findElement(loginButton).click();
    return this;


    }



    //move to registrationPage
    public RegistrationPage moveToRegistrationPage (){

        driver.findElement(registerPageButton).click();
            return new RegistrationPage(driver);
    }





}
