/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.prime.ioc.beanWrapper;

public class Empresa {

    private String nome;
    private Funcionario gestor;

    public Empresa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getGestor() {
        return gestor;
    }

    public void setGestor(Funcionario gestor) {
        this.gestor = gestor;
    }

    @Override
    public String toString() {
        return "Empresa [ " + nome + " | " + gestor.toString() + "]";

    }
}