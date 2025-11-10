package tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class AppiumTest {
    public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 3");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "12.0");
        caps.setCapability("app", "/path/to/app.apk"); // caminho do app
        caps.setCapability("automationName", "UiAutomator2"); // engine recomendada

        AndroidDriver driver = new AndroidDriver(
            new URL("http://localhost:4723/wd/hub"), caps
        );

        System.out.println("App iniciado no dispositivo simulado!");
        // Exemplo de interação:
        driver.findElementById("loginButton").click();

        driver.quit();
    }
}
