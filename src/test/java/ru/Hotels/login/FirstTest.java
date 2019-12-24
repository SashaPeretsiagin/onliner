package ru.Hotels.login;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import ru.Hotels.WebDriverSettings;

public class FirstTest extends WebDriverSettings {
    @Test

    public void firstTest() {
      HomePage homePage = PageFactory.initElements(driver, HomePage.class);
      homePage.open();
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Onliner"));
    }
    @Test
    public void secondTest(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        driver.manage().window().setSize(new Dimension(100,100));
        driver.get("https://www.onliner.by");
        driver.quit();
    }

    @Test
    public void regFailureTest(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.getStarted();
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        Assert.assertTrue(loginPage.getErrorLogin().equals("Укажите ник или e-mail"));
        Assert.assertTrue(loginPage.getErrorPassword().equals("Укажите пароль"));

    }
}
