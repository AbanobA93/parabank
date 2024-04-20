import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationSuccessMsgPage {

        private WebDriver driver;
        public RegistrationSuccessMsgPage (WebDriver driver){
            this.driver=driver;
        }

        //elements
        private By successMsg = By.xpath("//h1[@class=\"title\"]");
        private By billPayButton = By.xpath("//a[text()\"Bill Pay\"]");
        //getter
        public By getSuccessMsg() {
            return successMsg;
        }


    public BillPayPage billPayButton(){
        driver.findElement(billPayButton).click();
        return new BillPayPage(driver);
    }



}
