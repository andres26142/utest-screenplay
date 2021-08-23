package co.com.choucairtesting.utest.tasks;

import co.com.choucairtesting.utest.userinterface.DevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.choucairtesting.utest.userinterface.DevicesPage.*;

public class SelectAll implements Task {
    private String strComputerOs;
    private String strOsVersion;
    private String strComputerLanguage;
    private String strMobileDevice;
    private String strModel;
    private String strMobileOs;

    public SelectAll(String strComputerOs, String strOsVersion, String strComputerLanguage, String strMobileDevice, String strModel, String strMobileOs) {
        this.strComputerOs = strComputerOs;
        this.strOsVersion = strOsVersion;
        this.strComputerLanguage = strComputerLanguage;
        this.strMobileDevice = strMobileDevice;
        this.strModel = strModel;
        this.strMobileOs = strMobileOs;
    }

    public static SelectAll theDeviceInfo(String strComputerOs, String strOsVersion, String strComputerLanguage, String strMobileDevice, String strModel, String strMobileOs) {
        return Tasks.instrumented(SelectAll.class,strComputerOs,strOsVersion,strComputerLanguage,strMobileDevice,strModel,strMobileOs);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BUTTON_NEXT_DEVICES),

                WaitUntil.the(DATA_FROM_PC, WebElementStateMatchers.isEnabled()).forNoMoreThan(120).seconds(),
                Click.on(BUTTON_REMOVE_PC),

                Click.on(BUTTON_COMPUTER),
                Enter.theValue(strComputerOs).into(INPUT_COMPUTER),
                Hit.the(Keys.DOWN).keyIn(INPUT_COMPUTER),
                Hit.the(Keys.ENTER).keyIn(INPUT_COMPUTER),
                Click.on(BUTTON_VERSION),
                Enter.theValue(strOsVersion).into(INPUT_VERSION),
                Hit.the(Keys.DOWN).keyIn(INPUT_VERSION),
                Hit.the(Keys.ENTER).keyIn(INPUT_VERSION),
                Click.on(BUTTON_LANGUAGE_PC),
                Enter.theValue(strComputerLanguage).into(INPUT_LANGUAGE_PC),
                Hit.the(Keys.DOWN).keyIn(INPUT_LANGUAGE_PC),
                Hit.the(Keys.ENTER).keyIn(INPUT_LANGUAGE_PC),

                Click.on(BUTTON_MOBILE),
                Enter.theValue(strMobileDevice).into(INPUT_MOBILE),
                Hit.the(Keys.DOWN).keyIn(INPUT_MOBILE),
                Hit.the(Keys.ENTER).keyIn(INPUT_MOBILE),
                Click.on(BUTTON_MODEL),
                Enter.theValue(strModel).into(INPUT_MODEL),
                Hit.the(Keys.DOWN).keyIn(INPUT_MODEL),
                Hit.the(Keys.ENTER).keyIn(INPUT_MODEL),
                Click.on(BUTTON_MOBILE_OS),
                Enter.theValue(strMobileOs).into(INPUT_MOBILE_OS),
                Hit.the(Keys.DOWN).keyIn(INPUT_MOBILE_OS),
                Hit.the(Keys.ENTER).keyIn(INPUT_MOBILE_OS)
        );
    }
}
