package web.bean.canonico;

/**
 * Bean Configuracao do Login
 * 
 */

public class ConfigLogin implements java.io.Serializable {

    /**
     * Atributo SerialVersion
     */
    private static final long serialVersionUID = -4695041717610585304L;
    
    /**
     *  Atributo = Codigo Configura��o Login 
     */
    
    private Long codConfigLogin;
    
    /**
     *  Atributo = Configura��o Login
     */
    
    private String configLogin;
    /**
     *  Atributo = Tipo Login
     */
    private String tipo;
    /**
     *  Atributo = Descri��o do Login
     */
    private String descricao;

    /**
     * @return the codConfigLogin
     */
    public Long getCodConfigLogin() {
        return codConfigLogin;
    }

    /**
     * @param codConfigLogin
     *            the codConfigLogin to set
     */
    public void setCodConfigLogin(Long codConfigLogin) {
        this.codConfigLogin = codConfigLogin;
    }

    /**
     * @return the configLogin
     */
    public String getConfigLogin() {
        return configLogin;
    }

    /**
     * @param configLogin
     *            the configLogin to set
     */
    public void setConfigLogin(String configLogin) {
        this.configLogin = configLogin;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo
     *            the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao
     *            the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
