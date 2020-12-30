package logIn;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.*;

public class LogIn extends BaseTest {
    @Test
    public void testSuccessLogIn(){
    Login.as(webDriver,"testdiplo14.@gmail.com", "123456789");

}
}