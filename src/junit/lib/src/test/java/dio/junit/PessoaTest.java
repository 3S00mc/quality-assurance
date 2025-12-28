package dio.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("Pedro", LocalDate.of(1994, 10, 20));
        Assertions.assertEquals(31, pessoa.getIdade());
    }
}
