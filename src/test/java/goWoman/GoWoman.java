package goWoman;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.GoToWoman;

public class GoWoman extends BaseTest {

    @Test
    public void testSuccessfullGo(){

        GoToWoman.go(webDriver);
    }



}
