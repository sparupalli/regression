package au.com.sherpa.regression.tests.recruitment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
import au.com.sherpa.regression.steps.common.NavigationSteps;
import au.com.sherpa.regression.steps.recruitment.NewJobSteps;
import au.com.sherpa.regression.steps.recruitment.RecruitmentSteps;


@Story(Application.Recruitment.CreateRecruitmentAccount.class)
@RunWith(ThucydidesRunner.class)
public class BasicRecruimentTest {

	@Managed(uniqueSession=true)
	WebDriver driver;

	@ManagedPages(defaultUrl = "http://thehubtest.sherpanetwork.com.au")
	Pages pages;
	
	@Steps
	LoginSteps loginSteps;

	@Steps
	NavigationSteps navSteps;
	
	@Steps
	RecruitmentSteps recruitmentSteps;
	
	@Steps
	NewJobSteps newJobSteps;
	
	public String getRandomString(){
		DateFormat format = new SimpleDateFormat("ddMMyyyyHHmmss");
		Date date = new Date();
		return format.format(date);		
	}
	
	String rand = getRandomString();
	
	@Ignore
	@Test	
	public void verify_successful_creation_of_recruitment_account(){		
		loginSteps.login_to_Application("Admin", "TwoShakes");
		navSteps.navigate_to_settings();
		navSteps.click_RecruitmentAccounts_Link();
		recruitmentSteps.click_on_Add_new_recruitment_account_link();
		recruitmentSteps.enter_account_name("AutoAccount"+rand);
		recruitmentSteps.enter_account_description("Auto Account Descriptin"+rand);
		recruitmentSteps.click_multipost_option();
		recruitmentSteps.select_internal_site_option("2");
		recruitmentSteps.select_own_site_options("2");
		recruitmentSteps.save_Create_recruitment_Account_page();	
		
		//Verification
		navSteps.click_RecruitmentAccounts_Link();
		recruitmentSteps.click_All_accounts_filter();
		recruitmentSteps.verify_whether_a_recruitment_account_is_created("AutoAccount"+rand);		
	}
	
	
	@Test
	public void verify_successful_creation_of_a_post(){
		loginSteps.login_to_Application("Admin", "TwoShakes");
		navSteps.navigate_to_recruitment();
		navSteps.navigate_to_Manage_Job_Ads_page();
		newJobSteps.goto_new_job_page();
		newJobSteps.enter_job_title("JOB"+rand);
		newJobSteps.select_region_for_the_jobpost("All Australia");
		newJobSteps.select_area_for_the_jobpost("Everywhere in Australia");
		newJobSteps.select_employment_type("Full time");
		newJobSteps.enter_Ad_summary("JOB"+rand+" Post Summary");
		newJobSteps.enter_Ad_reference("JOBREF"+rand);
		newJobSteps.enter_Ad_Body_content("JOB"+rand+" 1234567890 1234567890 1234567890 1234567890 1234567890");
		newJobSteps.select_Application_questions_template("RSA Certificate");
	}
	
	
	
	
	
	
}
