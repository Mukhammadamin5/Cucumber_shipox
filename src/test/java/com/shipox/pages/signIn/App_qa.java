package com.shipox.pages.signIn;

import com.shipox.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class App_qa {
    public App_qa(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@data-cy='signInButton']")
    public WebElement signInBtn;

}
