package co.com.choucairtesting.utest.tasks;

import co.com.choucairtesting.utest.userinterface.PrivacyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.choucairtesting.utest.userinterface.PrivacyPage.*;

public class Configue implements Task {
    private String strPassword;

    public Configue(String strPassword) {
        this.strPassword = strPassword;
    }

    public static Configue thePrivacyOptions(String strPassword) {
        return Tasks.instrumented(Configue.class,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_LAST_STEP),

                Enter.theValue(strPassword).into(PASSWORD),
                Enter.theValue(strPassword).into(PASSWORD_CONFIRMATION),
                Click.on(BUTTON_STAY_INFORMED),
                Click.on(BUTTON_TERMS),
                Click.on(BUTTON_PRIVACY_POLICY),

                Click.on(BUTTON_COMPLETE));

    }
}
