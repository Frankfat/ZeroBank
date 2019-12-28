package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    public loginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(id="signin_button")
    public WebElement signInBtn;
    @FindBy(id = "user_login")
    public WebElement userName;
    @FindBy (id="user_password")
        public WebElement password;
   @FindBy(name="submit")
public WebElement submit;
   @FindBy(xpath = "//div[contains(text(),\"Login and/or password are wrong.\")]")
   public WebElement errorMessage;

   public  void Login() throws InterruptedException {
       String url = ConfigReader.getProperty("url");
       Driver.get().get(url);
       Thread.sleep(3000);
       Driver.get().findElement(By.id("signin_button")).click();
       Thread.sleep(2000);
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

}
