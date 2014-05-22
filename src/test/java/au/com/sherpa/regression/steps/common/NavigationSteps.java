package au.com.sherpa.regression.steps.common;

import au.com.sherpa.regression.pages.common.NavigationPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NavigationSteps extends ScenarioSteps{

	private static final long serialVersionUID = 1L;
	
	NavigationPage navigation;
	
	@Step
	public void navigate_to_recruitment(){
		navigation.navigateToRecruitment();
	}
	
	@Step
	public void navigate_to_settings(){
		navigation.navigateToSettings();
	}

	@Step
	public void click_RecruitmentAccounts_Link(){
		navigation.clickRecruitmentAccountsLink();
		
	}
	
	@Step
	public void navigate_to_Manage_Job_Ads_page(){
		navigation.clickOnManageJobAdsLink();
	}
	
}
