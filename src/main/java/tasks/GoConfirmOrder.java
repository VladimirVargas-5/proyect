package tasks;

import actions.Click;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import report.ReportManager;
import ui.ConfirmOrder;

public class GoConfirmOrder {
    public static void go(WebDriver driver){
        ReportManager.getInstance().getTest().log(Status.INFO,"Confirmar la Orden");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.INFO,"Orden confirmada");
        Click.on(driver, ConfirmOrder.ButtonConfirm);
    }
}

