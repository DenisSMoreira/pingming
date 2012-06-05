package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;
    /**
    * bean referente ao relat�rio Ativa��o/desativa��o da funcionalidade -
    * N�o permite a troca de senha
    */
public class NaoPermitirTrocaSenha implements Serializable {
    /**
     * Vari�lvel referente ao form
     */
    private static final long serialVersionUID = -4476698019534270617L;
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
     * Vari�lvel referente ao caompo do login do usuario
     */
    private String login;
    /**
     * Vari�lvel referente ao caompo do nome do uau�rio
     */
    private String nome;
    /**
     * Vari�lvel referente ao caompo do sobrenome do usu�rio
     */
    private String sobrenome;
    /**
     * Vari�lvel referente ao caompo do CPF do Interlocutor
     */
    private String cpf;
    /**
     * Vari�lvel referente ao caompo do Login do Operador
     */
    private String loginOperador;
    /**
     * Vari�lvel referente ao caompo do nome do Operador
     */
    private String nomeOperador;
    /**
     * Vari�lvel referente ao caompo do sobrenome do Operador
     */
    private String sobrenomeOperador;
    /**
     * Vari�lvel referente ao caompo ddata do Operador
     */
    private Date dataHoraOperacao;
    /**
     * Vari�lvel referente ao caompo do coment�rio
     */
    private String comentario;
    /**
     * Vari�lvel referente ao caompo da a��o
     */
    private String acao;

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
    public void setAcao(final String acao) {
        this.acao = acao;
    }

}
