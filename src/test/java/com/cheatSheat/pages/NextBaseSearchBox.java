package com.cheatSheat.pages;

import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.Driver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import org.openqa.selenium.support.events.WebDriverEventListener;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextBaseSearchBox {

    @FindBy(id = "search-textbox-input" )
    public WebElement searchBox ;

    // //*[@id="header-inner"]/div[3]/div beforeclick
    // header-search-empty
    // header-search-active
    @FindBy(xpath = "//*[@id=\"header-inner\"]/div[3]/div" )
    public WebElement headerSearchBox ;

    public NextBaseSearchBox(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    public void goTo(){
        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }

    public void headersearchBeforeClick(){
        String expected =headerSearchBox.getAttribute("class");
        System.out.println("expected = " + expected);
        assertEquals(expected,"header-search header-search-empty");

    }

    public void setHeaderSearchAfterClick(){
        String expected =headerSearchBox.getAttribute("class");
       // Action action = new Action(driver);
        System.out.println("expected = " + expected);
        assertEquals(expected,"header-search header-search-empty");

    }
}
