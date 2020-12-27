package goAddress;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.GoSummary;

public class GoAddress extends BaseTest {
    @Test
    public void testSuccessfullGo(){

        GoSummary.go(webDriver);
    }

}
