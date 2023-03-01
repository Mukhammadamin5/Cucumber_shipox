package com.shipox.step_definitions;

import com.github.javafaker.Faker;
import com.shipox.pages.signIn.App_qa;
import com.shipox.utilities.ConfigurationReader;
import com.shipox.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CreateDrivers_StepDef {

    Faker faker = new Faker();

    @Given("user  setUps")
    public void user_set_ups() {
        Driver.getDriver().get(ConfigurationReader.getProperty("app_qa_link"));
//        App_qa sigIn = new App_qa();
//
//        sigIn.userName.sendKeys(ConfigurationReader.getProperty("app_qa_userName"));
//        sigIn.password.sendKeys(ConfigurationReader.getProperty("app_qa_password"));
//        sigIn.signInBtn.click();
    }
    @When("user is on the Create Driver page")
    public void user_is_on_the_create_driver_page() throws InterruptedException{
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiPaper-root MuiAccordion-root jss4 false false MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded'])[7]")).click();
        Thread.sleep(10000);
        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[3]")).click();
    }
    @When("user completes all the fields")
    public void user_completes_all_the_fields() {
        Driver.getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("test"+ faker.numerify("###") +"@gmail.com");
        Driver.getDriver().findElement(By.xpath("//input[@name='firstName']")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.xpath("//input[@name='lastName']")).sendKeys(faker.name().lastName());

        Driver.getDriver().findElement(By.xpath("//input[@class='form-control ']")).sendKeys("912345678");
        Driver.getDriver().findElement(By.xpath("//input[@name='birthDate']")).click();
        Driver.getDriver().findElement(By.xpath("//h6[@class='MuiTypography-root MuiPickersToolbarText-toolbarTxt MuiTypography-subtitle1']")).click();
        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiTypography-root MuiPickersYear-root MuiTypography-subtitle1'])[101]")).click();
        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary'])[2]")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[1]")).click();
        Driver.getDriver().findElement(By.xpath("//li[@data-value='male']")).click();

        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense'])[2]")).click();
        Driver.getDriver().findElement(By.xpath("//li[@data-value='active']")).click();

        Driver.getDriver().findElement(By.xpath("//span[@class='MuiButton-label']")).click();
        Driver.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("Test1234");
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to search...'])[1]")).click();
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to search...'])[1]")).sendKeys(Keys.DOWN, Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to search...'])[2]")).click();
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to search...'])[2]")).sendKeys(Keys.DOWN, Keys.ENTER);
    }
    @Then("user clicks on btn")
    public void user_clicks_on_btn() throws InterruptedException{
        Driver.getDriver().findElement(By.xpath("(//span[@class='MuiButton-label'])[3]")).click();
        Thread.sleep(2000);

        //Assert.assertEquals(Driver.getDriver().getTitle(), "test1234 | Drivers");

    }


}
