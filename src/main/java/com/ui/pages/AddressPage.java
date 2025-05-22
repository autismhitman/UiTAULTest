package com.ui.pages;

import org.openqa.selenium.By;

import com.ui.pojos.Address;
import com.ui.utils.BrowserUtility;

public class AddressPage extends BrowserUtility{
	
	
	private static final By ADDRESS_FIELD =By.id("address1");
	private static final By CITY_FIELD= By.id("city");
	private static final By STATE_FIELD=By.id("id_state");//select
	private static final By ZIP_CODE= By.id("postcode");
	private static final By PHONE_FIELD= By.id("phone");
	private static final By MOBILE_PHONE_FIELD= By.id("phone_mobile");
	private static final By ADDRESS_ALIAS_FIELD = By.id("alias");
	private static final By SAVE_BTN= By.id("submitAddress");
	private static final By address_Heading = By.tagName("h3");
	
	public String enterAddressAndSave(Address address) {
		
		enterText(address.getAddress_line(),ADDRESS_FIELD);
		enterText(address.getCity(),CITY_FIELD);
		selectFromDropDown(STATE_FIELD, address.getState());
		enterText(address.getZip(),ZIP_CODE);
		enterText(address.getPhone(),PHONE_FIELD);
		enterText(address.getMobile(),MOBILE_PHONE_FIELD);
		clearAndEnterText(address.getAlias(),ADDRESS_ALIAS_FIELD);	
		click(SAVE_BTN);
		String header = getText(address_Heading);
		return header;
	}

	

}
/*

*/
