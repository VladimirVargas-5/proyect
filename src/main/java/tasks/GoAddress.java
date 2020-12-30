package tasks;

import actions.Click;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import report.ReportManager;
import ui.BuyBlouses;

public class GoAddress {
    public static void go(WebDriver driver){
        ReportManager.getInstance().getTest().log(Status.INFO,"Confirmar Direccion");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.INFO,"Address confirmado");
        Click.on(driver, ui.Address.ButtonProceedAddress);
    }
}

