package goConfirm;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.*;

import java.util.concurrent.TimeUnit;

public class GoConfirm extends BaseTest {
    @Test
    public void testSuccessConfirmOrder(){
        GoToCreate.as(webDriver, "testdiplo44@gmail.com");
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        AddClient.withTheData(webDriver, "Test", "Testing","123456789", "ProcessMaker",
                "Zona Sur", "La Paz", "California", "00000", "United States", "Test para Diplomado",
                "7051832145", "7894561", "This is a Test");
        GoToWoman.go(webDriver);
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        GoToTops.go(webDriver);
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        GoToBlouses.go(webDriver);
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        GoAddToCard.add(webDriver);
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        tasks.GoSummary.go(webDriver);
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        tasks.GoAddress.go(webDriver);
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        tasks.GoShipping.go(webDriver);
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        tasks.GoPayment.go(webDriver);
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        GoConfirmOrder.go(webDriver);
    }

}
