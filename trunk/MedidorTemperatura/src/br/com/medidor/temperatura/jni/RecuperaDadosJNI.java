/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medidor.temperatura.jni;

import br.com.medidor.temperatura.bean.Configuracao;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import org.jfree.data.time.Minute;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;

/**
 *
 * @author Admin
 */
@SuppressWarnings("deprecation")
public class RecuperaDadosJNI {

    private static RecuperaDadosJNI recuperaDadosJNI = null;
    private TimeSeries timeSeries = null;
    private TimeSeriesCollection dataset = null;
    private List<Minute> listaTime = new ArrayList<Minute>();
    private List<Integer> listaTemperatura = new ArrayList<Integer>();
     int i = 1;
      int it = 1;
//TODO: Resgatar do C++
//    public native int temperatura();
//
//    static {
//        try {
//            System.loadLibrary("nativeDLL");
//        } catch (java.lang.UnsatisfiedLinkError e) {
//            System.out.println(e);
//        }
//
//    }

    public static RecuperaDadosJNI getInstance() {
        if (recuperaDadosJNI == null) {
            recuperaDadosJNI = new RecuperaDadosJNI();
            return recuperaDadosJNI;
        } else {
            return recuperaDadosJNI;
        }

    }

    //TESTE
    public TimeSeriesCollection recuperarDados(Configuracao configuracao) {

        try {
            dataset = new TimeSeriesCollection();
            timeSeries = new TimeSeries("Aquário 1", Minute.class);
            dataset.setDomainIsPointsInTime(true);

            listaTime.add(new Minute(it++,1 , 1, 12, 2012));

            final int temp = dadoFake(); //temperatura();
            listaTemperatura.add(temp);
            verificaTemperatura(temp, configuracao);

            for (int i = 0; i < listaTime.size(); i++) {
                Minute minute = listaTime.get(i);
                Integer temperatura = listaTemperatura.get(i);
                timeSeries.addOrUpdate(minute, temperatura);

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

    public void verificaTemperatura(Integer temperatura, Configuracao configuracao) {
        if (configuracao.getTemperaturaMinima() >= temperatura) {
            JOptionPane.showMessageDialog(null, "Temperatura Abaixo do permitido");
        } else if (configuracao.getTemperaturaMaxima() <= temperatura) {
            JOptionPane.showMessageDialog(null, "Temperatura Acima do permitido");
        }

    }
   public int dadoFake(){
        
          if(i <= 22){
             return i = i + 2;
           }else{
              return i =  i - 3;
          }
  
   }

    
}
