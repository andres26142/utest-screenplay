package co.com.choucairtesting.utest.tasks;

import co.com.choucairtesting.utest.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickOn implements Task {
    public static ClickOn joinToday() {
        return Tasks.instrumented(ClickOn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestPage.JOIN_TODAY_BUTTON));
    }
}
