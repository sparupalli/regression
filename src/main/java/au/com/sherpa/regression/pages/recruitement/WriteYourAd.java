package au.com.sherpa.regression.pages.recruitement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WriteYourAd extends PageObject{
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_AdFormEntry_JobTitle")
	private WebElement jobTitleField;
	
	@FindBy(css = "#ctl00_ContentPlaceHolder1_AdFormEntry_StoreLookup_pnlsearchExtenderScroll .searchExtenderInputBox .inboxHint")
	private WebElement storesSelectionField;
	
	@FindBy(id = "RegionAreaLocator_ddlRegion")
	private WebElement regionDropdown;
	
	@FindBy(id = "RegionAreaLocator_ddlLocation")
	private WebElement areaDropDown;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_AdFormEntry_JobtypeListBox_JobType")
	private WebElement employmentTypeField;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_AdFormEntry_AdSalary_salarytype_0")
	private WebElement salaryAnnual;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_AdFormEntry_AdSalary_salarytype_1")
	private WebElement salaryHourlyRate;

	@FindBy(id = "ctl00_ContentPlaceHolder1_AdFormEntry_AdSalary_salarytype_2")
	private WebElement salaryDailyRate;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_AdFormEntry_AdSalary_amountType_0")
	private WebElement salaryRange;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_AdFormEntry_AdSalary_amountType_1")
	private WebElement salaryAmount;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_AdFormEntry_AdSalary_divcboMinAnnualSalary")
	private WebElement minimumSalary;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_AdFormEntry_AdSalary_divcboMaxAnnualSalary")
	private WebElement maximumSalary;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_AdFormEntry_AdSalary_salaryCurrency2")
	private WebElement salaryCurrency;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_AdFormEntry_AdSalary_chkDisplaySalary")
	private WebElement displaySalaryOnJob;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_AdFormEntry_AdSalary_additionalSalaryInfo")
	private WebElement additionalInformation;

	@FindBy(id = "ctl00_ContentPlaceHolder1_AdFormEntry_Summary")
	private WebElement adSummaryWriteTextArea;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_AdFormEntry_YourRef")
	private WebElement yourReferenceField;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_AdFormEntry_DisplayableInfo_ifr")
	private WebElement adBodyFrame;
	
	@FindBy(css = "#tinymce")
	private WebElement writeAdBody;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_ddlQuestionTemplates")
	private WebElement questionsTemplate;
	
	@FindBy(linkText = "Save & Continue")
	private WebElement saveAndContinueButton;
	
	public void enterJobTitle(String jobTitle){
		$(jobTitleField).type(jobTitle);
	}
	
	public void selectRegionForJobPost(String region){
		$(regionDropdown).selectByVisibleText(region);
	}
	
	public void selectAreaForPost(String area){
		this.waitForAnyTextToAppear(areaDropDown, area);
		$(areaDropDown).selectByVisibleText(area);
	}
	
	public void enterStores(String...stores){
		for(String store: stores){
			$(storesSelectionField).sendKeys(store);
		}
	}
	
	public void selectEmploymentType(String employmentType){
		$(employmentTypeField).selectByVisibleText(employmentType);
	}
	
	public void selectSalaryTypeAsAnnual(){
		$(salaryAnnual).click();
	}
	
	public void selectSalaryAsRange(){
		$(salaryRange).click();
	}
	
	public void selectSalaryMininum(String minimumSalary){
		$(minimumSalary).selectByVisibleText(minimumSalary);
	}
	
	public void selectSalaryMaximum(String maximumSalary){
		$(maximumSalary).selectByVisibleText(maximumSalary);
	}
	
	public void selectSalaryCurrency(String currency){
		$(salaryCurrency).selectByVisibleText(currency);
	}
	
	public void selectDisplaySalaryInJobAdCheckBox(){
		$(displaySalaryOnJob).click();
	}
	
	public void enterAdSummary(String adSummary){
		$(adSummaryWriteTextArea).type(adSummary);
	}
	
	public void enterAdReference(String adReference){
		$(yourReferenceField).type(adReference);
	}
	
	
	private void switchToAdBodyFrame(){
		this.getDriver().switchTo().frame(this.getDriver().findElement(By.id("ctl00_ContentPlaceHolder1_AdFormEntry_DisplayableInfo_ifr")));
	}
	
	private void switchBackToMainWindow(){
		this.getDriver().switchTo().defaultContent();
	}
	
	public void enterAdBodyContent(String adBodyText){
		switchToAdBodyFrame();

		this.getJavascriptExecutorFacade();
//		.executeScript("tinyMCE.activeEditor.setContent('<h1>Native API text</h1> TinyMCE')");
//		switchBackToMainWindow();
		this.getDriver().getPageSource();
	}
	
	public void selectQuestionsTemplate(String questionsTemplate){
		$(questionsTemplate).selectByVisibleText(questionsTemplate);
	}
	
	public void clickSaveAndContinueButton(){
		$(saveAndContinueButton).click();
	}
}

