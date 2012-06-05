package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * classe IPSeguranca Bean tabela TINCALTEXCLIPSEGRC
 * 
 */
public class IPSeguranca implements Serializable {
    /**
     * Atributo static long serialVersionUID
     */
    private static final long serialVersionUID = -792073150952131399L;
    /**
     * Atributo Long codigo - Bean campo CINCALTEXCLIPSEGRC
     */
    private Long codigo;
    /**
     * Atributo String ip - Bean campo CIP
     */
    private String ip;
    /**
     * Atributo Date dataHora - Bean campo DDATAHORA
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
     * Atributo String acao - Bean campo RACAO
     */
    private String acao;
    /**
     * Atributo String ipSegurancaAnterior - Bean campo RIPSEGRCANTER
     */
    private String ipSegurancaAnterior;
    /**
     * Atributo String ipSegurancaNovo - Bean campo RIPSEGRCNOVO
     */
    private String ipSegurancaNovo;
    /**
     * Atributo Long idSessao - Bean campo CIDSESS
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
     * @return the acao
     */
    public String getAcao() {
        return acao;
    }

    /**
     * @param acao
     *            the acao to set
     */
    public void setAcao(String acao) {
        this.acao = acao;
    }

    /**
     * @return the ipSegurancaAnterior
     */
    public String getIpSegurancaAnterior() {
        return ipSegurancaAnterior;
    }

    /**
     * @param ipSegurancaAnterior
     *            the ipSegurancaAnterior to set
     */
    public void setIpSegurancaAnterior(String ipSegurancaAnterior) {
        this.ipSegurancaAnterior = ipSegurancaAnterior;
    }

    /**
     * @return the ipSegurancaNovo
     */
    public String getIpSegurancaNovo() {
        return ipSegurancaNovo;
    }

    /**
     * @param ipSegurancaNovo
     *            the ipSegurancaNovo to set
     */
    public void setIpSegurancaNovo(String ipSegurancaNovo) {
        this.ipSegurancaNovo = ipSegurancaNovo;
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
