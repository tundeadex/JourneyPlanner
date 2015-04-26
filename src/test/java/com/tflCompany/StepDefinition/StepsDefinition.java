package com.tflCompany.StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Babatunde on 20/04/2015.
 */
public class StepsDefinition {

    WebDriver JourneyPlanner;
    WebDriverWait wait;

    @Before

    public void setup() {
        JourneyPlanner = new FirefoxDriver();
        wait = new WebDriverWait(JourneyPlanner, 30);
    }

    @After

    public void tearDown() {
        JourneyPlanner.quit();
    }

    @Given("^I am on LondonUnderground website$")
    public void i_am_on_LondonUnderground_website()  {
        JourneyPlanner.get("http://www.tfl.gov.uk/");
        Assert.assertEquals("http://www.tfl.gov.uk/", JourneyPlanner.getCurrentUrl());
    }

@When("^I entered valid underground stations$")
public void i_entered_valid_underground_stations() {
    JourneyPlanner.findElement(By.cssSelector("input#InputFrom")).sendKeys("Barking(London)Barking station");
    JourneyPlanner.findElement(By.cssSelector("input#InputTo")).sendKeys("West Ham(London)West Ham Station");
    JourneyPlanner.findElement(By.cssSelector("input.primary-button")).click();

}
public boolean checkIamOnJourneyPlannerPage(){

    return JourneyPlanner.getTitle() .equals("span.hero-headline");
}

@Then("^Display journey results and journey details$")
public void display_journey_results_and_journey_details()  {
    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.carousel-wrap > div:nth-child(1)")));
//    JourneyPlanner.findElement(By.cssSelector("div.carousel-wrap > div:nth-child(1) button")).click();

}
public boolean checkJourneyDetailsAreDisplayed(){
return JourneyPlanner.findElement(By.cssSelector("div.carousel-wrap > div:nth-child(1)")).isDisplayed();
}
}