package com.qascript;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;
    public static void initializeDriver(){

//        Properties properties=PropertiesUtil.loadApplicationProperties();
//        String url=properties.get("application.url").toString();

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

    }
    public static void closeDriver(){
        driver.quit();
    }
}
