package StepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.en.*;

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
    loginPage.clickLoginButton();
    }
    @Then("Home page is displayed")
    public void home_page_is_displayed() {
    homePage.verifyLoginSuccess();
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
