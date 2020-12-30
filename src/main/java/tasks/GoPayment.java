package tasks;

import actions.Click;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import report.ReportManager;
import ui.Payment;

public class GoPayment {
    public static void go(WebDriver driver){
        ReportManager.getInstance().getTest().log(Status.INFO,"Confirmar la forma de pago");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.INFO,"Forma de pago elegida");
        Click.on(driver, Payment.ButtonPayBank);
    }
}

