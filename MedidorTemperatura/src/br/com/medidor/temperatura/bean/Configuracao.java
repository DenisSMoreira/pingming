/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medidor.temperatura.bean;

import java.io.Serializable;

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
    private Integer tempoExecucao;
    /**
     * Temperatura minima que o aquário pode chegar
     */
    private Integer temperaturaMinima;
    /**
     * Temperatura máxima que o aquário pode chegar
     */
    private Integer temperaturaMaxima;

    public Configuracao() {
    }

    /**
     * Construtor recebendo todos os parametros
     * @param id ID das configurações
     * @param tempoExecucao Tempo de execução em Segundos
     * @param temperaturaMinima Temperatura minima que o aquário pode chegar
     * @param temperaturaMaxima Temperatura máxima que o aquário pode chegar 
     */
    public Configuracao(Integer id, Integer tempoExecucao, Integer temperaturaMinima, Integer temperaturaMaxima) {
        this.id = id;
        this.temperaturaMaxima = temperaturaMaxima;
        this.temperaturaMinima = temperaturaMinima;
        this.tempoExecucao = tempoExecucao;

    }

    /**
     * Tempo de execução em Segundos
     * @return o tempoExecucao
     */
    public Integer getTempoExecucao() {
        return tempoExecucao;
    }

    /**
     * Tempo de execução em Segundos
     * @param tempoExecucao em segundos
     */
    public void setTempoExecucao(Integer tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
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
                + "\nTempo de Execução: " + tempoExecucao
                + "\nTemperatura Minima: " + temperaturaMinima
                + "\nTemperatura Máxima: " + temperaturaMaxima;
    }
}
