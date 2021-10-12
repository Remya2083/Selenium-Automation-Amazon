package com.amazon.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.base.TestBase;

public class CheckoutPage extends TestBase{

	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement checkoutBtn1;
/*	@FindBy(xpath="//a[@id='hlb-ptc-btn-native']")
	WebElement checkoutBtn2;*/
	
	@FindBy(xpath="//*[contains(text(),'Proceed to checkout')]")
	WebElement checkoutbtn;
	@FindBy(xpath="//*[contains(text(),'Proceed to checkout')][1]")
	WebElement checkoutbtn1;
	
	@FindBy(xpath="//*[contains(text(),'Go to Cart')]")
	WebElement checkoutbtn2;
	
	@FindBy(xpath="//div[@class='a-alert-content']//h4")
	WebElement xpathActual;
	
	
	public CheckoutPage() {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public String verifyPaymentText() {
		return xpathActual.getText();
	}
	
	public PaymentPage clickCheckout() {
		checkoutbtn.click();
		return new PaymentPage();
	}
	/*public PaymentPage clickCheckout2() {
		checkoutBtn2.click();
		return new PaymentPage();
	}*/
	
	/*public PaymentPage clickCheckout() {
		try {			
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", checkoutbtn);
			//checkoutbtn.click();
		//	return new PaymentPage();
		}
		catch(Exception e){
			checkoutBtn1.click();
			//WebDriverWait wait=new WebDriverWait(driver,20);
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();", checkoutBtn1);
			//checkoutbtn1.click();
		//	return new PaymentPage();
		//	wait.until(ExpectedConditions.visibilityOf(checkoutBtn1));
		//	checkoutBtn1.click();
		}
		return new PaymentPage();
		
		
	}*/
	
	
}
