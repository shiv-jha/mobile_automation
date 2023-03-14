package common;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class Utilities {
	public static void clickElementWithAccessiblityID(IOSDriver driver,String accessiblityID) {
		IOSElement element = (IOSElement) new WebDriverWait(driver, 30).until(
		        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(accessiblityID)));
		element.click();
	}
	
	public static void setTextWithAccessiblityID(IOSDriver driver,String accessiblityID, String text) {
		IOSElement element = (IOSElement) new WebDriverWait(driver, 30).until(
		        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId(accessiblityID)));
		element.sendKeys(text);
	}
}
