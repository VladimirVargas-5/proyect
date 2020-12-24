package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.BuyBlouses;

public class GoSummary {
    public static void go(WebDriver driver){
        Click.on(driver, ui.Summary.ButtonProceed);
    }
}

