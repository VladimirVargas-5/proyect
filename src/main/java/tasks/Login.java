package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.LoginUI;

public class Login {
    public static void as(WebDriver driver, String user, String passWord){
        Enter.text(driver, LoginUI.email, user);
        Enter.text(driver, LoginUI.passWord, passWord);
        Click.on(driver, LoginUI.button);
    }
}
