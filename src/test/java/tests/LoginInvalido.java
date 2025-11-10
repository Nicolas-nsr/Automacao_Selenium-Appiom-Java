package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoginInvalido {
	@Test
	void loginInvalido() {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://the-internet.herokuapp.com/login");
	    driver.findElement(By.id("username")).sendKeys("usuario_errado");
	    driver.findElement(By.id("password")).sendKeys("senha_errada");
	    driver.findElement(By.cssSelector("button.radius")).click();
	    String msg = driver.findElement(By.id("flash")).getText();
	    assertTrue(msg.contains("Your username is invalid!"));
	    System.out.println("Teste finalizado");
	    driver.quit();
	}


}
