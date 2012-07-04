/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package web.login.phaseListener;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.servlet.http.HttpSession;
import web.comum.session.SessaoWeb;

/**
 *
 * @author dmoreira
 */
public class PhaseListener implements javax.faces.event.PhaseListener {

    @Override
    public void afterPhase(PhaseEvent event) {
// <<<<<<<<<<<<<<<< FILTRO >>>>>>>>>>>>>>>>>
        // Obtém o contexto atual
        FacesContext contexto = event.getFacesContext();
        // Obtém a página que atualmente está interagindo com o ciclo
        String paginaAtual = contexto.getViewRoot().getViewId();
        // Se for a página 'Autenticacao.xhtml' seta a variável como true
        boolean isLoginPage = paginaAtual.lastIndexOf("Autenticacao.xhtml") > -1;
        // Obtém a sessão atual
        HttpSession sessao = (HttpSession) contexto.getExternalContext().getSession(false);
        // Restaga o nome do usuário logado

        if (sessao != null) {
            SessaoWeb sessaoWeb = (SessaoWeb) sessao.getAttribute("sessaoWeb");
            if (sessaoWeb != null) {
                // Verifica se o usuário está logado e se não está na página de login
                if (!isLoginPage && sessaoWeb.isStatusUser() == SessaoWeb.ESTADO_EXPIRADO) {
                    // Redireciona o fluxo para a página de login
                    NavigationHandler nh = contexto.getApplication().getNavigationHandler();
                    nh.handleNavigation(contexto, null, "autenticacao");

                } else if (isLoginPage && sessaoWeb.isStatusUser() == SessaoWeb.ESTADO_ONLINE) {
                    // Se o usuário logado tentar acessar a página de login ele é
                    // redirecionado para a página inicial
                    NavigationHandler nh = contexto.getApplication().getNavigationHandler();
                    nh.handleNavigation(contexto, null, "home");
                }
            } else {
                // Redireciona o fluxo para a página de login
                NavigationHandler nh = contexto.getApplication().getNavigationHandler();
                nh.handleNavigation(contexto, null, "autenticacao");
            }
        } else {
            // Redireciona o fluxo para a página de login
            NavigationHandler nh = contexto.getApplication().getNavigationHandler();
            nh.handleNavigation(contexto, null, "autenticacao");
        }


        event.getFacesContext().getExternalContext().log("AFTER: " + event.getPhaseId());

    }

    @Override
    public void beforePhase(PhaseEvent event) {
        event.getFacesContext().getExternalContext().log("BEFORE: " + event.getPhaseId());

    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.RESTORE_VIEW;
    }
}
