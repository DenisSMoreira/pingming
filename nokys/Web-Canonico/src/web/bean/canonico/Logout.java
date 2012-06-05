package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * bean configura��o Logout
 * 
 * @author gferreira
 * 
 */
public class Logout implements Serializable {
    
    /**
     * Atributo serialversion
     */

    private static final long serialVersionUID = 1572050216894706379L;
    
    /**
     * Atributo Codigo - Relat�rio Logout
     */

    private Long codigo;
    
    /**
     * Atributo ip - Relat�rio Logout
     */

    private String ip;
    
    /**
     * Atributo dataHora - Relat�rio Logout
     */

    private Date dataHora;
    
    /**
     * Atributo nomeInterlocutor - Relat�rio Logout
     */

    private String nomeInterlocutor;
    
    /**
     * Atributo cpfInterlocutor - Relat�rio Logout
     */

    private String cpfInterlocutor;
    
    /**
     * Atributo perfilInterlocutor - Relat�rio Logout
     */

    private String perfilInterlocutor;
    
    /**
     * Atributo empresaCnpjCpf - Relat�rio Logout
     */

    private String empresaCnpjCpf;
    
    /**
     * Atributo userAgent - Relat�rio Logout
     */

    private String userAgent;
    
    /**
     * Atributo idSessao - Relat�rio Logout
     */

    private Long idSessao;

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
}
