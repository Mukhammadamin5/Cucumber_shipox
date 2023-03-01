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

public class CreateService_StepDef {
    Faker faker = new Faker();

    @Given("user setUps2")
    public void user_set_ups2() {
        Driver.getDriver().get(ConfigurationReader.getProperty("app_qa_link"));
//        App_qa sigIn = new App_qa();
//
//        sigIn.userName.sendKeys(ConfigurationReader.getProperty("app_qa_userName"));
//        sigIn.password.sendKeys(ConfigurationReader.getProperty("app_qa_password"));
//        sigIn.signInBtn.click();
    }
    @When("user is on the Create Service page")
    public void user_is_on_the_create_service_page() {
        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiPaper-root MuiAccordion-root jss4 false false MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded'])[3]")).click();
        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[3]")).click();
    }
    @When("user completes all the fields2")
    public void user_completes_all_the_fields2() {
        Driver.getDriver().findElement(By.xpath("//input[@name='name']")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.xpath("//input[@name='code']")).sendKeys("Test" + faker.numerify("####"));
        Driver.getDriver().findElement(By.xpath("//input[@name='sorder']")).sendKeys("2");
    }
    @Then("user clicks on btn2")
    public void user_clicks_on_btn2() throws InterruptedException{
        Driver.getDriver().findElement(By.xpath("//button[@data-cy='service_type_submit']")).click();
        Thread.sleep(1000);
        //Assert.assertEquals(Driver.getDriver().getTitle(), "test1234 | Service Types");
    }
}
