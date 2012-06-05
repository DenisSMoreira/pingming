package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Classe DesbloqueioLogin
 * 
 */
public class DesbloqueioLogin implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -93802452332924570L;
    /**
     * Atributo codigo
     */
    private Long codigo;
    /**
     * Atributo codigo
     */
    private String ip;
    /**
     * Atributo data Hora
     */
    private Date dataHora;
    /**
     * Atributo login
     */
    private String login;
    /**
     * Atributo nome
     */
    private String nome;
    /**
     * Atributo sobrenome
     */
    private String sobrenome;
    /**
     * Atributo cpf
     */
    private String cpf;
    /**
     * Atributo login Operador
     */
    private String loginOperador;
    /**
     * Atributo nome Operador
     */
    private String nomeOperador;
    /**
     * Atributo sobrenome Operador
     */
    private String sobrenomeOperador;
    /**
     * Atributo data Hora Operacao
     */
    private Date dataHoraOperacao;
    /**
     * Atributo comentario
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
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login
     *            the login to set
     */
    public void setLogin(String login) {
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
    public void setNome(String nome) {
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
    public void setSobrenome(String sobrenome) {
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
    public void setCpf(String cpf) {
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
    public void setLoginOperador(String loginOperador) {
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
    public void setNomeOperador(String nomeOperador) {
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
    public void setSobrenomeOperador(String sobrenomeOperador) {
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
    public void setDataHoraOperacao(Date dataHoraOperacao) {
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
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
