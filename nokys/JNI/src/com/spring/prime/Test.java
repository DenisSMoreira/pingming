package com.spring.prime;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author dmoreira
 */
public class Test {

    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("\\com\\spring\\prime\\applicationContext.xml");
        Autor bean = (Autor) bf.getBean("diego");
        bean.listarPorNome();
    }
}
