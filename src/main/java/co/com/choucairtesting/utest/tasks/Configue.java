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
                Click.on(PrivacyPage.BUTTON_LAST_STEP),

                Enter.theValue(strPassword).into(PrivacyPage.PASSWORD),
                Enter.theValue(strPassword).into(PrivacyPage.PASSWORD_CONFIRMATION),
                Click.on(PrivacyPage.BUTTON_STAY_INFORMED),
                Click.on(PrivacyPage.BUTTON_TERMS),
                Click.on(PrivacyPage.BUTTON_PRIVACY_POLICY),

                Click.on(PrivacyPage.BUTTON_COMPLETE));

    }
}
