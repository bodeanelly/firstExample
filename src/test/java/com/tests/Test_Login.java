package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.AbstractSteps;
import com.steps.HeaderSteps;
import com.steps.LoginSteps;
import com.tools.constants.EnvironmentConstants;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class Test_Login {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public AbstractSteps abstractSteps;
	@Steps
	public HeaderSteps headerSteps;
	@Steps
	public LoginSteps loginSteps;

	@Test
	public void test_AsInitiatorCompleteApartmentGoodInformationAndCreateEvaluationRequestTypeEvaluation() {
		abstractSteps.navigateTo(EnvironmentConstants.BASE_URL);
		headerSteps.navigateToLoginPage();
		loginSteps.login(EnvironmentConstants.USERNAME, EnvironmentConstants.PASSWORD);
	}
}
