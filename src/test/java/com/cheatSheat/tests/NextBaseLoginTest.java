package com.cheatSheat.tests;

import com.cheatSheat.pages.NextBaseLogin;
import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.Driver;
import com.cheatSheat.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NextBaseLoginTest extends TestBase {
    NextBaseLogin nextBaseLogin;

    @Test
    public void testLogin(){

        nextBaseLogin = new NextBaseLogin();

        String username = ConfigReader.read("username");
        String password = ConfigReader.read("password");

        nextBaseLogin.goTo();
        nextBaseLogin.login(username,password);



    }

    @Test
    public void testWithInvalidCredentials(){
        nextBaseLogin = new NextBaseLogin();

        nextBaseLogin.goTo();
        nextBaseLogin.login("cheat","sheet");
        nextBaseLogin.loginErrorMsgPresent();

        Assertions.assertEquals("Authorization", Driver.getDriver().getTitle());
    }
}
