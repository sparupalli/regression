package au.com.sherpa.regression.pages.common;

import java.util.List;

import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HelperPage extends PageObject{

	public WebElement getTableCellWithUniqueString(WebElement table, String uniqueString){
		
		List<WebElement> tableCells = table.findElements(By.tagName("td"));
		for(WebElement tableCell:tableCells){
			if(tableCell.getText().contains(uniqueString)){
				return tableCell;
			}
		}
		return null;
	}
	
}
