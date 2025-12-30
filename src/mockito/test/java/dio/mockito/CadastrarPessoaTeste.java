package dio.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals; // importacao de classe estatica para nao precisar escrever Assertions.algumacoisa


@ExtendWith(MockitoExtension.class)

public class CadastrarPessoaTeste {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    // Injetar o mock dentro da instancia da classe cadastrarPessoa
    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosDeCadastro(){

        Pessoa pedro = cadastrarPessoa.cadastrarPessoa("Pedro", "413163216", LocalDate.now(), "0889900");
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SP", "Sao Paulo", "Rua dos bobos", "Apto 1116", "Parque Fernanda");

        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("0889900")).thenReturn(dadosLocalizacao);

        //validacao dos dados retornados pelo mock
        assertEquals("Johnny", pedro.getNome());
        assertEquals("46548621", pedro.getDocumento());
        assertEquals("17/06/2000", pedro.getNascimento());

        assertEquals("SP", pedro.getEndereco().getUf());
        assertEquals("Sao Paulo", pedro.getEndereco().getCidade());
        assertEquals("Rua Nilton Machado", pedro.getEndereco().getLogradouro());
        assertEquals("Casa", pedro.getEndereco().getComplemento());
        assertEquals("Parque Fernanda", pedro.getEndereco().getBairro());
    }
}
