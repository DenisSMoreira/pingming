package web.bean.canonico;

/**
 * Bean - Responsavel por armazenar dados do canal de entrada
 */
public class CanalEntrada {

    /**
     * Codigo do canal de entrada
     */
    private Long codigo;
    /**
     * Nome da entrada
     */
    private String nome;
    /**
     * Codigo externo
     */
    private String codigoExterno;
    /**
     * Atributo usado para sincronizacao
     */
    private Integer sincronizacao;

    /**
     * Recupera nome do canal
     * @return nome
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Seta nome do canal
     * @param nome nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna valor do codigo externo
     * @return  codExterno
     */
    public String getCodigoExterno() {
        return codigoExterno;
    }

    /**
     * Armazena codigo externo
     * 
     * @param codExterno
     *            codigo externo
     */
    public void setCodigoExterno(String codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    /**
     * Retorna sincronizacao
     * 
     * @return sincronizacao
     */
    public Integer getSincronizacao() {
        return sincronizacao;
    }

    /**
     * Seta o atributo de sincronizacao
     * @param sincronizacao sincronizacao
     */
    public void setSincronizacao(Integer sincronizacao) {
        this.sincronizacao = sincronizacao;
    }

    /**
     * Recupera o codigo do canal de entrada
     * @return codigo
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * Armazena o codigo do canal de entrada
     * @param codigo codigo
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

}
