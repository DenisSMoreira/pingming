/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medidor.temperatura.bean;

import java.io.Serializable;
import java.util.Date;

/**
 *  Bean de Enity usado para salvar as  Configurações
 *  @author Paula
 */
public class Configuracao implements Serializable {

    /**
     * ID do Serial Version do objeto usado para Serialização
     */
    private static final long serialVersionUID = 1L;
    /**
     * ID das configurações
     */
    private Integer id;
    /**
     * Tempo de execução em Segundos
     */
    private Integer segundosAtualizacao;
    /**
     * Temperatura minima que o aquário pode chegar
     */
    private Integer temperaturaMinima;
    /**
     * Temperatura máxima que o aquário pode chegar
     */
    private Integer temperaturaMaxima;
    /**
     * Temperatura máxima que o aquário pode chegar
     */
    private Date data;

    public Configuracao() {
    }

    /**
     * Construtor recebendo todos os parametros
     * @param id ID das configurações
     * @param tempoExecucao Tempo de execução em Segundos
     * @param temperaturaMinima Temperatura minima que o aquário pode chegar
     * @param temperaturaMaxima Temperatura máxima que o aquário pode chegar 
     */
    public Configuracao(Integer id, Integer segundosAtualizacao, Integer temperaturaMinima, 
            Integer temperaturaMaxima, Date data) {
        this.id = id;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
        this.segundosAtualizacao = segundosAtualizacao;
        this.data = data;

    }
    /**
     * Data da Medicao da Temperatura
     * @return data da medicao
     */
    public Date getData() {
        return data;
    }
    
    /**
     * Data da Medicao da Temperatura
     * @param data da medicao
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * Tempo da Execução em Segundos
     * @return segundos
     */
    public Integer getSegundosAtualizacao() {
        return segundosAtualizacao;
    }

    /**
     * Tempo da Execução em Segundos
     * @param segundos
     */
    public void setSegundosAtualizacao(Integer segundosAtualizacao) {
        this.segundosAtualizacao = segundosAtualizacao;
    }

    /**
     * Temperatura minima  que o aquário pode chegar
     * @return a temperaturaMinima em Cº
     */
    public Integer getTemperaturaMinima() {
        return temperaturaMinima;
    }

    /**
     * Temperatura minima  que o aquário pode chegar
     * @param temperaturaMinima valor em Cº
     */
    public void setTemperaturaMinima(Integer temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
    }

    /**
     * Temperatura máxima que o aquário pode chegar
     * @return a temperaturaMaxima em Cº
     */
    public Integer getTemperaturaMaxima() {
        return temperaturaMaxima;
    }

    /**
     * Temperatura máxima que o aquário pode chegar
     * @param temperaturaMaxima valor em Cº
     */
    public void setTemperaturaMaxima(Integer temperaturaMaxima) {
        this.temperaturaMaxima = temperaturaMaxima;
    }

    /**
     * ID das configurações
     * @return codigo das configurações
     */
    public Integer getId() {
        return id;
    }

    /**
     * seta o ID das configurações
     * @param id codigo 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * toString personalizado usado para print do Objeto
     * @return Valores
     */
    @Override
    public String toString() {
        return "Configuracões"
                + "\nTempo de Execução: " + segundosAtualizacao
                + "\nTemperatura Minima: " + temperaturaMinima
                + "\nTemperatura Máxima: " + temperaturaMaxima
                + "\nData Medição: " + data;
    }
}
