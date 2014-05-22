package au.com.sherpa.regression.pages.recruitement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class ManageJobAdsPage extends PageObject{
	
	@FindBy(linkText = "NEW JOB")
	private WebElement newJobLink;
	
	
	
	public void clickOnNewJobLink(){
		$(newJobLink).click();
	}
	

}
