package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.ConfirmOrder;

public class GoConfirmOrder {
    public static void go(WebDriver driver){
        Click.on(driver, ConfirmOrder.ButtonConfirm);
    }
}

