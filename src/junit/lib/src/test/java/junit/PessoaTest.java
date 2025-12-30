package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;


import static org.junit.jupiter.api.Assertions.assertEquals; // importacao de classe estatica para nao precisar escrever Assertions.algumacoisa
//import static org.junit.jupiter.api.Assertions.assertTrue;


public class PessoaTest {

    @Test
    void calcularIdadeCorretamente(){
        Pessoa jose = new Pessoa("Pedro", LocalDateTime.of(1994, 10, 22, 13, 22) );
//        Assertions.assertEquals(31, jose.getIdade());
        assertEquals(31, jose.getIdade());
    }

    @Test
    void verificarSePessoaEhMaiorDeIdade(){
        Pessoa jose = new Pessoa("Pedro", LocalDateTime.of(1994, 10, 22, 13, 22) );
//        Assertions.assertTrue(pedro.isMaiorDeIdade());
        assertTrue(jose.isMaiorDeIdade());

        Pessoa Joao = new Pessoa("Joao", LocalDateTime.of(2000, 6, 17, 3, 22) );
        Assertions.assertTrue(Joao.isMaiorDeIdade());

        Pessoa Ana = new Pessoa("Ana", LocalDateTime.now() );
        Assertions.assertFalse(Ana.isMaiorDeIdade());
    }
}
