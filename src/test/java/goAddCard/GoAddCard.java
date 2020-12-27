package goAddCard;

import base.BaseTest;
import org.testng.annotations.Test;
import tasks.GoAddToCard;

public class GoAddCard extends BaseTest {
    @Test
    public void testSuccessfullGo(){
        GoAddToCard.add(webDriver);
}

}
