package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * Relat�rio Nota Fiscal e Boleto - Bean
 */
public class NotaFiscalBoleto implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1204329329088840708L;

    /**
     * Atributo codigo
     */
    private int codigo;

    /**
     * Atributo ip
     */
    private String ip;

    /**
     * Atributo dataHoras
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
     * Atributo dataEmissao
     */
    private Date dataEmissao;

    /**
     * Atributo rpsNotaFiscal
     */
    private Long rpsNotaFiscal;

    /**
     * Atributo dataVencimento
     */
    private Date dataVencimento;

    /**
     * Atributo cnpj de Faturamento
     */
    private String cnpjFaturamento;

    /**
     * Atributo produto
     */
    private String produto;

    /**
     * Atributo n�mero do contrato
     */
    private Long numeroContrato;

    /**
     * Atributo tipo do documento
     */
    private String tipoDocumento;

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
     * @return the dataEmissao
     */
    public Date getDataEmissao() {
        return dataEmissao;
    }

    /**
     * @param dataEmissao
     *            the dataEmissao to set
     */
    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    /**
     * @return the rpsNotaFiscal
     */
    public Long getRpsNotaFiscal() {
        return rpsNotaFiscal;
    }

    /**
     * @param rpsNotaFiscal
     *            the rpsNotaFiscal to set
     */
    public void setRpsNotaFiscal(Long rpsNotaFiscal) {
        this.rpsNotaFiscal = rpsNotaFiscal;
    }

    /**
     * @return the dataVencimento
     */
    public Date getDataVencimento() {
        return dataVencimento;
    }

    /**
     * @param dataVencimento
     *            the dataVencimento to set
     */
    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    /**
     * @return the cnpjFaturamento
     */
    public String getCnpjFaturamento() {
        return cnpjFaturamento;
    }

    /**
     * @param cnpjFaturamento
     *            the cnpjFaturamento to set
     */
    public void setCnpjFaturamento(String cnpjFaturamento) {
        this.cnpjFaturamento = cnpjFaturamento;
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
     * @return the tipoDocumento
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * @param tipoDocumento
     *            the tipoDocumento to set
     */
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
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
