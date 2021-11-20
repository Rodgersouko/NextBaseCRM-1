package com.cheatSheat.pages;

import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NextBaseCreatePollFunction {

    @FindBy(xpath = "(//span[.='Poll'])[1]")
    public WebElement pollButton;

    @FindBy(xpath = "//a[.='Add question']")
    public WebElement addQuestionLink;

    public NextBaseCreatePollFunction(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo(){
        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }

    public void poll(){
        this.pollButton.click();
        // clicking the poll button

    }

    public void addQuestion(){
        this.addQuestionLink.click();
        // clicking the "add question link"
    }



}
