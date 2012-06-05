package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;
    /**
     * bean referente ao relat�rio Troca de senha pelo p�roprio usu�rio
     */
public class TrocaSenhaUsuario implements Serializable {
    /**
     * Vari�lvel referente ao form
     */
    private static final long serialVersionUID = -4813715998121718417L;
    /**
     * Vari�lvel referente ao caompo do c�digo
     */
    private int codigo;
    /**
     * Vari�lvel referente ao caompo do IP
     */
    private String ip;
    /**
     * Vari�lvel referente ao caompo da data
     */
    private Date dataHora;
    /**
     * Vari�lvel referente ao caompo do logim do usuario
     */
    private String login;
    /**
     * Vari�lvel referente ao caompo do noome
     */
    private String nome;
    /**
     * Vari�lvel referente ao caompo do sobrenome
     */
    private String sobrenome;
    /**
     * Vari�lvel referente ao caompo do CPF do Interlocutor
     */
    private String cpf;
    /**
     * Vari�lvel referente ao caompo do status do operador
     */
    private String statusOperacao;

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
    public void setCodigo(final int codigo) {
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
    public void setIp(final String ip) {
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
    public void setDataHora(final Date dataHora) {
        this.dataHora = dataHora;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login
     *            the login to set
     */
    public void setLogin(final String login) {
        this.login = login;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome
     *            the nome to set
     */
    public void setNome(final String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome
     *            the sobrenome to set
     */
    public void setSobrenome(final String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf
     *            the cpf to set
     */
    public void setCpf(final String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the statusOperacao
     */
    public String getStatusOperacao() {
        return statusOperacao;
    }

    /**
     * @param statusOperacao
     *            the statusOperacao to set
     */
    public void setStatusOperacao(final String statusOperacao) {
        this.statusOperacao = statusOperacao;
    }

}
