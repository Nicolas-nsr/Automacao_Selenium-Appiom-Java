package com.exemplo.tests;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteExemplo {
	 @Test
	    void validarNome() {
	        String nome = "Nicolas";
	        assertEquals("Nicolas", nome);  // compara valor esperado e obtido
	 }
}
