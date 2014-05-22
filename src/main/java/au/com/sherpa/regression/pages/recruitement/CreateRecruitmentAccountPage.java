package au.com.sherpa.regression.pages.recruitement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateRecruitmentAccountPage extends PageObject {
	
	@FindBy(linkText = "Add new recruitment account")
	private WebElement addNewRecruitmentAccountLink;
	
	public void clickOnAddNewRecruitmentAccountLink(){
		$(addNewRecruitmentAccountLink).click();
	}
	
	
	
	/**
	 * Create Recruitment Account
	 */
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_txtGroupName")
	private WebElement accountNameField;

	@FindBy(id = "ctl00_ContentPlaceHolder1_txtDesc")
	private WebElement accountDescription;
	
	@FindBy(id = "imgMultiOptsShow")
	private WebElement showMultiPostOptionsImage;
	
	@FindBy(id = "imgRecOptsShow")
	private WebElement showMultipRecruitmentOptionsImage;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_chkOnYourSite_ToggleButton")
	private WebElement yourOwnSite;

	@FindBy(id = "ctl00_ContentPlaceHolder1_chkInternal_ToggleButton")
	private WebElement internalSite;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_txtInteralDays")
	private WebElement internalAddExpiryDays;	
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_txtOysDays")
	private WebElement ownSiteAddExpiryDays;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_chkSeek_ToggleButton")
	private WebElement seekSite;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_chkCareerOne_ToggleButton")
	private WebElement careenOneSite;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_chkAutopeople_ToggleButton")
	private WebElement autoPeopleSite;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_chkFacebook_ToggleButton")
	private WebElement facebookSite;
	
	@FindBy(linkText = "Save")
	private WebElement savePage;
	
	
	public void enterAccountName(String accountName){
		$(accountNameField).type(accountName);
	}
	
	public void enterDescriptionField(String desc){
		$(accountDescription).type(desc);
	}
	
	public void clickShowMultiPostOptions(){
		$(showMultiPostOptionsImage).click();
	}
	
	public void selectInternalSiteOptions(){
		$(internalSite).click();		
	}
	
	public void enterInternalJobExpiryDays(String days){
		this.waitFor(ExpectedConditions.visibilityOf(internalAddExpiryDays));
		$(internalAddExpiryDays).type(days);
	}
	
	public void selectOwnSiteOptions(){
		$(yourOwnSite).click();		
	}
	
	public void enterOwnSiteJobExpiryDays(String days){
		this.waitFor(ExpectedConditions.visibilityOf(ownSiteAddExpiryDays));
		$(ownSiteAddExpiryDays).type(days);
	}
	
	public void clickSaveOnCreateRecruitmentAccountPage(){
		$(savePage).click();		
	}
	
}
