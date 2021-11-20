package com.cheatSheat.tests;

import com.cheatSheat.pages.NextBaseCreatePollFunction;
import com.cheatSheat.pages.NextBaseLogin;
import com.cheatSheat.utility.BrowserUtil;
import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.Driver;
import com.cheatSheat.utility.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class NextBaseCreatePollTest  extends TestBase {

    @Test
    public void testQuestionAndAnswer(){
        NextBaseLogin nextBaseLogin = new NextBaseLogin();
        NextBaseCreatePollFunction createPollFunction = new NextBaseCreatePollFunction();

        String username = ConfigReader.read("username");
        String password = ConfigReader.read("password");

        createPollFunction.goTo();
        nextBaseLogin.login(username,password);

        BrowserUtil.waitFor(1);
        createPollFunction.poll();

        BrowserUtil.waitFor(2);

        WebElement question = Driver.getDriver().findElement(By.xpath("//input[@id='question_0']"));
        WebElement answer1 = Driver.getDriver().findElement(By.xpath("//input[@id='answer_0__0_']"));
        WebElement answer2 = Driver.getDriver().findElement(By.xpath("//input[@id='answer_0__1_']"));

        // question and two answers should be displayed underneath message input section and above send button.
        assertTrue(question.isDisplayed());
        assertTrue(answer1.isDisplayed());
        assertTrue(answer2.isDisplayed());

        //“Allow multiple Choice” should be displayed underneath ”answer 2” input bar.
        WebElement MultipleChoice = Driver.getDriver().findElement(By.xpath("//label[.='Allow multiple choice']"));

        assertTrue(MultipleChoice.isDisplayed());
        assertEquals("Allow multiple choice",MultipleChoice.getText());

        //“Add question” linkText should be displayed above send button, and when clicked new “question”,
        // ”answer 1”, ”answer 2” bar should appear underneath the first one.
        //1
        assertTrue(createPollFunction.addQuestionLink.isDisplayed());
        //2
        createPollFunction.addQuestion(); // click the add question link
        BrowserUtil.waitFor(1);   // wait for one second

        WebElement question1 = Driver.getDriver().findElement(By.xpath("//input[@id='question_1']"));
        WebElement answer1a = Driver.getDriver().findElement(By.xpath("//input[@id='answer_1__0_']"));
        WebElement answer2a = Driver.getDriver().findElement(By.xpath("//input[@id='answer_1__1_']"));

        assertTrue(question1.isDisplayed());
        assertTrue(answer1a.isDisplayed());
        assertTrue(answer2a.isDisplayed());

       // Poll section should be collapsed cancel a poll by clicking on “cancel”button.
        createPollFunction.cancelPoll();
        assertFalse(question1.isDisplayed());

        /*
        BrowserUtil.waitFor(1);
        createPollFunction.poll();

        BrowserUtil.waitFor(2);

        //*********
        //The Poll should be displayed on top of the feed after successfully created & sent.

        driver.switchTo().frame(createPollFunction.iframeElm);

        createPollFunction.clickIFrame();
        createPollFunction.iframeElm.sendKeys("Hello World");

        driver.switchTo().defaultContent();
        BrowserUtil.waitFor(1);

        createPollFunction.clickSendButton();

         */
        //The message title is not specified” should be displayed when a poll is being created without title.
        BrowserUtil.waitFor(1);
        createPollFunction.poll();
        createPollFunction.clickSendButton();
        BrowserUtil.waitFor(1);
        // confirm error message is displayed
        assertTrue(createPollFunction.MsgNotSpecified.isDisplayed());
        // confirm the error message displayed is correct.
        assertEquals("The message title is not specified", createPollFunction.MsgNotSpecified.getText());















    }



}
