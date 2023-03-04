package com.example.mestosec;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

// page_url = https://www.jetbrains.com/
public class MainPage {
    private final SelenideElement ASSERT_TEXT = $x("//h1[contains(text(),'Жак-Ив Кусто')]");
    private final SelenideElement LOGOUT = $x("//button[contains(text(),'Выйти')]");
    private final SelenideElement PROFILEIMMAGE = $x("//div[@class=\"profile__image\"]");
    private final SelenideElement LINKIMMAGE = $x("//input[@id='owner-avatar']");
    private final SelenideElement BUTTONIMMAGE = $x(".//form[@name='edit-avatar']/button[text()='Сохранить']");
    private final SelenideElement CHANGE_NAME = $x("//button[@class=\"profile__edit-button\"]");
    private final SelenideElement INPUT_NAME = $x("//input[@id='owner-name']")
;
    private final SelenideElement INPUT_DESCRIPTION = $x("//input[@id='owner-description']");
    private final SelenideElement BUTTONDSC = $x("//body/div[@id='root']/div[1]/div[1]/div[1]/form[1]/button[2]");



    public String assert_text(){return ASSERT_TEXT.getText();}
    public void logout(){LOGOUT.click();}

    public void changeImage(String link, String name, String Desc){
        PROFILEIMMAGE.click();
        LINKIMMAGE.sendKeys(link);
        BUTTONIMMAGE.click();
        CHANGE_NAME.click();
        INPUT_NAME.sendKeys(name);
        INPUT_DESCRIPTION.sendKeys(Desc);
        BUTTONDSC.click();
    }


}
