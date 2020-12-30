package tasks;

import actions.Click;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import report.ReportManager;
import ui.Shipping;

public class GoShipping {
    public static void go(WebDriver driver){
        Click.on(driver, Shipping.Check);
        ReportManager.getInstance().getTest().log(Status.INFO,"Confirmar el shipping");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.INFO,"Delivery confirmado");
        Click.on(driver, Shipping.ButtonProceedShip);
    }
}

