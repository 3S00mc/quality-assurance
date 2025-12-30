package junit;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void estabelecerConexao() {
        LOGGER.info("Conexão Estabelecida");
    }

    public static void finalizarConexao() {
        LOGGER.info("Conexão Finalizada");
    }
}
