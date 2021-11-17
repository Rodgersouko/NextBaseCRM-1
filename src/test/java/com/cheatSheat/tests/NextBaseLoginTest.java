package com.cheatSheat.tests;

import com.cheatSheat.pages.NextBaseLogin;
import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.TestBase;
import org.junit.jupiter.api.Test;

public class NextBaseLoginTest extends TestBase {

    @Test
    public void testLogin(){

        NextBaseLogin nextBaseLogin = new NextBaseLogin();

        String username = ConfigReader.read("username");
        String password = ConfigReader.read("password");

        nextBaseLogin.goTo();
        nextBaseLogin.login(username,password);



    }
}
