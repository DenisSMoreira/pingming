/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package denis.ping.service.constants;

/**
 * classe de constantes
 * @author Denis Soares Moreira
 */
public interface ConstantsSystem {

    /**
     * Mensagem de erro
     */
    static final String MENSAGEM_DE_ERRO = "Não foi possivel conectar a VPN, \nse não houver conexão durante o proximo min\n A vpn caiu.";

    /**
     * Mensagem caso a conexão do ip for conectada
     */
    static final String STATUS_UP = "Conectada!";
    /**
     * Mensagem caso a conexão do ip caia
     */
    static final String STATUS_DOWN = "Desconectada!";
      /**
     * Menu sair do popUp do trayIcon
     */
    static final String MENU_GERENCIADOR = "Abrir Gerenciador";
    /**
     * Menu sair do popUp do trayIcon
     */
    static final String MENU_SAIR = "Fechar";
     /**
     * String usada para o split do retorno do prompt
     */
    static final String CMD_PING = "ping";
     /**
     * String usada para o split do retorno do prompt
     */
    static final String CMD_BYTES = "bytes=";
     /**
     * String usada para o split do retorno do prompt
     */
    static final String CMD_TIME = "tempo=";
     /**
     * String usada para o split do retorno do prompt
     */
    static final String CMD_TTL = "TTL=";
    /**
     * String usada para o split do retorno do prompt
     */
    static final String CMD_V_TTL = "TTL";

    /**
     * Key do .properties que armazena o valor default do IP da VPN
     */
    static final String HOSTS = "HOSTS_DA_VPN";

    /**
     * Key do .properties que armazena o tempo da verificação do IP
     */
    static final String TIME = "TIME_OUT";

    /**
     * Key do .properties que armazena o tempo de sleep da thread
     */
    static final String TIME_SLEEP = "TIME_OUT_SLEEP";
    /**
     * Nome do arquivo .properties com as configurações do sistema
     */
    static final String ARQUIVO_PROPERTIES = "config.properties";
    /**
     * String de espaco
     */
    static final String ESPACO = " ";

    /**
     * String vazia, usada para setar valores
     */
    static final String VAZIO = "";

}
