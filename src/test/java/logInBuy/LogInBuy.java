package logInBuy;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.*;

import java.util.concurrent.TimeUnit;

public class LogInBuy extends BaseTest {
    @Test
    public void testSuccessLogInBuy(){
        Login.as(webDriver,"testdiplo14.@gmail.com", "123456789");
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
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

