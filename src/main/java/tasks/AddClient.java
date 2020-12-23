package tasks;

import actions.Choose;
import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.CreateUI;

public class AddClient {
    public static void withTheData(WebDriver webDriver, String name, String lastname, String password, String company,String adress,
                                   String city, String state, String postcode, String country, String other, String phone,
                                   String mobile, String alias){
        Click.on(webDriver, CreateUI.genero);
        Enter.text(webDriver, CreateUI.firstName, name);
        Enter.text(webDriver, CreateUI.lastName, lastname);
        Enter.text(webDriver, CreateUI.password, password);
        Click.on(webDriver, CreateUI.newsletter);
        Click.on(webDriver, CreateUI.uniform);
        Enter.text(webDriver, CreateUI.company, company);
        Enter.text(webDriver, CreateUI.address1, adress);
        Enter.text(webDriver, CreateUI.city, city);
        Choose.select(webDriver, CreateUI.state, state);
        Enter.text(webDriver, CreateUI.postcode, postcode);
        Choose.select(webDriver, CreateUI.country, country);
        Enter.text(webDriver, CreateUI.other, other);
        Enter.text(webDriver, CreateUI.phone, phone);
        Enter.text(webDriver, CreateUI.MobilePhone, mobile);
        Enter.text(webDriver, CreateUI.alias, alias);
        Click.on(webDriver, CreateUI.buttonRegister);

         }
}
