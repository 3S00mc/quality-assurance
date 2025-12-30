package junit;

import org.junit.jupiter.api.*;

public class ConsultarDadosDePessoaTest {


    @AfterEach
    void pulaLinha(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }

    @AfterEach
    void sinalizaLinha(){
        System.out.println("----------------------------------------");
    }

    @BeforeAll
    static void configuraConexao() {
        BancoDeDados.estabelecerConexao();
        System.out.println("Rodando conexão com o DataBase - [ configurarConexao ]");
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
        System.out.println("Conexão com o DataBase estabelecida - [ validarDadosDeRetorno ]");
    }

    @AfterAll
    static void encerraConexao() {
        BancoDeDados.finalizarConexao();
        System.out.println("Finalizando conexão com o DataBase - [ encerraConexao ]");
    }

}
