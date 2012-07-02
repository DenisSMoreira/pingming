/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.prime.ioc.event;

import org.springframework.context.ApplicationEvent;

/**
 *
 * @author dmoreira
 */
public class NomeEvent extends ApplicationEvent {

    private String nomeUser;
    private static final long serialVersionUID = 1L;

    public NomeEvent(Object source, String nomeUser) {
        super(source);
        this.nomeUser = nomeUser;
    }

    public String getNome() {
        return nomeUser;

    }
}
