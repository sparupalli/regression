package au.com.sherpa.regression.pages.common;


import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;


public class LoginPage extends PageObject{

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl00_Signin_inpUserName")
	private WebElement userName;	
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl00_Signin_inpPassword")
	private WebElement passWord;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl00_Signin_btnLogin")
	private WebElement submitButton;
	
	@FindBy(linkText = "Picture")
	private WebElement pictureLink;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_FileUpload")
	private WebElement fileUploader;	
	
	@FindBy(id = "txtUserStatus")
	private WebElement statusText;
	
	@FindBy(id = "ctl00_ContentPlaceHolder1_lnkStatusWithFile")
	private WebElement shareLink;
		
	public void clickStatusText(){
		statusText.click();
	}

	public void clickShareLink(){
		shareLink.click();		
	}

	
	public void clickPictureLink(){
		pictureLink.click();
	}
	
	public void enterFileName(String fileLocation){
		this.waitABit(1000);
		fileUploader.sendKeys(fileLocation);
	}
	public void gotoApp() {
		this.open();		
	}

	public void enterUsername(String username) {
		$(userName).type(username);
	}

	public void enterPassword(String password) {
		$(passWord).type(password);		
	}

	public void clickLoginButton() {
		$(submitButton).click();		
	}
	
	
	
	
	
	
	
	
}
