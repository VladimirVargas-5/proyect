package tasks;

import actions.Click;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import report.ReportManager;
import ui.BuyTops;

public class GoToTops {
    public static void go(WebDriver driver){
        ReportManager.getInstance().getTest().log(Status.INFO,"Elegir la categoria");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.INFO,"Categoria TOPS fueron elegidos");
        Click.on(driver, BuyTops.ButtonTops);
    }
}
