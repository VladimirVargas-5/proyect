package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import ui.MyAccount;

import java.util.concurrent.TimeUnit;

public class GoAddToCard {
    public static void add(WebDriver driver){
        Click.on(driver, ui.AddToCard.ButtonAddCard);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        Click.on(driver, ui.AddToCard.ButtonCheckout);
    }
}
