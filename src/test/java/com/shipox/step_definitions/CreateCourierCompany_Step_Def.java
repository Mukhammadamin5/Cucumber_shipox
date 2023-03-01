package com.shipox.step_definitions;

import com.github.javafaker.Faker;
import com.shipox.pages.signIn.App_qa;
import com.shipox.utilities.ConfigurationReader;
import com.shipox.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CreateCourierCompany_Step_Def {
    Faker faker = new Faker();
    @Given("user setUps4")
    public void user_set_ups4() {
        Driver.getDriver().get(ConfigurationReader.getProperty("app_qa_link"));
        App_qa sigIn = new App_qa();

        sigIn.userName.sendKeys(ConfigurationReader.getProperty("app_qa_userName"));
        sigIn.password.sendKeys(ConfigurationReader.getProperty("app_qa_password"));
        sigIn.signInBtn.click();
    }
    @When("user is on the Create Courier Company page")
    public void user_is_on_the_create_courier_company_page() throws InterruptedException{
        Driver.getDriver().findElement(By.xpath("(//div[@class='MuiPaper-root MuiAccordion-root jss4 false false MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded'])[6]")).click();

        Thread.sleep(5000);
        Driver.getDriver().findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root'])[3]")).click();
    }
    @When("user completes all the fields4")
    public void user_completes_all_the_fields4() throws InterruptedException{
        Driver.getDriver().findElement(By.xpath("//input[@name='code']")).sendKeys("Test" + faker.numerify("####"));
        Driver.getDriver().findElement(By.xpath("//input[@name='name']")).sendKeys("Test" + faker.numerify("####"));
        Driver.getDriver().findElement(By.xpath("//input[@name='website']")).sendKeys("https://www.google.com/");
        Driver.getDriver().findElement(By.xpath("//input[@name='trackingUrl']")).sendKeys("https://www.google.com/");
        Driver.getDriver().findElement(By.xpath("//input[@name='supplierEmail']")).sendKeys("test"+ faker.numerify("###") +"@gmail.com");

        Driver.getDriver().findElement(By.xpath("//input[@name='supplierPhone']")).sendKeys("12345678");
        Driver.getDriver().findElement(By.xpath("//input[@name='fax']")).sendKeys("qa");
        Driver.getDriver().findElement(By.xpath("(//input[@name='numberOfFleet'])[1]")).sendKeys("50");
        Driver.getDriver().findElement(By.xpath("//input[@name='numberOfDrivers']")).sendKeys("1");
        Driver.getDriver().findElement(By.xpath("//input[@name='dailyLimit']")).sendKeys("15");
        Driver.getDriver().findElement(By.xpath("//input[@name='dailyQuota']")).sendKeys("5");

        Driver.getDriver().findElement(By.xpath("//input[@name='prefix']")).sendKeys("qa");
        Driver.getDriver().findElement(By.xpath("//input[@name='contactFirstName']")).sendKeys(faker.name().firstName());
        Driver.getDriver().findElement(By.xpath("//input[@name='contactLastName']")).sendKeys(faker.name().lastName());
        Driver.getDriver().findElement(By.xpath("//input[@class='form-control ']")).sendKeys("912345678");

        Driver.getDriver().findElement(By.xpath("//input[@name='contactEmail']")).sendKeys("test"+ faker.numerify("###") +"@gmail.com");
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to search...'])[2]")).sendKeys("Uzbekistan");
        Thread.sleep(1500);
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to search...'])[2]")).sendKeys(Keys.DOWN, Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to search...'])[3]")).sendKeys("Tashkent");
        Thread.sleep(1500);
        Driver.getDriver().findElement(By.xpath("(//input[@placeholder='Type to search...'])[3]")).sendKeys(Keys.DOWN, Keys.ENTER);
        Driver.getDriver().findElement(By.xpath("//input[@name='shippingAddress.address']")).sendKeys("Address" + faker.numerify("####"));
    }
    @Then("user clicks on Btn4")
    public void user_clicks_on_btn4() throws InterruptedException{
        Driver.getDriver().findElement(By.xpath("(//span[@class='MuiButton-label'])[2]")).click();
        Thread.sleep(2000);

    }
}
