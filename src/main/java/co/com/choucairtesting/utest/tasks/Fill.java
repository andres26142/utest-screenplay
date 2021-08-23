package co.com.choucairtesting.utest.tasks;

import co.com.choucairtesting.utest.userinterface.AboutYourselfPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import static co.com.choucairtesting.utest.userinterface.AboutYourselfPage.*;

public class Fill implements Task {
    private String strFistName;
    private String strLastName;
    private String strEmailAddress;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;
    private String strUserLanguage;

    private String strComputerOs;
    private String strOsVersion;
    private String strComputerLanguage;
    private String strMobileDevice;
    private String strModel;
    private String strMobileOs;
    private String strPassword;

    public Fill(String strFistName, String strLastName, String strEmailAddress, String strBirthMonth, String strBirthDay, String strBirthYear, String strUserLanguage) {
        this.strFistName = strFistName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
        this.strUserLanguage = strUserLanguage;

    }


    public static Fill thePersonalInfo(String strFistName, String strLastName, String strEmailAddress, String strBirthMonth, String strBirthDay, String strBirthYear, String strUserLanguage) {
        return Tasks.instrumented(Fill.class,strFistName,strLastName,strEmailAddress,strBirthMonth,strBirthDay,strBirthYear,strUserLanguage);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strFistName).into(INPUT_FIRSTNAME),
                Enter.theValue(strLastName).into(INPUT_LASTNAME),
                Enter.theValue(strEmailAddress).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strBirthMonth).from(INPUT_MONTH),
                SelectFromOptions.byVisibleText(strBirthDay).from(INPUT_DAY),
                SelectFromOptions.byVisibleText(strBirthYear).from(INPUT_YEAR),
                Click.on(INPUT_LANGUAGE),
                Enter.theValue(strUserLanguage).into(INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).keyIn(INPUT_LANGUAGE)


        );
    }
}
