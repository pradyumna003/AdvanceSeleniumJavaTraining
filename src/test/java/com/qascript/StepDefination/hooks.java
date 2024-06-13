package com.qascript.StepDefination;

import com.qascript.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks extends
        BaseClass {

//    WebDriver driver;

    @Before
    public void setup(){

        initializeDriver();

//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
//        driver.manage().window().maximize();


    }

    @After
    public void close(){
        closeDriver();
    }
}
