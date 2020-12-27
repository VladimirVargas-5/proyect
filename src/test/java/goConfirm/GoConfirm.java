package goConfirm;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.GoConfirmOrder;

public class GoConfirm extends BaseTest {
    @Test
    public void testSuccessfullGo(){

        GoConfirmOrder.go(webDriver);
    }

}
