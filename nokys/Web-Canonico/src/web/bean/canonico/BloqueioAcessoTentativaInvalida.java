package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Classe BloqueioAcessoTentativaInvalida
 * 
 */
public class BloqueioAcessoTentativaInvalida implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 4237021081464567457L;
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
