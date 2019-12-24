package ru.Hotels.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver,10);
    }
    @FindBy(className = "[class=\"auth-bar__item auth-bar__item--text\"]");
    private WebElement loginButton;


    public void open(){

        driver.get("https://www.onliner.by");
    }

    public void getStarted() {

        loginButton.click();
    }
}
