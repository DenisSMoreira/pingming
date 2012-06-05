package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Bean Login do usuario
 * 
 */
public class LoginUsuario implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 6890178656232603426L;

    /**
     * Codigo do usuario
     */
    private Integer codigo;

    /**
     * Usuario do tipo usuario
     */
    private Usuario usuario;

    /**
     * Login do usuario
     */
    private String login;

    /**
     * Senha do usuario
     */
    private String senha;

    /**
     * Data do ultimo Acesso feito no sistema
     */
    private Date dataUltimoAcesso;

    /**
     * Quantidades de tentativas de acesso a conta
     */
    private Integer qtdTentativasAcesso;

    /**
     * Status do login
     */
    private StatusLogin status;

    /**
     * Lista de Historico de senha
     */
    private List<HistoricoSenhaUsuario> listaHistSenha;

    /**
     * Data da ultima alteracao de senha
     */
    private Date dataUltimaAlteracaoSenha;

    /**
     * Data aceita
     */
    private Date dataAceite;

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo
     *            the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario
     *            the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha
     *            the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the dataUltimoAcesso
     */
    public Date getDataUltimoAcesso() {
        return dataUltimoAcesso;
    }

    /**
     * @param dataUltimoAcesso
     *            the dataUltimoAcesso to set
     */
    public void setDataUltimoAcesso(Date dataUltimoAcesso) {
        this.dataUltimoAcesso = dataUltimoAcesso;
    }

    /**
     * @return the qtdTentativasAcesso
     */
    public Integer getQtdTentativasAcesso() {
        return qtdTentativasAcesso;
    }

    /**
     * @param qtdTentativasAcesso
     *            the qtdTentativasAcesso to set
     */
    public void setQtdTentativasAcesso(Integer qtdTentativasAcesso) {
        this.qtdTentativasAcesso = qtdTentativasAcesso;
    }

    /**
     * @return the status
     */
    public StatusLogin getStatus() {
        return status;
    }

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(StatusLogin status) {
        this.status = status;
    }

    /**
     * @return the listaHistSenha
     */
    public List<HistoricoSenhaUsuario> getListaHistSenha() {
        return listaHistSenha;
    }

    /**
     * @param listaHistSenha
     *            the listaHistSenha to set
     */
    public void setListaHistSenha(List<HistoricoSenhaUsuario> listaHistSenha) {
        this.listaHistSenha = listaHistSenha;
    }

    /**
     * @return the dataUltimaAlteracaoSenha
     */
    public Date getDataUltimaAlteracaoSenha() {
        return dataUltimaAlteracaoSenha;
    }

    /**
     * @param dataUltimaAlteracaoSenha
     *            the dataUltimaAlteracaoSenha to set
     */
    public void setDataUltimaAlteracaoSenha(Date dataUltimaAlteracaoSenha) {
        this.dataUltimaAlteracaoSenha = dataUltimaAlteracaoSenha;
    }

    /**
     * @return the dataAceite
     */
    public Date getDataAceite() {
        return dataAceite;
    }

    /**
     * @param dataAceite
     *            the dataAceite to set
     */
    public void setDataAceite(Date dataAceite) {
        this.dataAceite = dataAceite;
    }

}
