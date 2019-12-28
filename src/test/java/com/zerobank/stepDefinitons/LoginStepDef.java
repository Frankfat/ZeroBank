package com.zerobank.stepDefinitons;

import com.zerobank.pages.loginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDef {


    @When("user logs in")
    public void user_logs_in() throws InterruptedException {
        String url = ConfigReader.getProperty("url");

        Driver.get().get(url);
        Thread.sleep(3000);
        Driver.get().findElement(By.id("signin_button")).click();
        Thread.sleep(2000);

    }

    @Then("user enter valid credantials")
    public void user_enter_valid_credantials() {
        String username = ConfigReader.getProperty("username");
        String password = ConfigReader.getProperty("password");
        loginPage log =new loginPage();
        BrowserUtils.waitFor(2);
        log.userName.sendKeys(username);
        BrowserUtils.waitFor(2);
        log.password.sendKeys(password);
        BrowserUtils.waitFor(2);
        log.submit.click();
        BrowserUtils.waitFor(2);

    }

    @Then("user able to see Account Summary Page")
    public void user_able_to_see_Account_Summary_Page() {

    String title = Driver.get().getTitle();
        Assert.assertEquals("Zero - Account Summary",title);
    }

    @Then("user logs by using {string} and {string}")
    public void user_logs_by_using_and(String username, String password) {
        loginPage log =new loginPage();
        BrowserUtils.waitFor(2);
        log.userName.sendKeys(username);
        BrowserUtils.waitFor(2);
        log.password.sendKeys(password);
        BrowserUtils.waitFor(2);
        log.submit.click();
        BrowserUtils.waitFor(2);
    }

    @Then("user see error message")
    public void user_see_error_message() {
        loginPage loginPage = new loginPage();
       String error =  "Login and/or password are wrong.";
Assert.assertEquals(error,loginPage.errorMessage.getText());
    }


}