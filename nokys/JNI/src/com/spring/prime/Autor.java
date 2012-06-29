/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.prime;

import java.util.List;

/**
 *
 * @author dmoreira
 */
public class Autor {

    private String nome;
    private List<Livro> publicaveis;
    private Listavel list;

    public Autor() {
    }

    public Autor(String nome) {
        super();
        this.nome = nome;
    }

    public void listarPorNome() {
        List ret = list.list(nome, publicaveis);
        System.out.println((ret.size() == 0) ? "NDA" : ret);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getPublicaveis() {
        return publicaveis;
    }

    public void setPublicaveis(List<Livro> publicaveis) {
        this.publicaveis = publicaveis;
    }

    public Listavel getList() {
        return list;
    }

    public void setList(Listavel list) {
        this.list = list;
    }

    
}
