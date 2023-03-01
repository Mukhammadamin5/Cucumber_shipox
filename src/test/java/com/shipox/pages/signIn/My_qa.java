package com.shipox.pages.signIn;

import com.shipox.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_qa {
    public My_qa(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;
    // +998222345678

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    // Test1234


    @FindBy(xpath = "//button[@data-cy='signInButton']")
    public WebElement signInBtn;
}
