package com.tflCompany.PageObject;

import org.openqa.selenium.WebDriver;

/**
 * Created by Babatunde on 20/04/2015.
 */
public class TflHomepage {

WebDriver myDriver;

public TflHomepage(WebDriver driver){

 myDriver= driver;
}

public void openTflHomepage(){

 myDriver.get("http://www.tfl.gov.uk/");
}
public boolean amIonTflHomepage(){
return myDriver.getCurrentUrl().equals("http://www.tfl.gov.uk/");
}
}
