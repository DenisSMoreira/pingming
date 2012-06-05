package web.bean.canonico;

/**
 * Bean - Responsav�l por amarmazenar dados do canal de venda
 */
public class CanalVenda {
    /**
     * Codigo do canal de venda
     */
    private Long codigo;
    /**
     * Nome do canal
     */
    private String nome;
    /**
     * Codigo externo
     */
    private String codigoExterno;
    /**
     * Codigo de sincronizacao
     */
    private Integer sincronizacao;

    /**
     * Retorna codigo do canal de venda
     * @return codigo codigo
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * Armazena codigo do canal de venda
     * @param codigo codigo
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    /**
     * Retorna nome do canal
     * @return nome nome do canal de venda
     */
    public String getNome() {
        return nome;
    }

    /**
     * Seta nome do canal de venda
     * @param nome nome do canal de venda
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna codigo externo
     * @return codExterno codigo Externo
     */
    public String getCodigoExterno() {
        return codigoExterno;
    }

    /**
     * Seta codigo externo 
     * @param codExterno codigo Externo
     */
    public void setCodigoExterno(String codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    /**
     * Retorna valor da sincronizacao
     * @return sincronizacao
     */
    public Integer getSincronizacao() {
        return sincronizacao;
    }

    /**
     * Seta valor da sincronizacao
     * @param sincronizacao sincronizacao
     */
    public void setSincronizacao(Integer sincronizacao) {
        this.sincronizacao = sincronizacao;
    }

}
