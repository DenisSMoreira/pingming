/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.prime.event;

import org.springframework.context.ApplicationEvent;

public class FeriadoEvent extends ApplicationEvent {

    private String data;
    private static final long serialVersionUID = 1L;

    public FeriadoEvent(Object source, String data) {
        super(source);
        this.data = data;
    }

    public String getData() {
        return data;

    }
}
