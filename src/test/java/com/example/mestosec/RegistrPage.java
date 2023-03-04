package com.example.mestosec;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RegistrPage {
    private final SelenideElement EMAIL = $x("//input[@id='email']");
    private final SelenideElement PASSWORD = $x("//input[@id='password']");
    private final SelenideElement BUTTON = $x("//button[contains(text(),'Зарегистрироваться')]");
    private final SelenideElement BADREG = $x("//p[@class=\"popup__status-message\"]/text()");
    public void registerProc(String mail, String Pass){
        EMAIL.sendKeys(mail);
        PASSWORD.sendKeys(Pass);
        BUTTON.click();
    }

    public String assert_bad_reg(){return BADREG.getText();}
}
