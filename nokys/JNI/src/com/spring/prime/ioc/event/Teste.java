/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.prime.ioc.event;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Teste {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("/com/spring/prime/ioc/event/applicationContext.xml");

        RH rh = (RH) ac.getBean("rh");
        rh.pulicarFeriados();
        rh.pulicarNomes();
    }
}
