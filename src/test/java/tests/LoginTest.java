

package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    void abrirGoogle() {
        // Se necessário, setar o path do ChromeDriver
        // System.setProperty("webdriver.chrome.driver", "caminho/para/chromedriver");
    	
    	System.out.println("Iniciando teste de login...");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("Título da página: " + driver.getTitle());
        driver.quit();
        }
    }
