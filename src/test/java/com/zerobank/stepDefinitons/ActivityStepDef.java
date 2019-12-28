package com.zerobank.stepDefinitons;

import com.zerobank.pages.AccountSumPage;
import com.zerobank.pages.loginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ActivityStepDef {

    @When("user logged in")
    public void user_logged_in() throws InterruptedException {
       loginPage log = new loginPage();
       log.Login();
    }

    @Then("user should see types of acoount names")
    public void user_should_see_types_of_acoount_names() {
        AccountSumPage sumPage = new AccountSumPage();
        List<WebElement> ActualList = new ArrayList<>();
        for(WebElement each : sumPage.accounts){
            ActualList.add(each);
        }
        Assert.assertEquals(sumPage.accounts,ActualList);

    }

    @Then("Credit account table must have following columns")
    public void credit_account_table_must_have_following_columns(List<String> list) {

    }

}
