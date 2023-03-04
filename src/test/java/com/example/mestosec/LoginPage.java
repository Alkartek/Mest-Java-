package com.example.mestosec;

import com.codeborne.selenide.SelenideElement;

import java.nio.channels.SelectionKey;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    private final SelenideElement USER = $x("//input[@id='email']");
    private final SelenideElement PASSWORD = $x("//input[@id='password']");
    private final SelenideElement BUTTON = $x("//button[contains(text(),'Войти')]");
    private final SelenideElement REGISTRATION = $x("//a[contains(text(),'Регистрация')]");
    private final SelenideElement LOGINASSERT = $x("//h3[contains(text(),'Вход')]");


    public void click_to_mesto(String LOGIN_USER, String PASSWORD_USER){
        USER.sendKeys(LOGIN_USER);
        PASSWORD.sendKeys(PASSWORD_USER);
        BUTTON.click();
    }

    public void registr_button(){REGISTRATION.click();}
    public String assrt_logout(){return LOGINASSERT.getText();}

}
