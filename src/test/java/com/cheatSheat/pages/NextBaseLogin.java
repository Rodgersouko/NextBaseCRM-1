package com.cheatSheat.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NextBaseLogin {

    @FindBy(xpath = "//div[.='Authorization']")
    public WebElement headerElement;

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordBox;





}
