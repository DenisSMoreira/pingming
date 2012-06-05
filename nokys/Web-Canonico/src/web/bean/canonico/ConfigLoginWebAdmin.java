package web.bean.canonico;

/**
 * Bean ConfigLogin
 * 
 */
public class ConfigLoginWebAdmin implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1918346657728198458L;

    /**
     * Codigo da configura��o login
     */
    private Integer codigo;

    /**
     * Valor da configura��o login
     */
    private String valor;
    
    /**
     * Tipo do valor da configuracao do login
     */
    private String tipo;
    
    /**
     * Descri��o da configuracao do login
     */
    private String descricao;
    
    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
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
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
