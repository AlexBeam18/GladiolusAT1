package com.Google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class Google {
    private WebDriver chromeDriver;


    @FindAll(@FindBy(how = How.CLASS_NAME, className = "g"))
    List<WebElement> news;

    public List<WebElement> getNews() {
        return news;
    }
    public Google (WebDriver chromeDriver){
        this.chromeDriver=chromeDriver;
    }

}
