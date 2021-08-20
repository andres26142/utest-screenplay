package co.com.choucairtesting.utest.questions;


import co.com.choucairtesting.utest.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Answer implements Question<Boolean> {
    private String strSuccessfulSignUpMessage;

    public Answer(String strSuccessfulSignUpMessage) {
        this.strSuccessfulSignUpMessage = strSuccessfulSignUpMessage;
    }

    public static Answer toThe(String strSuccessfulSignUpMessage) {
        return new Answer(strSuccessfulSignUpMessage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(UtestPage.COMPLETED_REGISTER, WebElementStateMatchers.isEnabled()).forNoMoreThan(90).seconds()
        );
        boolean result;
        String message= Text.of(UtestPage.COMPLETED_REGISTER).viewedBy(actor).asString();
        if (strSuccessfulSignUpMessage.equals(message)){
            result= true;
        }
        else {
            result=false;
        }
        return result;
    }
}
