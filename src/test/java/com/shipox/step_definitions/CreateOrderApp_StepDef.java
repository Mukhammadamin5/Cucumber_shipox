package com.shipox.step_definitions;

import com.github.javafaker.Faker;
import com.shipox.pages.signIn.App_qa;
import com.shipox.utilities.ConfigurationReader;
import com.shipox.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class CreateOrderApp_StepDef {
    Faker faker = new Faker();

    @Given("user setUps3")
    public void user_set_ups3() {

        Driver.getDriver().get(ConfigurationReader.getProperty("app_qa_link"));
//        App_qa sigIn = new App_qa();
//
//        sigIn.userName.sendKeys(ConfigurationReader.getProperty("app_qa_userName"));
//        sigIn.password.sendKeys(ConfigurationReader.getProperty("app_qa_password"));
//        sigIn.signInBtn.click();

    }
    @When("user is on the Create Order page")
    public void user_is_on_the_create_order_page() {
        Driver.getDriver().findElement(By.xpath("//a[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedSizeSmall MuiButton-sizeSmall']")).click();
    }
    @When("user completes all the fields3")
    public void user_completes_all_the_fields3() throws InterruptedException{
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to Search'])[1]")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to Search'])[1]")).sendKeys(Keys.DOWN, Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to Search'])[2]")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to Search'])[2]")).sendKeys(Keys.DOWN, Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to Search'])[4]")).click();
        Thread.sleep(1000);
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to Search'])[4]")).sendKeys(Keys.DOWN, Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("//input[@name='pickupContactName']")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.xpath("//input[@name='pickupCompanyName']")).sendKeys(faker.company().name());
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to Search'])[6]")).sendKeys("Tashkent");
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to Search'])[6]")).sendKeys(Keys.DOWN, Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("//input[@name='pickupStreet']")).sendKeys("street" + faker.numerify("###"));
        Driver.getDriver().findElement(By.xpath("//input[@name='pickupAddress']")).sendKeys("address" + faker.numerify("###"));
        Driver.getDriver().findElement(By.xpath("(//input[@class='form-control '])[1]")).sendKeys("911111111");
        Driver.getDriver().findElement(By.xpath("(//input[@name='pickupContactEmail'])[1]")).sendKeys("test"+faker.numerify("####") + "@gmail.com");



        Driver.getDriver().findElement(By.xpath("//input[@name='dropoffContactName']")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.xpath("//input[@name='dropoffCompanyName']")).sendKeys(faker.company().name());
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to Search'])[8]")).sendKeys("Tashkent");
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to Search'])[8]")).sendKeys(Keys.DOWN, Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("//input[@name='dropoffStreet']")).sendKeys("street" + faker.numerify("###"));
        Driver.getDriver().findElement(By.xpath("//input[@name='dropoffAddress']")).sendKeys("address" + faker.numerify("###"));
        Driver.getDriver().findElement(By.xpath("(//input[@name='dropoffContactEmail'])[1]")).sendKeys("test"+faker.numerify("####") + "@gmail.com");
        Driver.getDriver().findElement(By.xpath("(//input[@class='form-control '])[2]")).sendKeys("911111111");
        Thread.sleep(5000);
        Driver.getDriver().findElement(By.xpath("//input[@name='pickupBuilding']")).sendKeys("building"+faker.numerify("###"));
        Driver.getDriver().findElement(By.xpath("//input[@name='dropoffBuilding']")).sendKeys("building"+faker.numerify("###"));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(4000);
        Driver.getDriver().findElement(By.xpath("//div[@id='mui-component-select-menu']")).click();
        Driver.getDriver().findElement(By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']")).click();
        Thread.sleep(3000);
        Driver.getDriver().findElement(By.xpath("//div[@id='mui-component-select-package']")).click();
        Thread.sleep(1500);
        Driver.getDriver().findElement(By.xpath("//li[@role='option']")).click();
    }
    @Then("user clicks on Btn3")
    public void user_clicks_on_btn3() throws InterruptedException{
        Thread.sleep(2000);
        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text'])[2]")).click();
        Thread.sleep(3000);
    }

}
