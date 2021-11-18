package com.cheatSheat.pages;

import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NextBaseLogout {

    @FindBy(xpath = "//input[@name='q']")
    public WebElement inputBox;

    @FindBy(xpath = "//span[@class='user-name']")
    public WebElement userMenu;

    @FindBy(linkText = "Log out")
    public WebElement logoutBtn;

    public NextBaseLogout(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void goTo(){
        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }

    public void logout(){
        userMenu.click();

        logoutBtn.click();
    }

    public boolean inputBoxDisplayed(){
        return inputBox.isDisplayed();

    }
}
