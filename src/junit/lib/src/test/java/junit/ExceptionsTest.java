package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    @Test
    void validarCenarioDeExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta ( "1234", 4300);
        Conta contaDestino = new Conta ( "5678", 500);

        TransferenciaEntreContas transferencia = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> transferencia.transfere(contaOrigem, contaDestino, -1000));
        System.out.println(contaOrigem.getSaldo());

        Assertions.assertDoesNotThrow(() -> transferencia.transfere(contaOrigem, contaDestino, 4000));
        System.out.println(contaOrigem.getSaldo());
    }
}
