package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.Shipping;

public class GoShipping {
    public static void go(WebDriver driver){
        Click.on(driver, Shipping.Check);
        Click.on(driver, Shipping.ButtonProceedShip);
    }
}

