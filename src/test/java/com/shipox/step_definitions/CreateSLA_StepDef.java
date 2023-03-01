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

public class CreateSLA_StepDef {

    Faker faker = new Faker();

    @Given("user setUps1")
    public void user_set_ups1() {
        Driver.getDriver().get(ConfigurationReader.getProperty("app_qa_link"));
//        App_qa sigIn = new App_qa();
//
//        sigIn.userName.sendKeys(ConfigurationReader.getProperty("app_qa_userName"));
//        sigIn.password.sendKeys(ConfigurationReader.getProperty("app_qa_password"));
//        sigIn.signInBtn.click();
    }
    @When("user is on the Create SLA page")
    public void user_is_on_the_create_sla_page() throws InterruptedException{
        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiAccordionSummary-content jss7'])[12]")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("(//div[contains(@class, 'MuiPaper-root paper')])[5]")).click();
        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[3]")).click();
    }
    @When("user completes all the fields1")
    public void user_completes_all_the_fields1() {
        Driver.getDriver().findElement(By.xpath("//input[@name='name']")).sendKeys("test2");
        Driver.getDriver().findElement(By.xpath("//div[@class='MuiButtonBase-root MuiAccordionSummary-root']")).click();
        Driver.getDriver().findElement(By.xpath("//input[@type='checkbox']")).click();
        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text'])[2]")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[4]")).click();
        Driver.getDriver().findElement(By.xpath("(//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button'])[1]")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[6]")).click();
        Driver.getDriver().findElement(By.xpath("(//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button'])[4]")).click();

        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text'])[2]")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[7]")).click();
        Driver.getDriver().findElement(By.xpath("(//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button'])[2]")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[9]")).click();
        Driver.getDriver().findElement(By.xpath("(//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button'])[3]")).click();

        Driver.getDriver().findElement(By.xpath("//input[@type='number']")).sendKeys("2");
    }
    @Then("user clicks on Btn")
    public void user_clicks_on_btn() throws InterruptedException{
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        //Assert.assertEquals(Driver.getDriver().getTitle(), "test1234 | SLA Management Rule");
    }
}
