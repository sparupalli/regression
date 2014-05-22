package au.com.sherpa.regression.pages.recruitement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

import au.com.sherpa.regression.pages.common.HelperPage;

public class RecruitmentAccountsPage extends PageObject{
	
	@FindBy(linkText = "All Accounts")
	private WebElement allAccountsFilterLink;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_grdGroups")
	private WebElement recruitmentAccountsTable;
	
	HelperPage helper;
	
	public WebElement getRecuitementAccountCell(String uniqueString){
		return helper.getTableCellWithUniqueString(recruitmentAccountsTable, uniqueString);
	}
	
	public boolean isAccountCreated(String uniqueString){
		if(getRecuitementAccountCell(uniqueString) != null){
			return true;
		}
		return false;
	}
	
	
	public void selectAllAccountsFilter(){
		$(allAccountsFilterLink).click();
	}
	
	

}
