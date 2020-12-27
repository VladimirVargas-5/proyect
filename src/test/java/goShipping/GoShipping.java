package goShipping;

import base.BaseTest;
import org.testng.annotations.Test;

public class GoShipping extends BaseTest {
    @Test
    public void testSuccessfullGo(){

        tasks.GoShipping.go(webDriver);
    }

}
