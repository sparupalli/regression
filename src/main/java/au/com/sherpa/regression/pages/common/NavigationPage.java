package au.com.sherpa.regression.pages.common;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPage extends PageObject{
	
	public NavigationPage(WebDriver driver){
		super(driver);
	}
	
	
	@FindBy(css = ".nav__button.drodown-toggle")
	private WebElement navbarDropdown;
	
	@FindBy(linkText = "Recruitment")
	private WebElement recruitmentLink;
	
	@FindBy(id = "ctl00_PageNavigation_PageNavigationUserMenu_UserAvatar")
	private WebElement profileAvatar;
	
	@FindBy(linkText = "Settings")
	private WebElement settingsLink;
	
	public void navigateToRecruitment(){
		$(navbarDropdown).click();
		$(recruitmentLink).click();
	}
	
	public void navigateToSettings(){
		$(profileAvatar).click();
		$(settingsLink).click();
	}
	
	
	/**
	 * Side Navigation
	 */
	
	@FindBy(linkText = "Recruitment Accounts")
	private WebElement recruitmentAccountsLink;
	
	public void clickRecruitmentAccountsLink(){
		$(recruitmentAccountsLink).click();		
	}
	
	
	/**
	 * Recruitment Menu
	 */
	
	@FindBy(linkText = "Manage Job Ads")
	private WebElement manageJobAdsLink;
	
	public void clickOnManageJobAdsLink(){
		manageJobAdsLink.click();
	}
	
	

}
