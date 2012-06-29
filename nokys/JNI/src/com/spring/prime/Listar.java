/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.prime;

import java.util.ArrayList;
import java.util.List;

public class Listar implements Listavel {

    @Override
    public List<Publicavel> list(String nome, List<Livro> feitos ) {

        List<Publicavel> achados = new ArrayList<Publicavel>();

        for (Publicavel l : feitos) {
            if (l.getAutor().equals(nome)) {
                achados.add(l);
            }
        }
        return achados;

    }
}