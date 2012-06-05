package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * Bean referente ao relat�rio Troca de Senha pelo Administrador
 */
public class TrocaSenhaAdministrador implements Serializable {

    /**
     * Id
     */
    private static final long serialVersionUID = 1L;

    /**
     * Vari�vel c�digo
     */
    private Long codigo;

    /**
     * Vari�vel ip
     */
    private String ip;

    /**
     * Vari�vel data e hora
     */
    private Date dataHora;

    /**
     * Vari�vel login
     */
    private String login;

    /**
     * Vari�vel nome
     */
    private String nome;

    /**
     * Vari�vel sobrenome
     */
    private String sobrenome;

    /**
     * Vari�vel cpf 
     */
    private String cpf;

    /**
     * Vari�vel login do operador
     */
    private String loginOperador;

    /**
     * Vari�vel nome do operador
     */
    private String nomeOperador;

    /**
     * Vari�vel sobrenome
     */
    private String sobrenomeOperador;

    /**
     * Vari�vel data e hora da opera��o
     */
    private Date dataHoraOperacao;

    /**
     * Vari�vel coment�rio
     */
    private String comentario;

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
    public void setCodigo(final Long codigo) {
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
     * @return the loginOperador
     */
    public String getLoginOperador() {
        return loginOperador;
    }

    /**
     * @param loginOperador
     *            the loginOperador to set
     */
    public void setLoginOperador(final String loginOperador) {
        this.loginOperador = loginOperador;
    }

    /**
     * @return the nomeOperador
     */
    public String getNomeOperador() {
        return nomeOperador;
    }

    /**
     * @param nomeOperador
     *            the nomeOperador to set
     */
    public void setNomeOperador(final String nomeOperador) {
        this.nomeOperador = nomeOperador;
    }

    /**
     * @return the sobrenomeOperador
     */
    public String getSobrenomeOperador() {
        return sobrenomeOperador;
    }

    /**
     * @param sobrenomeOperador
     *            the sobrenomeOperador to set
     */
    public void setSobrenomeOperador(final String sobrenomeOperador) {
        this.sobrenomeOperador = sobrenomeOperador;
    }

    /**
     * @return the dataHoraOperacao
     */
    public Date getDataHoraOperacao() {
        return dataHoraOperacao;
    }

    /**
     * @param dataHoraOperacao
     *            the dataHoraOperacao to set
     */
    public void setDataHoraOperacao(final Date dataHoraOperacao) {
        this.dataHoraOperacao = dataHoraOperacao;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario
     *            the comentario to set
     */
    public void setComentario(final String comentario) {
        this.comentario = comentario;
    }
}
