package goPayment;

import base.BaseTest;
import org.testng.annotations.Test;

public class GoPayment extends BaseTest {
    @Test
    public void testSuccessfullGo(){

        tasks.GoPayment.go(webDriver);
    }

}
