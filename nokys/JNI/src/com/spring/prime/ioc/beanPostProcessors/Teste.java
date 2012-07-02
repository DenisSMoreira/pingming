/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.prime.ioc.beanPostProcessors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dmoreira
 */
public class Teste {

    public static void main(String args[]) {
        new ClassPathXmlApplicationContext("\\com\\spring\\prime\\ioc\\beanPostProcessors\\applicationContext.xml");
    }
}
