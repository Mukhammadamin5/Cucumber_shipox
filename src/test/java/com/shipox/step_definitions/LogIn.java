package com.shipox.step_definitions;

import com.shipox.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogIn {

    @Given("user is on the shipox login page")
    public void user_is_on_the_shipox_login_page() {

        Driver.getDriver().get("https://shipox.com/");

        WebElement loginBtn = Driver.getDriver().findElement(By.linkText("Login"));
        loginBtn.click();

    }

    @When("user enters username")
    public void user_enters_username() {
        WebElement loginText = Driver.getDriver().findElement(By.xpath("//input[@id='loginName']"));
        loginText.sendKeys("");

        Driver.getDriver().findElement(By.xpath("//button[@type='submit'][1]")).click();
        Driver.getDriver().findElement(By.xpath("//div[@class='companies_list']")).click();
    }

    @When("user enters password")
    public void user_enters_password() {
        WebElement password = Driver.getDriver().findElement(By.id("password"));
        password.sendKeys("");
    }

    @Then("user should click on signInBtn")
    public void user_should_click_on_sign_in_btn() {
        //c
    }
}
