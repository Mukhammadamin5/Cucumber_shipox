package com.shipox.step_definitions;

import com.github.javafaker.Faker;
import com.shipox.pages.signIn.App_qa;
import com.shipox.utilities.ConfigurationReader;
import com.shipox.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Customers_StepDef {
    Faker faker = new Faker();


    @Given("user setUps")
    public void user_set_ups() {
        Driver.getDriver().get(ConfigurationReader.getProperty("app_qa_link"));
//        App_qa sigIn = new App_qa();
//
//        sigIn.userName.sendKeys(ConfigurationReader.getProperty("app_qa_userName"));
//        sigIn.password.sendKeys(ConfigurationReader.getProperty("app_qa_password"));
//        sigIn.signInBtn.click();
    }

    @Given("user is on the Create Customer page")
    public void user_is_on_the_create_customer_page() throws InterruptedException{
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiPaper-root MuiAccordion-root jss4 false false MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded'])[9]")).click();
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[4]")).click();

    }

    @When("user must complete all the fields")
    public void user_must_complete_all_the_fields() {
        Driver.getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("test"+ faker.numerify("###") +"@gmail.com");
        Driver.getDriver().findElement(By.xpath("//input[@name='firstName']")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.xpath("//input[@name='lastName']")).sendKeys(faker.name().lastName());

        Driver.getDriver().findElement(By.xpath("//input[@class='form-control ']")).sendKeys("912345678");

        Driver.getDriver().findElement(By.xpath("//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiAutocomplete-input MuiAutocomplete-inputFocused MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']")).sendKeys("Uzbekistan");

        Driver.getDriver().findElement(By.xpath("//span[@class='MuiButton-label']")).click();
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("Test1234");

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[1]")).click();
        Driver.getDriver().findElement(By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[2]")).click();
        Driver.getDriver().findElement(By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']")).click();
        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[3]")).click();
        Driver.getDriver().findElement(By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']")).click();
    }

    @Then("user should click on Btn")
    public void user_should_click_on_btn() throws InterruptedException{
        Driver.getDriver().findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text']")).click();
        Thread.sleep(2000);
        Assert.assertEquals(Driver.getDriver().getTitle(), "test1234 | Customers");
        //Driver.getDriver().close();
    }


}
