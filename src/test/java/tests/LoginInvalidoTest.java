package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginInvalidoTest {
	
	@Test
	void loginInvalido() {
		
		//Apresenta no console que foi iniciado
		System.out.println("Iniciando teste de login...");
		
		// Abre o navegador
	    WebDriver driver = new ChromeDriver();
	    
	    // Acessa a página de login
	    driver.get("https://the-internet.herokuapp.com/login");
	    
	    // Preenche os campos de usuário e senha
	    driver.findElement(By.id("username")).sendKeys("usuario_errado");
	    driver.findElement(By.id("password")).sendKeys("senha_errada");
	    
	    // Clica no botão de login
	    driver.findElement(By.cssSelector("button.radius")).click();
	    
	    // Captura a mensagem retornada
	    String msg = driver.findElement(By.id("flash")).getText();
	    
	    // Valida se o login não foi bem-sucedido
	    assertTrue(msg.contains("Your username is invalid!"));
	    
	    //Apresenta no console que foi finalizado
	    System.out.println("Teste finalizado");
	    
	    // Fecha o navegador
	    driver.quit();
	}


}
