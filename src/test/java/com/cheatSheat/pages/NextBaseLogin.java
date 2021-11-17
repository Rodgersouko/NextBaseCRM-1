package com.cheatSheat.pages;

import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextBaseLogin {


    @FindBy(xpath = "//div[.='Authorization']")
    public WebElement headerElement;

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordBox;

    @FindBy(className = "login-btn")
    public  WebElement submitBtn;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement errorMsg;

    public NextBaseLogin(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    public void goTo(){
        Driver.getDriver().navigate().to( ConfigReader.read("url"));


    }

    public void login(String username, String password ){


        this.usernameBox.sendKeys(username);
        this.passwordBox.sendKeys(password);
        this.submitBtn.click();

    }

    public boolean loginErrorMsgPresent(){

        return  this.errorMsg.isDisplayed()  ;

    }











}
