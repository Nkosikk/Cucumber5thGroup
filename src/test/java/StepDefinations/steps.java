package StepDefinations;

import Utils.TakeScreenshots;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class steps extends Base{
    @Given("The user is in login page")
    public void the_user_is_in_login_page() {
    }
    @And("^The user enters username (.*)$")
    public void the_user_enters_username_username(String username) {
    loginPage.enterUserName(username);
    }
    @And("^The user enters password (.*)$")
    public void the_user_enters_password_password(String password) {
        loginPage.enterPassWord(password);
    }
    @When("The user clicks login button")
    public void the_user_clicks_login_button() {
        screenshots.takeSnapShot(driver,"Login Screen");
    loginPage.clickLoginButton();
    }
    @Then("Home page is displayed")
    public void home_page_is_displayed() {
    homePage.verifyLoginSuccess();
        screenshots.takeSnapShot(driver,"Home Screen");
    }

    @AfterStep
    public void takeScreenshotFailure(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","image");
        }
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }

    @And("The user click SauceLAb Back Pack")
    public void theUserClickSauceLAbBackPack() {
        homePage.clickBackPack_AddToCartButton();
    }
}
