package exercicios;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Exemplo {
	 @Test
	    void validarNome() {
	        String nome = "Nicolas";
	        assertEquals("Nicolas", nome);  // compara valor esperado e obtido
	 }
}
