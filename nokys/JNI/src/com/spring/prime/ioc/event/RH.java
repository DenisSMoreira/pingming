/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.prime.ioc.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class RH implements ApplicationContextAware {

    private ApplicationContext ac;

    public void pulicarFeriados() {
        ac.publishEvent(new FeriadoEvent(this, "01/01/08"));
        ac.publishEvent(new FeriadoEvent(this, "15/12/12"));
    }
     public void pulicarNomes() {
        ac.publishEvent(new NomeEvent(this, "Denis Soares Moreira"));
        ac.publishEvent(new NomeEvent(this, "Juliana Soares Moreira"));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ac = applicationContext;
    }
}