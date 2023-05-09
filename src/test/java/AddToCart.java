import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class AddToCart {
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
            WebElement emailField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
            emailField.click();
            emailField.sendKeys("example@email.com");
            WebElement passwordField = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
            passwordField.click();
            passwordField.sendKeys("password");
            WebElement buttonSubmitLogin = driver.findElement(AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]"));
            buttonSubmitLogin.click();
            WebElement ProductPage = driver.findElement(AppiumBy.xpath("//android.view.View[@content-desc=\"Products\"]"));
            ProductPage.getText();
            WebElement buttonBeli1 = driver.findElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]"));
            buttonBeli1.click();
            WebElement buttonBeli2 = driver.findElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[2]"));
            buttonBeli2.click();
            WebElement buttonBeli3 = driver.findElement(AppiumBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[3]"));
            buttonBeli3.click();
            driver.getPageSource();
        } finally {
            driver.quit();
        }

    }
}
