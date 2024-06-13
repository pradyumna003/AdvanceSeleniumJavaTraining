package com.qascript.StepDefination;

import com.qascript.PageObjects.LoginPage;
import com.qascript.Utils.PropertyUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class LoginStepdefs {

    WebDriver driver;

    Properties properties=PropertyUtil.loadApplicationProperties();


    @Given("User enters valid user name in the user name field")
    public void userEntersValidUserNameInTheUserNameField() {

        String Username=properties.getProperty("username");
        LoginPage.enterUserName(Username);
//        driver.findElement(By.id("input-email")).sendKeys("pradyissus@gmail.com");

    }

    @And("User enter valid password in the password field")
    public void userEnterValidPasswordInThePasswordField() {
        String password=properties.getProperty("password");
        LoginPage.enterPassword(password);
//        driver.findElement(By.id("input-password")).sendKeys("test@123");
    }

    @When("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        LoginPage.clickLogin();
        //driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input[1]")).click();
    }

    @Then("User is Logged in Successfully")
    public void userIsLoggedInSuccessfully() {
    }

    @Given("User enters invalid user name in the user name field")
    public void userEntersInvalidUserNameInTheUserNameField() {
    }

    @And("User enter invalid password in the password field")
    public void userEnterInvalidPasswordInThePasswordField() {
    }

    @Then("User is  not Logged in to the application")
    public void userIsNotLoggedInToTheApplication() {
    }
}
