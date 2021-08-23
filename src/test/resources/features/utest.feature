#Autor: Julian Hernandez
@stories
Feature: Testing uTest
  As an user, I want to sign up to utest
  @scenario1:
  Scenario Outline: sign up to utest.com
    Given that julian wants to sign up to utest
    When he clicks on the join today button
    And he introduces his personal data
      | strFistName      | strLastName   |   strEmailAddress    |  strBirthMonth  |  strBirthDay  |  strBirthYear   |  strUserLanguage  |  strCity  |  strZipPostalCode  |  strCountry  |  strComputerOs  |  strOsVersion  |  strComputerLanguage  |  strMobileDevice  |  strModel  |  strMobileOs  |  strPassword  |
      |  <strFistName>   | <strLastName> |   <strEmailAddress>  | <strBirthMonth> | <strBirthDay> |  <strBirthYear> | <strUserLanguage> | <strCity> | <strZipPostalCode> | <strCountry> | <strComputerOs> | <strOsVersion> | <strComputerLanguage> | <strMobileDevice> | <strModel> | <strMobileOs> | <strPassword> |
    Then the register is complete
      |                       strSuccessfulSignUpMessage                         |
      | Welcome to the world's largest community of freelance software testers!  |
    Examples:
      | strFistName | strLastName |   strEmailAddress    | strBirthMonth | strBirthDay | strBirthYear  | strUserLanguage  | strCity | strZipPostalCode | strCountry  | strComputerOs | strOsVersion |  strComputerLanguage  |  strMobileDevice  |  strModel   |  strMobileOs  |   strPassword   |
      |   Andres    |  Hernandez  | andrestest12@gmail.com |      May      |      10     |     1998      |     Spanish      |  Bogota |       507001     |  Colombia   |    Windows    |      10      |        Spanish        |     Motorola      | One Fusion  |   Android 10  |  ConTrasena.J1  |