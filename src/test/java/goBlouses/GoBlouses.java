package goBlouses;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.GoToBlouses;
import tasks.GoToWoman;

public class GoBlouses extends BaseTest {
    @Test
    public void testSuccessfullGo(){

        GoToBlouses.go(webDriver);
    }

}
