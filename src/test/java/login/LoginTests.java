package login;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.IsEmployeePageDisplayed;
import tasks.IsLoginErrorMessage;
import tasks.Login;

public class LoginTests extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        Login.as(webDriver,"admin","admin123");
        Assert.assertTrue(IsEmployeePageDisplayed.form(webDriver));
    }

    @Test
    public void testLoginWithInvalidCredentials(){
        Login.as(webDriver,"admin","admin");
        Assert.assertTrue(IsLoginErrorMessage.visible(webDriver));
    }
}
