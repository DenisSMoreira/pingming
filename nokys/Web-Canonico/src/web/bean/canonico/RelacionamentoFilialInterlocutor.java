package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Classe RelacionamentoFilialInterlocutor
 * 
 */
public class RelacionamentoFilialInterlocutor implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -5665144244130233721L;
    /**
     * Atributo codigo
     */
    private Long codigo;
    /**
     * Atributo ip
     */
    private String ip;
    /**
     * Atributo data Hora
     */
    private Date dataHora;
    /**
     * Atributo nome Interlocutor
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
     * Atributo empresa Cnpj Cpf
     */
    private String empresaCnpjCpf;
    /**
     * Atributo origem Alteracao
     */
    private String origemAlteracao;
    /**
     * Atributo user Agent
     */
    private String userAgent;
    /**
     * Atributo cnpj Filial
     */
    private String cnpjFilial;
    /**
     * Atributo cpf Interlocutor Relacionamento
     */
    private String cpfInterlocutorRelacionamento;
    /**
     * Atributo papel Interlocutor Filial
     */
    private String papelInterlocutorFilial;
    /**
     * Atributo cpf Novo Interlocutor
     */
    private String cpfNovoInterlocutor;
    /**
     * Atributo acao Realizada
     */
    private String acaoRealizada;
    /**
     * Atributo id Sessao
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
     * @return the cnpjFilial
     */
    public String getCnpjFilial() {
        return cnpjFilial;
    }

    /**
     * @param cnpjFilial
     *            the cnpjFilial to set
     */
    public void setCnpjFilial(String cnpjFilial) {
        this.cnpjFilial = cnpjFilial;
    }

    /**
     * @return the cpfInterlocutorRelacionamento
     */
    public String getCpfInterlocutorRelacionamento() {
        return cpfInterlocutorRelacionamento;
    }

    /**
     * @param cpfInterlocutorRelacionamento
     *            the cpfInterlocutorRelacionamento to set
     */
    public void setCpfInterlocutorRelacionamento(String cpfInterlocutorRelacionamento) {
        this.cpfInterlocutorRelacionamento = cpfInterlocutorRelacionamento;
    }

    /**
     * @return the papelInterlocutorFilial
     */
    public String getPapelInterlocutorFilial() {
        return papelInterlocutorFilial;
    }

    /**
     * @param papelInterlocutorFilial
     *            the papelInterlocutorFilial to set
     */
    public void setPapelInterlocutorFilial(String papelInterlocutorFilial) {
        this.papelInterlocutorFilial = papelInterlocutorFilial;
    }

    /**
     * @return the cpfNovoInterlocutor
     */
    public String getCpfNovoInterlocutor() {
        return cpfNovoInterlocutor;
    }

    /**
     * @param cpfNovoInterlocutor
     *            the cpfNovoInterlocutor to set
     */
    public void setCpfNovoInterlocutor(String cpfNovoInterlocutor) {
        this.cpfNovoInterlocutor = cpfNovoInterlocutor;
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
