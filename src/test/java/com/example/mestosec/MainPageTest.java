package com.example.mestosec;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.Assert;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPageTest extends BaseTest {
    MainPage mainPage = new MainPage();

    private final static String LOGIN = "ThisISTestMain@mail.ru";
    private final static String PASSWORD_NUMBER = "123456789";
    private final static String LINK_IMAGE = "https://code.s3.yandex.net/qa-automation-engineer/python/files/avatarSelenium.png.";
    private final static String NAME = "Demi";
    private final static String DSC = "Junior";


    @Test
    public void loginPage(){
        LoginPage loginPage = new LoginPage();
        loginPage.click_to_mesto(LOGIN, PASSWORD_NUMBER);
        MainPage mainPage1 = new MainPage();
        mainPage1.logout();
        String second_result = loginPage.assrt_logout();
        Assert.assertTrue(second_result.equals("Вход"));

    }

    @Test
    public void changes(){
        LoginPage loginPage = new LoginPage();
        loginPage.click_to_mesto(LOGIN, PASSWORD_NUMBER);
        MainPage mainPage1 = new MainPage();
        mainPage1.changeImage(LINK_IMAGE, NAME, DSC);
    }


}
