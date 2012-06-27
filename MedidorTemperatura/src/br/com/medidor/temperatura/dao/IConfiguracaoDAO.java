/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medidor.temperatura.dao;

import br.com.medidor.temperatura.bean.Configuracao;

/**
 * Interface do DAO de Configuração 
 * @author Paula
 */
public interface IConfiguracaoDAO {
    
    /**
     * Metodo para recuperar configurações no banco
     * @see Configuracao
     * @param id da configuração
     * @return Bean da Configuração
     */
    Configuracao buscarConfiguracoes(Integer id);
    
    /**
     * Metodo para alterar configurações salva no banco
     * @see Configuracao
     * @param configuracao Bean Configuração
     * @return True (Sucesso na persistencia do objeto ) ou False  (Erro na persistencia do objeto )
     */
    Boolean alterarConfiguracoes(Configuracao configuracao);
    
    
}
