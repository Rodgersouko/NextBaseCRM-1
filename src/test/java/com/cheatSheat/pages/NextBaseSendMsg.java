package com.cheatSheat.pages;

import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import static org.junit.jupiter.api.AssertTrue.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NextBaseSendMsg {

    //feed-add-post-form-tab-message
    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement sendMsgTab;

    // //*[@id="blog-submit-button-save"] sendBtn
    @FindBy(xpath = "//*[@id=\"blog-submit-button-save\"]")
    public WebElement sendBtn;

    // //*[@id="pagetitle"]
    @FindBy(xpath = "//*[@id=\"pagetitle\"]")
    public WebElement activityStream;

    //body[contenteditable=true][style='min-height: 184px;']
    @FindBy(xpath = "/html/body[@contenteditable='true'][@style='min-height: 184px;'][.='']")
    public WebElement sendMsgBody;

    //  //*[@id="feed-add-post-form-notice-blockblogPostForm"]/div/span[2]
    @FindBy(xpath = "//*[@id=\"feed-add-post-form-notice-blockblogPostForm\"]/div/span[2]")
    public WebElement errorMsg;

    //span[id='bx-b-uploadfile-blogPostForm']
    @FindBy(xpath = "//*[@id=\"bx-b-uploadfile-blogPostForm\"]")
    public WebElement fileUpload;

    ////*[@id="bx-b-link-blogPostForm"]/span/i
    @FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm\"]/span/i")
    public WebElement link;

    // //*[@id="bx-b-video-blogPostForm"]/span/i
    @FindBy(css = "//*[@id=\"bx-b-video-blogPostForm\"]/span/i")
    public WebElement insertVideo;

    // //*[@id="bx-b-quote-blogPostForm"]/span/i
    @FindBy(css = "//*[@id=\"bx-b-quote-blogPostForm\"]/span/i")
    public WebElement quoteText;

    // //*[@id="bx-b-mention-blogPostForm"] addmentions
    @FindBy(xpath = "//*[@id=\"bx-b-mention-blogPostForm\"]")
    public WebElement addMentions;

    // //*[@id="bx-b-tag-input-blogPostForm"] tag
    @FindBy(xpath = "//*[@id=\"bx-b-tag-input-blogPostForm\"]")
    public WebElement tag;


    // //*[@id="post-buttons-bottom"]/span[7] recordVideo
    @FindBy(xpath = " //*[@id=\"post-buttons-bottom\"]/span[7]")
    public WebElement recordVideo;

    // //*[@id="lhe_button_editor_blogPostForm"] textEditor
    @FindBy(xpath = " //*[@id=\"lhe_button_editor_blogPostForm\"]")
    public WebElement textEditor;

    // //*[@id="lhe_button_title_blogPostForm"] title hide
    @FindBy(id = " lhe_button_title_blogPostForm")
    public WebElement titleHide;

    public NextBaseSendMsg() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    public void goTo() {
        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }


    public void messageTab() {
        this.sendMsgTab.click();
    }

    public void sendMsgWithoutCon() {
        this.sendBtn.click();
        this.errorMsg.isDisplayed();


    }

    public void verifyElements() {
        //BrowserUtils.waitForVisibility(uploadfiles2, 10);
        //assertTrue(addMentions.isDisplayed());
        //BrowserUtils.waitForVisibility(selectDocument, 5);
        //assertTrue(titleHide.isDisplayed());
        //BrowserUtils.waitForVisibility(downloadDocument, 5);
        //assertTrue(fileUpload.isDisplayed());
        //BrowserUtils.waitForVisibility(desktopApplication, 5);
        //assertTrue(link.isDisplayed());
    }


    public boolean currentUrl() {
        ;
        return activityStream.isDisplayed();
    }

    public void errorMsgIsDisplayed() {

        String expected = "The message title is not specified";

        assertEquals(expected,errorMsg.getText());
    }


}
