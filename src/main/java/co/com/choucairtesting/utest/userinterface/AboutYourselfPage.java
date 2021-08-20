package co.com.choucairtesting.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AboutYourselfPage {
    public static final Target INPUT_FIRSTNAME=Target.the("field that contains the first name").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME=Target.the("field that contains the last name").located(By.id("lastName"));
    public static final Target INPUT_EMAIL=Target.the("field that contains the email").located(By.id("email"));

    public static final Target INPUT_MONTH=Target.the("field to select the birth month").located(By.id("birthMonth"));
    public static final Target INPUT_DAY=Target.the("field to select the birth day").located(By.id("birthDay"));
    public static final Target INPUT_YEAR=Target.the("field to select the birth year").located(By.id("birthYear"));


    public static final Target INPUT_LANGUAGE=Target.the("field to select the language").located(By.xpath("//div[@id='languages']//input[@type='search']"));
}
