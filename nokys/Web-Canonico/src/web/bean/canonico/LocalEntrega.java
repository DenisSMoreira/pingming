package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * bean configura��o Local Entrega
 * 
 * @author gferreira
 * 
 */
public class LocalEntrega implements Serializable {
    
    /**
     * Atributo serialversion
     */

    private static final long serialVersionUID = -7822211278381048283L;
    
    /**
     * Atributo Codigo - Relat�rio Local Entrega
     */

    private Long codigo;
    
     /**
     * Atributo ip - Relat�rio Local Entrega
     */
    
    private String ip;
    
    /**
     * Atributo dataHora - Relat�rio Local Entrega
     */

    private Date dataHora;
    
    /**
     * Atributo nomeInterlocutor - Relat�rio Local Entrega
     */

    private String nomeInterlocutor;
    
    /**
     * Atributo cpfInterlocutor - Relat�rio Local Entrega
     */

    private String cpfInterlocutor;
    
    /**
     * Atributo perfilInterlocutor - Relat�rio Local Entrega
     */

    private String perfilInterlocutor;
    
    /**
     * Atributo empresaCnpjCpf - Relat�rio Local Entrega
     */

    private String empresaCnpjCpf;
    
    /**
     * Atributo origemAlteracao - Relat�rio Local Entrega
     */

    private String origemAlteracao;
    
    /**
     * Atributo userAgent - Relat�rio Local Entrega
     */

    private String userAgent;
    
    /**
     * Atributo cnpjLocalEntrega - Relat�rio Local Entrega
     */

    private String cnpjLocalEntrega;
    
    /**
     * Atributo tipoLocalEntrega - Relat�rio Local Entrega
     */

    private String tipoLocalEntrega;
    
    /**
     * Atributo codigoLocalEntrega - Relat�rio Local Entrega
     */

    private Long codigoLocalEntrega;
    
    /**
     * Atributo idSessao - Relat�rio Local Entrega
     */

    private Long idSessao;
    
    /**
     * Atributo acaoRealizada - Relat�rio Local Entrega
     */

    private String acaoRealizada;

    /**
     * @return the codigo
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo
     *            the codigo to set
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     *            the ip to set
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * @return the dataHora
     */
    public Date getDataHora() {
        return dataHora;
    }

    /**
     * @param dataHora
     *            the dataHora to set
     */
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    /**
     * @return the nomeInterlocutor
     */
    public String getNomeInterlocutor() {
        return nomeInterlocutor;
    }

    /**
     * @param nomeInterlocutor
     *            the nomeInterlocutor to set
     */
    public void setNomeInterlocutor(String nomeInterlocutor) {
        this.nomeInterlocutor = nomeInterlocutor;
    }

    /**
     * @return the cpfInterlocutor
     */
    public String getCpfInterlocutor() {
        return cpfInterlocutor;
    }

    /**
     * @param cpfInterlocutor
     *            the cpfInterlocutor to set
     */
    public void setCpfInterlocutor(String cpfInterlocutor) {
        this.cpfInterlocutor = cpfInterlocutor;
    }

    /**
     * @return the perfilInterlocutor
     */
    public String getPerfilInterlocutor() {
        return perfilInterlocutor;
    }

    /**
     * @param perfilInterlocutor
     *            the perfilInterlocutor to set
     */
    public void setPerfilInterlocutor(String perfilInterlocutor) {
        this.perfilInterlocutor = perfilInterlocutor;
    }

    /**
     * @return the empresaCnpjCpf
     */
    public String getEmpresaCnpjCpf() {
        return empresaCnpjCpf;
    }

    /**
     * @param empresaCnpjCpf
     *            the empresaCnpjCpf to set
     */
    public void setEmpresaCnpjCpf(String empresaCnpjCpf) {
        this.empresaCnpjCpf = empresaCnpjCpf;
    }

    /**
     * @return the origemAlteracao
     */
    public String getOrigemAlteracao() {
        return origemAlteracao;
    }

    /**
     * @param origemAlteracao
     *            the origemAlteracao to set
     */
    public void setOrigemAlteracao(String origemAlteracao) {
        this.origemAlteracao = origemAlteracao;
    }

    /**
     * @return the userAgent
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * @param userAgent
     *            the userAgent to set
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * @return the cnpjLocalEntrega
     */
    public String getCnpjLocalEntrega() {
        return cnpjLocalEntrega;
    }

    /**
     * @param cnpjLocalEntrega
     *            the cnpjLocalEntrega to set
     */
    public void setCnpjLocalEntrega(String cnpjLocalEntrega) {
        this.cnpjLocalEntrega = cnpjLocalEntrega;
    }

    /**
     * @return the tipoLocalEntrega
     */
    public String getTipoLocalEntrega() {
        return tipoLocalEntrega;
    }

    /**
     * @param tipoLocalEntrega
     *            the tipoLocalEntrega to set
     */
    public void setTipoLocalEntrega(String tipoLocalEntrega) {
        this.tipoLocalEntrega = tipoLocalEntrega;
    }

    /**
     * @return the codigoLocalEntrega
     */
    public Long getCodigoLocalEntrega() {
        return codigoLocalEntrega;
    }

    /**
     * @param codigoLocalEntrega
     *            the codigoLocalEntrega to set
     */
    public void setCodigoLocalEntrega(Long codigoLocalEntrega) {
        this.codigoLocalEntrega = codigoLocalEntrega;
    }

    /**
     * @return the idSessao
     */
    public Long getIdSessao() {
        return idSessao;
    }

    /**
     * @param idSessao
     *            the idSessao to set
     */
    public void setIdSessao(Long idSessao) {
        this.idSessao = idSessao;
    }

    /**
     * @return the acaoRealizada
     */
    public String getAcaoRealizada() {
        return acaoRealizada;
    }

    /**
     * @param acaoRealizada
     *            the acaoRealizada to set
     */
    public void setAcaoRealizada(String acaoRealizada) {
        this.acaoRealizada = acaoRealizada;
    }
}
