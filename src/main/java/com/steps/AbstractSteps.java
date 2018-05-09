package com.steps;

import com.pages.HeaderPage;
import com.pages.LoginPage;

import net.thucydides.core.steps.ScenarioSteps;

public class AbstractSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;

	public void navigateTo(String URL) {
		getDriver().get(URL);
	}

	public HeaderPage getHeaderPage() {
		return getPages().currentPageAt(HeaderPage.class);
	}
	
	public LoginPage getLoginPage() {
		return getPages().currentPageAt(LoginPage.class);
	}

}
