package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class SplachScreen extends BaseScreen{
    public SplachScreen(AppiumDriver<AndroidElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/version_text']")
    AndroidElement versionTextView;

    public String getCurrentVersion(){
        return versionTextView.getText();
    }
}
