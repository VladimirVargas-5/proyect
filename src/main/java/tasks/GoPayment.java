package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.Payment;

public class GoPayment {
    public static void go(WebDriver driver){
        Click.on(driver, Payment.ButtonPayBank);
    }
}

