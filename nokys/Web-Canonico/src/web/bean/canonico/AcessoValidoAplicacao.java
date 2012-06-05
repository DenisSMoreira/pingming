package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Classe AcessoValidoAplicacao - Bean tabela TACSSOVALIDAPLIC
 * 
 */
public class AcessoValidoAplicacao implements Serializable {
    /**
     * Atributo static long serialVersionUID
     */
    private static final long serialVersionUID = 3153957291651945783L;
    /**
     * Atributo Long codigo - Bean campo CACSSOVALIDAPLIC
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
     * Atributo String login - Bean campo RLOGIN
     */
    private String login;
    /**
     * Atributo String nome - Bean campo INOME
     */
    private String nome;
    /**
     * Atributo String nome - Bean campo ISOBRENOME
     */
    private String sobrenome;
    /**
     * Atributo String NCPF - Bean campo NCPF
     */
    private String cpf;

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
}
