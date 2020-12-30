package tasks;

import actions.Click;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import report.ReportManager;
import ui.BuyBlouses;

public class GoSummary {
    public static void go(WebDriver driver){
        ReportManager.getInstance().getTest().log(Status.INFO,"Confirmar el producto");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.INFO,"Confirmado el producto a comprar");
        Click.on(driver, ui.Summary.ButtonProceed);
    }
}

