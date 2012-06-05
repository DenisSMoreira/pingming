package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * Relat�rio Reset Senha - Bean
 */
public class ResetSenha implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -4207394530219256707L;

    /**
     * Atributo codigo
     */
    private int codigo;

    /**
     * Atributo ip
     */
    private String ip;

    /**
     * Atributo dataHora
     */
    private Date dataHora;

    /**
     * Atributo nomeInterlocutor
     */
    private String nomeInterlocutor;

    /**
     * Atributo cpf Interlocutor
     */
    private String cpfInterlocutor;

    /**
     * Atributo perfil Interlocutor
     */
    private String perfilInterlocutor;

    /**
     * Atributo empresa Cnpj/Cpf
     */
    private String empresaCnpjCpf;

    /**
     * Atributo origemAltera��o
     */
    private String origemAlteracao;

    /**
     * Atributo User Agent
     */
    private String userAgent;

    /**
     * Atributo empresa Cnpj/Cpf
     */
    private String empresaCnpjCpfPid;

    /**
     * Atributo atendente
     */
    private String atendente;

    /**
     * Atributo idSessao
     */
    private Long idSessao;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo
     *            the codigo to set
     */
    public void setCodigo(int codigo) {
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
     * @return the empresaCnpjCpfPid
     */
    public String getEmpresaCnpjCpfPid() {
        return empresaCnpjCpfPid;
    }

    /**
     * @param empresaCnpjCpfPid
     *            the empresaCnpjCpfPid to set
     */
    public void setEmpresaCnpjCpfPid(String empresaCnpjCpfPid) {
        this.empresaCnpjCpfPid = empresaCnpjCpfPid;
    }

    /**
     * @return the atendente
     */
    public String getAtendente() {
        return atendente;
    }

    /**
     * @param atendente
     *            the atendente to set
     */
    public void setAtendente(String atendente) {
        this.atendente = atendente;
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
