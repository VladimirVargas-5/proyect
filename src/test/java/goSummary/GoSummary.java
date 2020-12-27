package goSummary;

import base.BaseTest;
import org.testng.annotations.Test;

public class GoSummary extends BaseTest {
    @Test
    public void testSuccessfullGo(){

        tasks.GoSummary.go(webDriver);
    }

}
