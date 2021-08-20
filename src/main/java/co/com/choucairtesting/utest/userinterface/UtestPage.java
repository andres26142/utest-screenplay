package co.com.choucairtesting.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com")
public class UtestPage extends PageObject {
    public static final Target JOIN_TODAY_BUTTON = Target.the("button that show us the login page").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target COMPLETED_REGISTER = Target.the("page that tell us we are now registered").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
