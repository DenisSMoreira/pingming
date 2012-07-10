/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.prime.ioc.beanFactoryPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teste {

    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("/com/spring/prime/ioc/beanFactoryPostProcessor/applicationContext.xml");
        System.out.println("Data Brasil pattern : " + ((DataService) ap.getBean("brasilDateService")).showSysDate());
        System.out.println("Data Us pattern: " + ((DataService) ap.getBean("usDateService")).showSysDate());

    }
}