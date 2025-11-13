package exercicios;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidacaoIdade {
	@Test
	void validacaoIdade() {
		int idade = 32;
		assertTrue(idade >= 18);
		}

}
