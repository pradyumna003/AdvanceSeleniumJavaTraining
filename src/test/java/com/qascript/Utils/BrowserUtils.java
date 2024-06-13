package com.qascript.Utils;

import com.qascript.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class BrowserUtils extends BaseClass {

    Properties properties=PropertyUtil.loadUserProperties();
    public static void clickElement(String element){
        driver.findElement(By.xpath(element)).click();
    }

    public static void enterText(String element,String text){
        driver.findElement(By.xpath(element)).sendKeys(text);
    }

    // to use customise find element along with some explicit wait

//    public static WebElement findAndWaitForElement(String xpath){
//       String timeout=properties.getProperty("timeout.maximum);
//
//        WebElement element= null;
//
//        try {
//            WebDriverWait wait = new WebDriverWait(driver, Long.getLong(timeout);
//
//            element=wait.until(ExpectedCondition.elementToBeClickedable(driver.findElement(By.xpath(xpath))));
//        }
//
//        catch (Exception e){
//            System.out.println("Element not found");
//        }
//
//        return element;
//    }

}
