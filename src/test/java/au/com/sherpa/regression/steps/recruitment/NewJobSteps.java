package au.com.sherpa.regression.steps.recruitment;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import au.com.sherpa.regression.pages.recruitement.ManageJobAdsPage;
import au.com.sherpa.regression.pages.recruitement.WriteYourAd;

public class NewJobSteps extends ScenarioSteps{

	private static final long serialVersionUID = 1L;
	
	ManageJobAdsPage manageJobAdsPage;
	WriteYourAd writeYourAd;
	
	@Step
	public void goto_new_job_page(){
		manageJobAdsPage.clickOnNewJobLink();
	}
	
	@Step
	public void enter_job_title(String jobTitle){
		writeYourAd.enterJobTitle(jobTitle);
	}

	@Step
	public void enter_Stores_for_the_post(String...stores){
		writeYourAd.enterStores(stores);
	}
	
	@Step
	public void select_region_for_the_jobpost(String region){
		writeYourAd.selectRegionForJobPost(region);
		
	}
	
	@Step
	public void select_area_for_the_jobpost(String area){		
		writeYourAd.selectAreaForPost(area);
	}
	
	@Step
	public void select_employment_type(String employmentType){
		writeYourAd.selectEmploymentType(employmentType);
	}

	@Step
	public void enter_Ad_summary(String adSummary){ 
		writeYourAd.enterAdSummary(adSummary);	
	}

	@Step
	public void enter_Ad_reference(String adReference){
		writeYourAd.enterAdReference(adReference);
	}
	
	@Step
	public void enter_Ad_Body_content(String adBodyText){
		writeYourAd.enterAdBodyContent(adBodyText);
	}
	
	@Step
	public void select_Application_questions_template(String questionsTemplate){
		writeYourAd.enterAdBodyContent(questionsTemplate);
	}
	
	
	
	
}
