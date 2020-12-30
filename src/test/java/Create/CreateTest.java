package Create;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.AddClient;
import tasks.GoToCreate;
import tasks.Login;

import java.util.concurrent.TimeUnit;

public class CreateTest extends BaseTest {

    @Test
    public void testSuccessCreateUser(){
        GoToCreate.as(webDriver, "testdiplo40@gmail.com");
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        AddClient.withTheData(webDriver, "Test", "Testing","123456789", "ProcessMaker",
                "Zona Sur", "La Paz", "California", "00000", "United States", "Test para Diplomado",
                "7051832145", "7894561", "This is a Test");
        }
}
