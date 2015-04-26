package com.tflCompany.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Babatunde on 20/04/2015.
 */
public class TflJourneyDetails {

WebDriver myDriver;

public TflJourneyDetails(WebDriver driver){

myDriver= driver;
}

public void displayJourneyDetails(){
    myDriver.findElement(By.cssSelector("div.carousel-wrap > div:nth-child(1) button")).click();

}

public boolean checkJourneyDetailsAreDisplayed(){
    return myDriver.findElement(By.cssSelector("div.carousel-wrap > div:nth-child(1) button")).isDisplayed();
}
}
