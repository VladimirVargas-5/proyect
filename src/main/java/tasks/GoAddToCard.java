package tasks;

import actions.Click;
import com.aventstack.extentreports.Status;
import helper.ScreenShotHelper;
import org.openqa.selenium.WebDriver;
import report.ReportManager;
import ui.MyAccount;

import java.util.concurrent.TimeUnit;

public class GoAddToCard {
    public static void add(WebDriver driver){
        Click.on(driver, ui.AddToCard.ButtonAddCard);
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        ReportManager.getInstance().getTest().log(Status.INFO,"Confirmar categoria elegida");
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(driver,Status.INFO,"Categoria Adicionada");
        Click.on(driver, ui.AddToCard.ButtonCheckout);
    }
}
