package co.com.choucairtesting.utest.stepdefinitions;

import co.com.choucairtesting.utest.model.UTestData;
import co.com.choucairtesting.utest.questions.Answer;
import co.com.choucairtesting.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that julian wants to sign up to utest$")
    public void thatJulianWantsToSignUpToUtest() {
        OnStage.theActorCalled("Julian").wasAbleTo(OpenUp.thePage());
    }


    @When("^he clicks on the join today button$")
    public void heClicksOnTheJoinTodayButton() {
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOn.joinToday());

    }

    @When("^he introduces his personal data$")
    public void heIntroducesHisPersonalData(List<UTestData> uTestData) {
        OnStage.theActorInTheSpotlight().attemptsTo((Fill.thePersonalInfo(
                uTestData.get(0).getStrFistName(),
                uTestData.get(0).getStrLastName(),
                uTestData.get(0).getStrEmailAddress(),
                uTestData.get(0).getStrBirthMonth(),
                uTestData.get(0).getStrBirthDay(),
                uTestData.get(0).getStrBirthYear(),
                uTestData.get(0).getStrUserLanguage()
        )));
        OnStage.theActorInTheSpotlight().attemptsTo(Choose.theLocation(
                uTestData.get(0).getStrCity(),
                uTestData.get(0).getStrZipPostalCode(),
                uTestData.get(0).getStrCountry()
        ));
        OnStage.theActorInTheSpotlight().attemptsTo(SelectAll.theDeviceInfo(
                uTestData.get(0).getStrComputerOs(),
                uTestData.get(0).getStrOsVersion(),
                uTestData.get(0).getStrComputerLanguage(),
                uTestData.get(0).getStrMobileDevice(),
                uTestData.get(0).getStrModel(),
                uTestData.get(0).getStrMobileOs()
        ));
        OnStage.theActorInTheSpotlight().attemptsTo(Configue.thePrivacyOptions(
                uTestData.get(0).getStrPassword()
        ));


    }

    @Then("^the register is complete$")
    public void theRegisterIsComplete(List<UTestData> uTestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getStrSuccessfulSignUpMessage())));
    }
}
