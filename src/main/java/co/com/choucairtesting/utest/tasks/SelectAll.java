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
        actor.attemptsTo(Click.on(DevicesPage.BUTTON_NEXT_DEVICES),

                WaitUntil.the(DevicesPage.DATA_FROM_PC, WebElementStateMatchers.isEnabled()).forNoMoreThan(120).seconds(),
                Click.on(DevicesPage.BUTTON_REMOVE_PC),

                Click.on(DevicesPage.BUTTON_COMPUTER),
                Enter.theValue(strComputerOs).into(DevicesPage.INPUT_COMPUTER),
                Hit.the(Keys.DOWN).keyIn(DevicesPage.INPUT_COMPUTER),
                Hit.the(Keys.ENTER).keyIn(DevicesPage.INPUT_COMPUTER),
                Click.on(DevicesPage.BUTTON_VERSION),
                Enter.theValue(strOsVersion).into(DevicesPage.INPUT_VERSION),
                Hit.the(Keys.DOWN).keyIn(DevicesPage.INPUT_VERSION),
                Hit.the(Keys.ENTER).keyIn(DevicesPage.INPUT_VERSION),
                Click.on(DevicesPage.BUTTON_LANGUAGE_PC),
                Enter.theValue(strComputerLanguage).into(DevicesPage.INPUT_LANGUAGE_PC),
                Hit.the(Keys.DOWN).keyIn(DevicesPage.INPUT_LANGUAGE_PC),
                Hit.the(Keys.ENTER).keyIn(DevicesPage.INPUT_LANGUAGE_PC),

                Click.on(DevicesPage.BUTTON_MOBILE),
                Enter.theValue(strMobileDevice).into(DevicesPage.INPUT_MOBILE),
                Hit.the(Keys.DOWN).keyIn(DevicesPage.INPUT_MOBILE),
                Hit.the(Keys.ENTER).keyIn(DevicesPage.INPUT_MOBILE),
                Click.on(DevicesPage.BUTTON_MODEL),
                Enter.theValue(strModel).into(DevicesPage.INPUT_MODEL),
                Hit.the(Keys.DOWN).keyIn(DevicesPage.INPUT_MODEL),
                Hit.the(Keys.ENTER).keyIn(DevicesPage.INPUT_MODEL),
                Click.on(DevicesPage.BUTTON_MOBILE_OS),
                Enter.theValue(strMobileOs).into(DevicesPage.INPUT_MOBILE_OS),
                Hit.the(Keys.DOWN).keyIn(DevicesPage.INPUT_MOBILE_OS),
                Hit.the(Keys.ENTER).keyIn(DevicesPage.INPUT_MOBILE_OS)
        );
    }
}
