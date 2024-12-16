package com.example.appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageView {
    AppiumDriver driver;

    // TODO define textField MobileElement using @FindBy kind of annotations for iOS and Android
    @AndroidFindBy(id = "io.appium.android.apis:id/edit")
    @iOSXCUITFindBy(iOSNsPredicate = "name == 'IntegerA'")
    private WebElement textField;

    public PageView(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String getTextField() {
        // TODO return text from the textField element
        return textField.getText();
    }

    public PageView setTextField(String text) {
        // TODO set text to the textField element
        textField.sendKeys(text);
        return this;
    }
}
