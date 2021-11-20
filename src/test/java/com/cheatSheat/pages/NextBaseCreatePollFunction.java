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

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelPoll;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//*[@id=\"bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm\"]/iframe")
    public WebElement iframeElm;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement MsgNotSpecified;



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

    public void cancelPoll(){
        this.cancelPoll.click();
        // clicking to cancel poll function
    }

    public void clickSendButton(){
        this.sendButton.click();
        // clicking the send button
    }

    public void clickIFrame(){
        this.iframeElm.click();
    }



}
