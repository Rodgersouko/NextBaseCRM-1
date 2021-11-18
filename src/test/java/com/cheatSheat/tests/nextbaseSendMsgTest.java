package com.cheatSheat.tests;

import com.cheatSheat.pages.NextBaseLogin;
import com.cheatSheat.pages.NextBaseSendMsg;
import com.cheatSheat.utility.BrowserUtil;
import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.TestBase;
import org.junit.jupiter.api.Test;

public class nextbaseSendMsgTest extends TestBase {

    @Test
    public void testSendMsg() {

        NextBaseSendMsg nextBaseSendMsg = new NextBaseSendMsg();
        NextBaseLogin nextBaseLogin = new NextBaseLogin();

        String username = ConfigReader.read("username");
        String password = ConfigReader.read("password");

        nextBaseSendMsg.goTo();
        nextBaseLogin.login(username, password);

        nextBaseSendMsg.messageTab();
        BrowserUtil.waitFor(2);

        nextBaseSendMsg.sendMsgWithoutCon();

 //       nextBaseSendMsg.sendMsgWithCon();
//
//        BrowserUtil.waitFor(2);
        nextBaseSendMsg.verifyElements();
//
//        BrowserUtil.waitFor(2);
//
        nextBaseSendMsg.currentUrl();
//        nextBaseSendMsg.errorMsgIsDisplayed();


    }

}
