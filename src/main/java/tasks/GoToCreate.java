package tasks;

import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import report.ReportManager;

public class GoToCreate {
    public static void as(WebDriver driver, String email){
        Enter.text(driver, ui.GoToCreate.createEmail, email);
        ReportManager.getInstance().getTest().log(Status.INFO,"Confirmar el email");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.INFO,"Email es valido");
        Click.on(driver, ui.GoToCreate.createbutton);
    }
}

