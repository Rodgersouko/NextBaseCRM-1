package com.cheatSheat.tests;

import com.cheatSheat.pages.NextBaseLogin;
import com.cheatSheat.pages.NextBaseLogout;
import com.cheatSheat.utility.BrowserUtil;
import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.TestBase;
import org.junit.jupiter.api.Test;

public class NextBaseLogoutTest extends TestBase {

    @Test
    public void testLogout(){

        NextBaseLogout nextBaseLogout = new NextBaseLogout();
        NextBaseLogin nextBaseLogin = new NextBaseLogin();

        String username = ConfigReader.read("username");
        String password = ConfigReader.read("password");

        nextBaseLogout.goTo();
        nextBaseLogin.login(username,password);

        BrowserUtil.waitFor(2);

        nextBaseLogout.inputBoxDisplayed();

        BrowserUtil.waitFor(2);

        nextBaseLogout.logout();



    }
}
