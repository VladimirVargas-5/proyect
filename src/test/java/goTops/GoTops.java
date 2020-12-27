package goTops;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.GoToTops;

public class GoTops extends BaseTest {

    @Test
    public void testSuccessfullGo(){

        GoToTops.go(webDriver);
    }


}
