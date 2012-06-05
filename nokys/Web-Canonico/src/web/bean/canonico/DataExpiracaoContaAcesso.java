package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * Classe DataExpiracaoContaAcesso Bean - tabela TDATAEXPIRCTAACSSO
 * 
 */
public class DataExpiracaoContaAcesso implements Serializable {

    /**
     * Atributo static long serialVersionUID
     */
    private static final long serialVersionUID = -5022655391013586211L;
/**
 * Atributo Long codigo - Bean campo CDATAEXPIRCTAACSSO
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
 * Atributo String sobrenome - Bean campo ISOBRENOME
 */
    private String sobrenome;
/**
 * Atributo String cpf - Bean campo NCPF
 */
    private String cpf;
/**
 * Atributo String loginOperador - Bean campo RLOGINOPERD
 */
    private String loginOperador;
/**
 * Atributo String nomeOperador - Bean campo INOMEOPERD
 */
    private String nomeOperador;
/**
 * Atributo String sobrenomeOperador - Bean campo ISOBRENOMEOPERD
 */
    private String sobrenomeOperador;
/**
 * Atributo Date dataHoraOperacao - Bean campo DDATAHORAOPERD
 */
    private Date dataHoraOperacao;
/**
 * Atributo String comentario - Bean campo RCOMEN
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
