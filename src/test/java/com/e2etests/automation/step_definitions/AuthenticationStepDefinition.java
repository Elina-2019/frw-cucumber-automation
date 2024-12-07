package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import com.e2etests.automation.page_objects.AuthenticationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

			 
	 private AuthenticationPage authenticationPage; 
		public AuthenticationStepDefinition(){
		this.authenticationPage = new AuthenticationPage();
				}
	@Given("Je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		authenticationPage.goToURL();
	}

	@When("Je saisis le user name {string}")
	public void jeSaisiLeUserName(String name) {
		authenticationPage.fillUserName(name);
	}

	@When("Je saisis le password {string}")
	public void jeSaisiLePassword(String password) {
		authenticationPage.fillPassword(password);
	}

	@When("Je clique sur le bouton submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authenticationPage.clickOnSubmitButton();
	}

	@Then("Je me redirige vers la page Home {string}")
	public void jeMeRedirigEVersLaPageHome(String text) {
		
		String message =  authenticationPage.welcomeMessage.getText();
		Assert.assertEquals(message, text);
		
		
	}

}
