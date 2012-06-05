/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package denis.ping.service.constants;

/**
 * Classe Enum, responsavel por armazenar valores estáticos para fácil resgate.
 * @author Denis Soares Moreira
 */
public enum EnumConst {

    /**
     * Zero, '0'
     */
    ZERO(0),
     /**
     * Um, '1'
     */
    UM(1),
     /**
     * DOIS, '2'
     */
    DOIS(2),
    /**
     * TRES, '3'
     */
    TRES(3),
     /**
     * QUATRO, '4'
     */
    QUATRO(4),
   /**
     * SEIS, '6'
     */
    SEIS(6),
     /**
     * NOVE, '9'
     */
    NOVE(9),
    /**
     * MIL E VINTE QUATRO, '1024'
     */
    MIL_VINTE_QUATRO(1024);

    /**
     * Valor do enum
     */
    private int valor;

    /**
     * Construtor
     * @param valor valor
     */
    private EnumConst(int valor){
        this.valor = valor;
    }

    /**
     * Metodo get() usado para recuperar o valor de enum desejado.
     * @return valor
     */
    public int val(){
        return valor;
    }
}
