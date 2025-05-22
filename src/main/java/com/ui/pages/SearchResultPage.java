package com.ui.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;


import com.ui.utils.BrowserUtility;

public class SearchResultPage extends BrowserUtility{
	
	
	private static final By SEARCHED_PRODUCTLISTING_TEXT = By.cssSelector("span.lighter");
	private static final By SEARCH_RESULT = By.cssSelector("span.heading-counter");
	private static final By PRODUCT_NAME = By.cssSelector("h5[itemprop='name'] > a.product-name");

	
	public String getSearchProductListing() {
		
		return getText(SEARCHED_PRODUCTLISTING_TEXT);
	}
	
	public int getCountOfActualProduct() {
		
		return getProductList(PRODUCT_NAME).size();
	}
	
   public boolean isSearchTermPresentinProductList(String keyword) {
	   
	   List<String> keywords = Arrays.asList(keyword.toLowerCase().split(" "));
	   
	   List<String> productNamesList= getNameOfProductList(PRODUCT_NAME);
	   
	  return  productNamesList.stream().anyMatch(x->keywords.stream().anyMatch(x.toLowerCase()::contains));
	   
	   
	}
   
   
   public ProductDetailPage selectProductAt(int index) {
	   
	       click(getProductList(PRODUCT_NAME).get(index));
	       return new ProductDetailPage();
	   
   }
   
  
	

}
