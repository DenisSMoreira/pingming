/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medidor.temperatura.jni;

import br.com.medidor.temperatura.bean.Configuracao;
import br.com.medidor.temperatura.util.ValidaTemperaturaUtil;
import java.util.ArrayList;
import java.util.List;

import org.jfree.data.time.Minute;
import org.jfree.data.xy.XYDataItem;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Recupera dados atráves do JNI
 * @author Paula
 */
public class RecuperaDadosJNI {
    private static final int INICIALIZADOR = 1;
    private static final int ULTIMOS_DEZ = 10;
    private static RecuperaDadosJNI recuperaDadosJNI = null;
    private XYSeries xYSeries = new XYSeries("Temperatura Medida");
    private XYSeriesCollection seriesCollection = null;
    private List<Double> listaTemperatura = new ArrayList<Double>();

    /**
     * Nome do metodo nativo de outra linguagem
     * @return int temperatura 
     */
    /*
    public native int temperatura();
    //Carrega .dll

    static {
        try {
            System.load("C:\\Users\\Paulinha\\Documents\\NetBeansProjects\\Temperatura\\dist\\Debug\\MinGW-Windows\\libTemperatura.dll");
        } catch (java.lang.UnsatisfiedLinkError e) {
            System.err.println(e);
        }

    }
     * 
     */
    /**
     * Torna a classe singleton para melhorar performace
     * causado pela lentidão do JNI
     * @return RecuperaDadosJNI new();
     */
    public static RecuperaDadosJNI getInstance() {
        if (recuperaDadosJNI == null) {
            recuperaDadosJNI = new RecuperaDadosJNI();
            return recuperaDadosJNI;
        } else {
            return recuperaDadosJNI;
        }

    }

    /**
     * Recupera dados
     * @see Configuracao
     * @param Configuracao configuracao
     * @return TimeSeriesCollection
     */
    public XYSeriesCollection recuperarDados(Configuracao configuracao) {

        try {

            seriesCollection = new XYSeriesCollection();

            listaTemperatura.add((int) 2 + (Math.random() * 45));
            
            if (listaTemperatura.size() > ULTIMOS_DEZ) {
                listaTemperatura.remove(0);
            }
            xYSeries = new XYSeries("Temperatura Medida");
            for (int contador = 0; contador < ULTIMOS_DEZ; contador++) {
               double temperatura;
              
               if(contador == ULTIMOS_DEZ){
                   temperatura = listaTemperatura.get(contador-INICIALIZADOR);
                }else{ 
                   try{
                       temperatura = listaTemperatura.get(contador);
                   }catch(Exception e){
                       temperatura = 0;
                   }
                }

                int ultimoDez = contador + INICIALIZADOR;
                xYSeries.add(new XYDataItem(ultimoDez, temperatura));

            }

     
        } catch (Exception e) {
            System.err.println(e.getMessage() + e);
        }
        seriesCollection.addSeries(xYSeries);


        return seriesCollection;
    }

  
}
