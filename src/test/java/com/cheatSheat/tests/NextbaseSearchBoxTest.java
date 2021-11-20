package com.cheatSheat.tests;

import com.cheatSheat.pages.NextBaseLogin;
import com.cheatSheat.pages.NextBaseLogout;
import com.cheatSheat.pages.NextBaseSearchBox;
import com.cheatSheat.utility.BrowserUtil;
import com.cheatSheat.utility.ConfigReader;
import com.cheatSheat.utility.TestBase;
import org.junit.jupiter.api.Test;

public class NextbaseSearchBoxTest extends TestBase {

    @Test
    public void testSearchBox() {

        NextBaseSearchBox nextBaseSearchBox = new NextBaseSearchBox();
        NextBaseLogin nextBaseLogin = new NextBaseLogin();

        String username = ConfigReader.read("username");
        String password = ConfigReader.read("password");

        nextBaseSearchBox.goTo();
        nextBaseLogin.login(username, password);

        BrowserUtil.waitFor(2);



    }
}
