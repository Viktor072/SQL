package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private final SelenideElement verificationField = $("[data-test-id=code] input");
    private final SelenideElement verifyButton = $("button.button");


    public DashboardPage validVerify(String info) {
        verificationField.setValue(info);
        verifyButton.click();
        return new DashboardPage();
    }
}
