/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.view.autenticacao;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import web.login.comum.exceptions.LoginAcessoException;
import web.login.service.autenticacao.IAutenticacaoService;
import web.login.util.Forwards;

@ManagedBean
@RequestScoped
public class Autenticacao implements Serializable {

    private static final long serialVersionUID = 1L;
    private String usuario;
    private String senha;
    private IAutenticacaoService autenticacaoService;

    public String verificarAutenticacao() {
        String retorno = "";
        try {
            if (autenticacaoService.validaAutenticacao(usuario, senha)) {
                retorno = Forwards.HOME;
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario ou senha inválida!", null));
                retorno = "";
            }
        } catch (LoginAcessoException ex) {
            Logger.getLogger(Autenticacao.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
        return retorno;
    }

    public String forwardRecuperar() {
        return Forwards.RECUPERAR_SENHA;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the autenticacaoService
     */
    public IAutenticacaoService getAutenticacaoService() {
        return autenticacaoService;
    }

    /**
     * @param autenticacaoService the autenticacaoService to set
     */
    public void setAutenticacaoService(IAutenticacaoService autenticacaoService) {
        this.autenticacaoService = autenticacaoService;
    }
}
