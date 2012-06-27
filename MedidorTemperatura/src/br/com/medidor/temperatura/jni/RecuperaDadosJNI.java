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

/**
 * Recupera dados atráves do JNI
 * @author Paula
 */
@SuppressWarnings("deprecation")
public class RecuperaDadosJNI {

    private static RecuperaDadosJNI recuperaDadosJNI = null;
    private TimeSeries timeSeries = null;
    private TimeSeriesCollection dataset = null;
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
            System.loadLibrary("C:\\nativeDLL.dll");
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
    public TimeSeriesCollection recuperarDados(Configuracao configuracao) {

        try {
            dataset = new TimeSeriesCollection();
            timeSeries = new TimeSeries("Aquário 1", Minute.class);
            dataset.setDomainIsPointsInTime(true);

            listaTime.add(new Minute());

            final int temp = temperatura();
            listaTemperatura.add(temp);
            ValidaTemperaturaUtil.verificaTemperatura(temp, configuracao);

            for (int i = 0; i < listaTime.size(); i++) {
                final Minute minute = listaTime.get(i);
                final Integer temperatura = listaTemperatura.get(i);
                timeSeries.add(minute, temperatura);

                if (listaTime.size() >= 10 && listaTemperatura.size() >= 10) {
                    listaTime.remove(minute);
                    listaTemperatura.remove(temperatura);
                }
            }

        } catch (Exception e) {
            System.err.println(e.getMessage() + e);
        }


        dataset.addSeries(timeSeries);


        return dataset;
    }
}
