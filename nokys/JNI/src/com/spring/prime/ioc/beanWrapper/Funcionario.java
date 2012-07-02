/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.prime.ioc.beanWrapper;

public class Funcionario {

    private String nome;
    private Long salario;

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario[ nome: " + nome
                + " , salario: " + salario + " ]";
    }
}