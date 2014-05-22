package au.com.sherpa.regression.steps.common;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import au.com.sherpa.regression.pages.common.LoginPage;

public class LoginSteps extends ScenarioSteps{

	private static final long serialVersionUID = 1L;

	LoginPage loginPage;
	
	@Step
	public void login_to_Application(String username, String password){
		loginPage.gotoApp();
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickLoginButton();
	}
	
	@Step
	public void share_A_picture(String fileLocation){
		loginPage.clickStatusText();
		loginPage.clickPictureLink();
		enter_File_Name(fileLocation);
		loginPage.clickShareLink();
		
	}
	
	@Step
	public void enter_File_Name(String filelocation){
		loginPage.enterFileName(filelocation);
	}
	
	
}
