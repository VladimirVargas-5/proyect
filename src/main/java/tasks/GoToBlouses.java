package tasks;

import actions.Click;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import report.ReportManager;
import ui.BuyBlouses;

public class GoToBlouses {
    public static void go(WebDriver driver){
        ReportManager.getInstance().getTest().log(Status.INFO,"Confirmar la subcategoria");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.INFO,"Blouses fueron elegidas");
        Click.on(driver, BuyBlouses.ButtonBlouses);
    }
}
