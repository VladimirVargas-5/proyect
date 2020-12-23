package tasks;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;

public class GoToCreate {
    public static void as(WebDriver driver, String email){
        Enter.text(driver, ui.GoToCreate.createEmail, email);
        Click.on(driver, ui.GoToCreate.createbutton);
    }
}

