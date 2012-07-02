/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.prime.ioc;

public class Livro implements Publicavel {

    private String autor;
    private String titulo;
    private String editora;
    private int ano;

    public Livro() {
    }

    public Livro(String autor, String titulo, String editora, int ano) {
        super();
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
    }

    @Override
    public String getNome() {
        return getTitulo();
    }

    @Override
    public String getTipo() {
        return "Livro";
    }

    @Override
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + " editor: " + editora
                + " ano: " + ano;
    }
}
