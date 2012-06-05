package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * classe CadastroInterlocutor - Bean tabela TCADINTERLOC
 * 
 */
public class CadastroInterlocutor implements Serializable {
    /**
     * Atributo static long serialVersionUID
     */
    private static final long serialVersionUID = 8808128920819659425L;
    /**
     * Atributo Long codigo - Bean CADINTERLOC
     */
    private Long codigo;
 /**
 * Atributo Long ip - Bean CIP
 */
    private String ip;
/**
 * Atributo Date dataHora - Bean DDATAHORA
 */
    private Date dataHora;
/**
 * Atributo String nomeInterlocutor - Bean campo INOMEINTERLOC
 */
    private String nomeInterlocutor;
/**
 * Atributo String cpfInterlocutor - Bean campo NCPFINTERLOC
 */
    private String cpfInterlocutor;
/**
 * Atributo String perfilInterlocutor - Bean campo RPRFILINTERLOC
 */
    private String perfilInterlocutor;
/**
 * Atributo String empresaCnpjCpf - Bean campo NEMPRCNPJCPF
 */
    private String empresaCnpjCpf;
/**
 * Atributo String origemAlteracao - Bean campo RORIGEALT
 */
    private String origemAlteracao;
/**
 * Atributo String userAgent - Bean campo RUSERAGENT
 */
    private String userAgent;
/**
 * Atributo String nomeInterlocutorAlterado - Bean campo INOMEINTERLOCALT
 */
    private String nomeInterlocutorAlterado;
/**
 * Atributo String cpfInterlocutorAlterado - Bean campo NCPFINTERLOCALT
 */
    private String cpfInterlocutorAlterado;
/**
 * Atributo String perfilInterlocutorAlterado - Bean campo RPRFILINTERLOCALT
 */
    private String perfilInterlocutorAlterado;
/**
 * Atributo String emailInterlocutorAlterado - Bean campo REMAILINTERLOCALT
 */
    private String emailInterlocutorAlterado;
/**
 * Atributo Long idSessao idSessao - Bean campo CIDSESS
 */
    private Long idSessao;
/**
 * Atributo String acaoRealizada - Bean campo RACAOREALZ
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
     * @return the nomeInterlocutorAlterado
     */
    public String getNomeInterlocutorAlterado() {
        return nomeInterlocutorAlterado;
    }

    /**
     * @param nomeInterlocutorAlterado
     *            the nomeInterlocutorAlterado to set
     */
    public void setNomeInterlocutorAlterado(String nomeInterlocutorAlterado) {
        this.nomeInterlocutorAlterado = nomeInterlocutorAlterado;
    }

    /**
     * @return the cpfInterlocutorAlterado
     */
    public String getCpfInterlocutorAlterado() {
        return cpfInterlocutorAlterado;
    }

    /**
     * @param cpfInterlocutorAlterado
     *            the cpfInterlocutorAlterado to set
     */
    public void setCpfInterlocutorAlterado(String cpfInterlocutorAlterado) {
        this.cpfInterlocutorAlterado = cpfInterlocutorAlterado;
    }

    /**
     * @return the perfilInterlocutorAlterado
     */
    public String getPerfilInterlocutorAlterado() {
        return perfilInterlocutorAlterado;
    }

    /**
     * @param perfilInterlocutorAlterado
     *            the perfilInterlocutorAlterado to set
     */
    public void setPerfilInterlocutorAlterado(String perfilInterlocutorAlterado) {
        this.perfilInterlocutorAlterado = perfilInterlocutorAlterado;
    }

    /**
     * @return the emailInterlocutorAlterado
     */
    public String getEmailInterlocutorAlterado() {
        return emailInterlocutorAlterado;
    }

    /**
     * @param emailInterlocutorAlterado
     *            the emailInterlocutorAlterado to set
     */
    public void setEmailInterlocutorAlterado(String emailInterlocutorAlterado) {
        this.emailInterlocutorAlterado = emailInterlocutorAlterado;
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
