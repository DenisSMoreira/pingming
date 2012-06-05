package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * Relat�rio Altera��o do Interlocutor de Decis�o - Bean
 */
public class AlteracaoInterlocutorDecisao implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 954508673501741850L;

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
     * Atributo cpfInterlocutor
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
     * Atributo origem da Altera��o
     */
    private String origemAlteracao;
    /**
     * Atributo User Agent
     */
    private String userAgent;
    /**
     * Atributo n�mero do contrato
     */
    private Long numeroContrato;
    /**
     * Atributo tipo do Contrato
     */
    private String tipoContrato;
    /**
     * Atributo produto
     */
    private String produto;
    /**
     * Atributo emissor
     */
    private String emissor;
    /**
     * Atributo vendedor
     */
    private String vendedor;
    /**
     * Atributo canalEntrada
     */
    private String canalEntrada;
    /**
     * Atributo nome Interlocutor Decis�o De
     */
    private String nomeInterlocutorDecisaoDe;
    /**
     * Atributo cpf Interlocutor Decis�o De
     */
    private String cpfInterlocutorDecisaoDe;
    /**
     * Atributo nome Interlocutor Decis�o Para
     */
    private String nomeInterlocutorDecisaoPara;
    /**
     * Atributo cpf Interlocutor Decis�o Para
     */
    private String cpfInterlocutorDecisaoPara;
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
     * @return the numeroContrato
     */
    public Long getNumeroContrato() {
        return numeroContrato;
    }

    /**
     * @param numeroContrato
     *            the numeroContrato to set
     */
    public void setNumeroContrato(Long numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    /**
     * @return the tipoContrato
     */
    public String getTipoContrato() {
        return tipoContrato;
    }

    /**
     * @param tipoContrato
     *            the tipoContrato to set
     */
    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    /**
     * @return the produto
     */
    public String getProduto() {
        return produto;
    }

    /**
     * @param produto
     *            the produto to set
     */
    public void setProduto(String produto) {
        this.produto = produto;
    }

    /**
     * @return the emissor
     */
    public String getEmissor() {
        return emissor;
    }

    /**
     * @param emissor
     *            the emissor to set
     */
    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    /**
     * @return the vendedor
     */
    public String getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor
     *            the vendedor to set
     */
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the canalEntrada
     */
    public String getCanalEntrada() {
        return canalEntrada;
    }

    /**
     * @param canalEntrada
     *            the canalEntrada to set
     */
    public void setCanalEntrada(String canalEntrada) {
        this.canalEntrada = canalEntrada;
    }

    /**
     * @return the nomeInterlocutorDecisaoDe
     */
    public String getNomeInterlocutorDecisaoDe() {
        return nomeInterlocutorDecisaoDe;
    }

    /**
     * @param nomeInterlocutorDecisaoDe
     *            the nomeInterlocutorDecisaoDe to set
     */
    public void setNomeInterlocutorDecisaoDe(String nomeInterlocutorDecisaoDe) {
        this.nomeInterlocutorDecisaoDe = nomeInterlocutorDecisaoDe;
    }

    /**
     * @return the cpfInterlocutorDecisaoDe
     */
    public String getCpfInterlocutorDecisaoDe() {
        return cpfInterlocutorDecisaoDe;
    }

    /**
     * @param cpfInterlocutorDecisaoDe
     *            the cpfInterlocutorDecisaoDe to set
     */
    public void setCpfInterlocutorDecisaoDe(String cpfInterlocutorDecisaoDe) {
        this.cpfInterlocutorDecisaoDe = cpfInterlocutorDecisaoDe;
    }

    /**
     * @return the nomeInterlocutorDecisaoPara
     */
    public String getNomeInterlocutorDecisaoPara() {
        return nomeInterlocutorDecisaoPara;
    }

    /**
     * @param nomeInterlocutorDecisaoPara
     *            the nomeInterlocutorDecisaoPara to set
     */
    public void setNomeInterlocutorDecisaoPara(String nomeInterlocutorDecisaoPara) {
        this.nomeInterlocutorDecisaoPara = nomeInterlocutorDecisaoPara;
    }

    /**
     * @return the cpfInterlocutorDecisaoPara
     */
    public String getCpfInterlocutorDecisaoPara() {
        return cpfInterlocutorDecisaoPara;
    }

    /**
     * @param cpfInterlocutorDecisaoPara
     *            the cpfInterlocutorDecisaoPara to set
     */
    public void setCpfInterlocutorDecisaoPara(String cpfInterlocutorDecisaoPara) {
        this.cpfInterlocutorDecisaoPara = cpfInterlocutorDecisaoPara;
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
