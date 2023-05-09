import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class Register {
    public static void main(String[] args) throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setApp("C:\\Users\\kmfat\\IdeaProjects\\miniproject\\MobileTesting\\src\\test\\resources\\app-release.apk");
        AndroidDriver driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://127.0.0.1:4723"), options
        );
        try {
            WebElement buttonSignIn = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button"));
            buttonSignIn.click();
            WebElement buttonRegister = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]"));
            buttonRegister.click();
            WebElement fullnameField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            fullnameField.click();
            fullnameField.clear();
            fullnameField.sendKeys("Abcdeft Efghijy");
            WebElement emailField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            emailField.click();
            emailField.clear();
            emailField.sendKeys("abcdefghijk@mailmail.com");
            WebElement passwordField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]"));
            passwordField.click();
            passwordField.clear();
            passwordField.sendKeys("1238901132");
            WebElement buttonSubmitRegister = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]"));
            buttonSubmitRegister.click();
            WebElement titlePage = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Products\"]"));
            titlePage.getText();
            driver.getPageSource();
        } finally {
            driver.quit();
        }
    }
}