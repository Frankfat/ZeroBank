package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSumPage {

    public  AccountSumPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//h2")
    public List<WebElement> accounts;


}
