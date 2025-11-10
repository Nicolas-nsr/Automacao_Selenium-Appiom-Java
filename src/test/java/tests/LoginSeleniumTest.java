package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoginSeleniumTest {

    @Test
    void loginValido() {
    	System.out.println("Iniciando teste de login...");
        // Abre o navegador
        WebDriver driver = new ChromeDriver();

        // Acessa a página de login
        driver.get("https://the-internet.herokuapp.com/login");

        // Preenche os campos de usuário e senha
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

        // Clica no botão de login
        driver.findElement(By.cssSelector("button.radius")).click();

        // Captura a mensagem retornada
        String msg = driver.findElement(By.id("flash")).getText();

        // Valida se o login foi bem-sucedido
        assertTrue(msg.contains("You logged into a secure area!"));
        
        
        // Fecha o navegador
        driver.quit();
        System.out.println("Teste finalizado");
    }
}
