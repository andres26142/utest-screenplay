package co.com.choucairtesting.utest.tasks;

import co.com.choucairtesting.utest.userinterface.LocationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class Choose implements Task {
    private String strCity;
    private String strZipPostalCode;
    private String strCountry;

    public Choose(String strCity, String strZipPostalCode, String strCountry) {
        this.strCity = strCity;
        this.strZipPostalCode = strZipPostalCode;
        this.strCountry = strCountry;
    }

    public static Choose theLocation(String strCity, String strZipPostalCode, String strCountry) {
        return Tasks.instrumented(Choose.class,strCity,strZipPostalCode,strCountry);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LocationPage.BUTTON_NEXT_LOCATION),
                Enter.theValue(strCity).into(LocationPage.INPUT_CITY),
                Hit.the(Keys.DOWN).keyIn(LocationPage.INPUT_CITY),
                Hit.the(Keys.ENTER).keyIn(LocationPage.INPUT_CITY),
                Enter.theValue(strZipPostalCode).into(LocationPage.INPUT_CODE),
                Click.on(LocationPage.BUTTON_COUNTRY),
                Enter.theValue(strCountry).into(LocationPage.INPUT_COUNTRY));
    }
}
