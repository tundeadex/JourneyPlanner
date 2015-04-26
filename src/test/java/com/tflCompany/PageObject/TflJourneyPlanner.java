package com.tflCompany.PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

/**
 * Created by Babatunde on 20/04/2015.
 */
public class TflJourneyPlanner {

WebDriver myDriver;

 public TflJourneyPlanner(WebDriver driver){

 myDriver= driver;
 }
public void fillingJourneyPlan(){

    myDriver.findElement(By.cssSelector("input#InputFrom")).sendKeys("Walthamstow Central Station");
    myDriver.findElement(By.cssSelector("input#InputTo")).sendKeys("Heathrow Airport Terminals 1-3");
    myDriver.findElement(By.cssSelector("input.primary-button")).click();
}

public boolean checkIamOnJourneyPlannerPage(){
    return myDriver.getTitle().equals("span.hero-headline");


}


}
