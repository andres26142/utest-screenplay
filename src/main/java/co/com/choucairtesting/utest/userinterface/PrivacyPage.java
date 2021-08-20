package co.com.choucairtesting.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrivacyPage {
    public static final Target BUTTON_LAST_STEP=Target.the("button that lead us to the last page").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target PASSWORD = Target.the("input field that contains the password").located(By.id("password"));
    public static final Target PASSWORD_CONFIRMATION = Target.the("input field that contains the password confirmation").located(By.id("confirmPassword"));

    public static final Target BUTTON_STAY_INFORMED = Target.the("checkbox that accept to stay informed").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target BUTTON_TERMS = Target.the("checkbox that accept the terms an conditions").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target BUTTON_PRIVACY_POLICY = Target.the("checkbox that accept the privacy policy").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_COMPLETE = Target.the("button that lead us to complete the sgn up process").located(By.xpath("//*[@id=\"laddaBtn\"]"));
}
