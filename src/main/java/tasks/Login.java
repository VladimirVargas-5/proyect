package tasks;

import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import report.ReportManager;
import ui.LoginUI;

public class Login {
    public static void as(WebDriver driver, String user, String passWord){
        Enter.text(driver, LoginUI.email, user);
        Enter.text(driver, LoginUI.passWord, passWord);
        ReportManager.getInstance().getTest().log(Status.INFO,"Registrar los datos del nuevo Usuario");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.INFO,"Usuario Creado");
        Click.on(driver, LoginUI.button);
    }
}
