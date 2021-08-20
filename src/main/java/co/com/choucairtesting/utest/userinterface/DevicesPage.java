package co.com.choucairtesting.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesPage {
    public static final Target BUTTON_NEXT_DEVICES=Target.the("button that lead us to the devices' page").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target DATA_FROM_PC= Target.the("automatic autocompleted data from the user PC").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target BUTTON_REMOVE_PC=Target.the("button that removes the completed automatically data from computer section").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/a/i"));

    public static final Target BUTTON_COMPUTER=Target.the("button that contains the computer").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_COMPUTER=Target.the("field that contains the computer").located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target BUTTON_VERSION=Target.the("button that contains the version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_VERSION=Target.the("field that contains the version").located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target BUTTON_LANGUAGE_PC=Target.the("button that contains the pc language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_LANGUAGE_PC=Target.the("field that contains the pc language").located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));

    public static final Target BUTTON_MOBILE=Target.the("button that contains the mobile").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBILE=Target.the("field that contains the mobile").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));

    public static final Target BUTTON_MODEL=Target.the("button that contains the mobile model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MODEL=Target.the("field that contains the mobile model").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));

    public static final Target BUTTON_MOBILE_OS=Target.the("button that contains the mobile os").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MOBILE_OS=Target.the("field that contains the mobile os").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));

}
