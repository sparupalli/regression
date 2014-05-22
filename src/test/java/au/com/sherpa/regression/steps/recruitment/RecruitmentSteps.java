package au.com.sherpa.regression.steps.recruitment;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import au.com.sherpa.regression.pages.recruitement.CreateRecruitmentAccountPage;
import au.com.sherpa.regression.pages.recruitement.RecruitmentAccountsPage;

public class RecruitmentSteps extends ScenarioSteps{

	private static final long serialVersionUID = 1L;
	
	CreateRecruitmentAccountPage createRecruitmentAccountPage;
	RecruitmentAccountsPage recruitmentAccountsPage;
	
	@Step
	public void click_on_Add_new_recruitment_account_link(){
		createRecruitmentAccountPage.clickOnAddNewRecruitmentAccountLink();
	}
	
	@Step
	public void enter_account_name(String accountName){
		createRecruitmentAccountPage.enterAccountName(accountName);
	}
	
	@Step
	public void enter_account_description(String desc){
		createRecruitmentAccountPage.enterDescriptionField(desc);
	}
	
	@Step
	public void click_multipost_option(){
		createRecruitmentAccountPage.clickShowMultiPostOptions();
	}
	
	@Step
	public void select_internal_site_option(String expiresInDays){
		createRecruitmentAccountPage.selectInternalSiteOptions();
		createRecruitmentAccountPage.enterInternalJobExpiryDays(expiresInDays);
	}
	
	@Step
	public void select_own_site_options(String expiryInDays){
		createRecruitmentAccountPage.selectOwnSiteOptions();
		createRecruitmentAccountPage.enterOwnSiteJobExpiryDays(expiryInDays);
	}
	
	@Step
	public void save_Create_recruitment_Account_page(){
		createRecruitmentAccountPage.clickSaveOnCreateRecruitmentAccountPage();
	}
	
	@Step
	public void verify_whether_a_recruitment_account_is_created(String recruitmentAccountName){
		assertThat(recruitmentAccountsPage.isAccountCreated(recruitmentAccountName), is(true));
	}
	
	@Step
	public void click_All_accounts_filter(){
		recruitmentAccountsPage.selectAllAccountsFilter();
	}
	
}

