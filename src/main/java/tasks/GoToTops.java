package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.BuyTops;

public class GoToTops {
    public static void go(WebDriver driver){
        Click.on(driver, BuyTops.ButtonTops);
    }
}
