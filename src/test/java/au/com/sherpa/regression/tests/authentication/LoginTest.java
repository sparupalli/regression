package au.com.sherpa.regression.tests.authentication;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import au.com.sherpa.regression.requirements.Application;
import au.com.sherpa.regression.steps.common.LoginSteps;

@RunWith(ThucydidesRunner.class)
@Story(Application.Authentication.Login.class)
public class LoginTest {

	@Managed(uniqueSession=true)
	WebDriver driver;

	@ManagedPages(defaultUrl = "#HOST")
	Pages pages;
	
	@Steps
	LoginSteps loginSteps;
	
	@Ignore
	@Test	
	public void verify_if_user_can_login_to_application(){
		loginSteps.login_to_Application("Admin", "TwoShakes");
		loginSteps.share_A_picture(System.getProperty("user.dir")+"\\resources\\download.jpg");
	}
	
	
	
	
}
