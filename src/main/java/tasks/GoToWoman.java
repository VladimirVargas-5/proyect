package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.MyAccount;

public class GoToWoman {
    public static void go(WebDriver driver){

        Click.on(driver, MyAccount.ButtonWoman);
    }
}
