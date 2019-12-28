package com.zerobank.stepDefinitons;

import com.zerobank.utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void setUp() {
      //  driver=Driver.get();
        //driver.manage().window().maximize();

    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("This is coming from after scenario\n");
        // if scenario fails, take a screenshot
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }

        Driver.closeDriver();
    }

    @After("@sales_manager")
    public void tearDownSalesManager(){
        System.out.println("This is coming from after scenario for sales managers\n");

    }
}
