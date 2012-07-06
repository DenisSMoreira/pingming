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

    private static RecuperaDadosJNI recuperaDadosJNI = null;
    private XYSeries xYSeries = new XYSeries("DataSet");
    private XYSeriesCollection seriesCollection = null;
    private List<Number> listaTemperatura = new ArrayList<Number>();
    int i = 20;

    /**
     * Nome do metodo nativo de outra linguagem
     * @return int temperatura 
     */
    public native int temperatura();
    //Carrega .dll

    static {
        try {
            System.load("C:\\Users\\Paulinha\\Documents\\NetBeansProjects\\Temperatura\\dist\\Debug\\MinGW-Windows\\libTemperatura.dll");
        } catch (java.lang.UnsatisfiedLinkError e) {
            System.err.println(e);
        }

    }
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

            listaTemperatura.add(temperatura());
            int tam = listaTemperatura.size();
 
            for (int i = 0; i < tam; i++) {
                Number temperatura;
                temperatura = listaTemperatura.get(i);
                XYDataItem dataItem = new XYDataItem(temperatura, i);

                if (listaTemperatura.size() >= 10) {
                    listaTemperatura.remove(0);
                }
              
                xYSeries.addOrUpdate(dataItem);
            }

     
        } catch (Exception e) {
            System.err.println(e.getMessage() + e);
        }
        seriesCollection.addSeries(xYSeries);


        return seriesCollection;
    }

  
}
