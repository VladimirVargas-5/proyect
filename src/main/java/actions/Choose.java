package actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Choose {
    public static void select(WebDriver webDriver, By locator, String text){
        org.openqa.selenium.support.ui.Select city = new org.openqa.selenium.support.ui.Select(webDriver.findElement(locator));
        city.selectByVisibleText(text);
    }
}
