/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.prime.ioc.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class FeriadoListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof FeriadoEvent) {
            FeriadoEvent fe = (FeriadoEvent) event;
            System.out.println("Viva! Dia: " + fe.getData() + " é feriado.Uhhuu!!!");
        }        
         if (event instanceof NomeEvent) {
            NomeEvent fe = (NomeEvent) event;
            System.out.println("Nome: " + fe.getNome() + ".");
        }
    }
}