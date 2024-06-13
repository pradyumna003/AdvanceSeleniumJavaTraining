package com.qascript.PageObjects;

import com.qascript.BaseClass;
import com.qascript.Utils.BrowserUtils;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {

    private static String txtEmail="//*[@id=\"input-email\"]";
    private static String txtPassword="//*[@id=\"input-password\"]";

    private static String btnLogin="//*[@id=\"content\"]/div/div[2]/div/form/input";

    private static String linkForgetPassword="//*[@id=\"content\"]/div/div[2]/div/form/div[2]/a";


    public static void enterUserName(String Username){
//        driver.findElement(By.xpath(txtEmail)).sendKeys(Username);
        BrowserUtils.enterText(txtEmail,Username);
    }

    public static void enterPassword(String Password){
//        driver.findElement(By.xpath(txtPassword)).sendKeys(Password);
        BrowserUtils.enterText(txtPassword,Password);

    }

    public static void clickLogin(){
        BrowserUtils.clickElement(btnLogin);
        //driver.findElement(By.xpath(btnLogin)).click();
    }

    public static void clickForgettenPassword(){
        driver.findElement(By.xpath(linkForgetPassword)).click();
    }



}
