package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "null")
    void validarAlgoSomenteNoUsuarioAdmin(){
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    void validarAlgoSomenteNoUsuarioRoot(){
//        System.out.println(System.getenv("USER"));
        Assertions.assertEquals(10, 5+5);
    }
}
