package com.shipox.step_definitions;

import com.shipox.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void teardownScenario(Scenario scenario){
        // We will implement taking screenshot in this method

        if(scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/pmg", scenario.getName());
        }
        // Driver.getDriver().quit();

    }
}
