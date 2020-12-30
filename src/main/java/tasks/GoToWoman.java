package tasks;

import actions.Click;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import report.ReportManager;
import ui.MyAccount;

public class GoToWoman {
    public static void go(WebDriver driver){
        ReportManager.getInstance().getTest().log(Status.INFO,"Elegir el genero de las prendas");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.INFO,"Se elegio WOMAN");
        Click.on(driver, MyAccount.ButtonWoman);
    }
}
