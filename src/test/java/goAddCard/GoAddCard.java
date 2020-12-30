package goAddCard;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.*;

import java.util.concurrent.TimeUnit;

public class GoAddCard extends BaseTest {
    @Test
    public void testSuccessAddCard(){
        GoToCreate.as(webDriver, "testdiplo41@gmail.com");
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
}

}
