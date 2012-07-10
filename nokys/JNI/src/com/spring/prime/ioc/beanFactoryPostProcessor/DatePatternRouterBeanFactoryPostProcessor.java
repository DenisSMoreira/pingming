/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.prime.ioc.beanFactoryPostProcessor;

import java.io.FileInputStream;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;


import org.springframework.beans.BeansException;
import org.springframework.beans.FatalBeanException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DatePatternRouterBeanFactoryPostProcessor implements
        BeanFactoryPostProcessor {

    @Override
    @SuppressWarnings("unchecked")
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        Properties p = new Properties();
        try {
            p.load(new FileInputStream("C:/Users/dmoreira/Documents/NetBeansProjects/nokys/JNI/src/com/spring/prime/ioc/beanFactoryPostProcessor/patterns.properties"));
            System.out.println("Patterns: " + p);
        } catch (Exception e) {
            throw new FatalBeanException("Erro ao buscar patterns!", e);
        }

        Map<String, DataService> beans = beanFactory.getBeansOfType(DataService.class);
        for (Entry<String, DataService> e : beans.entrySet()) {
            System.out.println("Aplicando pattern em service: " + e);
            DataService service = ((DataService) e.getValue());
            service.setPattern(p.getProperty("pattern." + service.getPattern().replace("#", "")));
        }
    }
}