/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.prime.ioc.beanWrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teste {

    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("/com/spring/prime/ioc/beanWrapper/applicationContext.xml");

        System.out.println(bf.getBean("empresa"));

        BeanWrapper company = new BeanWrapperImpl((Empresa) bf.getBean("empresa"));

        //alterado assim...
        //company.setPropertyValue("nome", "Target Trust");
        // ou pode ser algo assim
        PropertyValue value = new PropertyValue("nome", "Some Company Inic.");
        company.setPropertyValue(value);

        BeanWrapper diego = new BeanWrapperImpl((Funcionario) bf.getBean("gestor"));
        diego.setPropertyValue("nome", "Diego Pacheco");
        company.setPropertyValue("gestor", diego.getWrappedInstance());

        Long sal = (Long) company.getPropertyValue("gestor.salario");
        System.out.println("Salário: " + sal);
        System.out.println(company);
        System.out.println(company.getWrappedInstance());

        // verifica o tipo da propriedade salarios
        System.out.println(((BeanWrapperImpl) company).getPropertyDescriptor("gestor.salario").getPropertyType());
        diego.setPropertyValue("salario", 200L);
        System.out.println(diego.getPropertyValue("salario"));

    }
}