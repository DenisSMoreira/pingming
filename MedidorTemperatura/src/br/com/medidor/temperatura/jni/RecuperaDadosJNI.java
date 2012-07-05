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
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Recupera dados atráves do JNI
 * @author Paula
 */
@SuppressWarnings("deprecation")
public class RecuperaDadosJNI {

    private static RecuperaDadosJNI recuperaDadosJNI = null;
    private XYSeries xYSeries = null;
    private XYSeriesCollection seriesCollection = null;
    private List<Minute> listaTime = new ArrayList<Minute>();
    private List<Integer> listaTemperatura = new ArrayList<Integer>();

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
            listaTime.add(new Minute());

            final int temp = temperatura();
            System.out.println("*********"+temp);
            listaTemperatura.add(temp);
            ValidaTemperaturaUtil.verificaTemperatura(temp, configuracao);

            for (int i = 0; i < listaTime.size(); i++) {
                final Minute minute = listaTime.get(i);
                final Integer temperatura = listaTemperatura.get(i);
                xYSeries.add(minute.getHourValue(), temperatura);

                if (listaTime.size() >= 10 && listaTemperatura.size() >= 10) {
                    listaTime.remove(minute);
                    listaTemperatura.remove(temperatura);
                }
            }

        } catch (Exception e) {
            System.err.println(e.getMessage() + e);
        }


        seriesCollection.addSeries(xYSeries);


        return seriesCollection;
    }
}
