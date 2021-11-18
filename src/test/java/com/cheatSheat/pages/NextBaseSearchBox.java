package com.cheatSheat.pages;

import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextBaseSearchBox {

    @FindBy(id = "search-textbox-input" )
    public WebElement searchBox ;

    // //*[@id="header-inner"]/div[3]/div beforeclick

    public NextBaseSearchBox(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    public void goTo(){
        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }
}
