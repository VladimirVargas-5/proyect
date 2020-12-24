package tasks;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.OrderConfirmed;

public class GoOrderConfirmed {
    public static boolean visible(WebDriver webDriver){
        return WaitUntilElement.isVisible(webDriver, OrderConfirmed.Confirmation);
    }
}
