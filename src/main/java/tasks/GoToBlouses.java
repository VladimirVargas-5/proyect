package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.BuyBlouses;

public class GoToBlouses {
    public static void go(WebDriver driver){
        Click.on(driver, BuyBlouses.ButtonBlouses);
    }
}
