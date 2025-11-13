package exercicios;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Revisao {
    @Test
    void validarIdades() {
        int[] idades = {15, 18, 21};
        for (int idade : idades) {
            if (idade >= 18) {
                System.out.println(idade + " é maior de idade");
                assertTrue(idade >= 18);
            } else {
                System.out.println(idade + " é menor de idade");
                assertTrue(idade < 18);
            }
        }
    }
}

