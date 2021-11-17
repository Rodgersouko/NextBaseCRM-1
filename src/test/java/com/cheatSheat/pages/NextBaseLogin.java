package com.cheatSheat.pages;

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

    public NextBaseLogin(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    public void goTo(){
        Driver.getDriver().navigate().to("https://login.nextbasecrm.com/");

    }

    public void login(){

    }









}
