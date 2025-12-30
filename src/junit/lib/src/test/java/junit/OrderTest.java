package junit;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
// @TestMethodOrder(MethodOrderer.Random.class)
public class OrderTest {

    @Order(4)
    @Test
    void validaFluxoA(){
        System.out.println("Fluxo A");
    }

    @Test
    @Order(3)
    void validaFluxoB(){
        System.out.println("Fluxo B");
    }

    @Test
    @Order(2)
    void validaFluxoC(){
        System.out.println("Fluxo C");
    }

    @Test
    @Order(1)
    void validaFluxoD(){
        System.out.println("Fluxo D");
    }
}
