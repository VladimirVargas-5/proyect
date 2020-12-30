package goCreate;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.GoToCreate;

public class GoCreate extends BaseTest {

    @Test
    public void testSuccessGoToCreate(){
        GoToCreate.as(webDriver, "testdiplo45@gmail.com");
    }


}
