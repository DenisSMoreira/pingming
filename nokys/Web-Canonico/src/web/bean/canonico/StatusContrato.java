package web.bean.canonico;

import java.io.Serializable;

/**
 * Bean - Status do contrato
 */
public class StatusContrato implements Serializable {

   
  
    private static final long serialVersionUID = 2871416017805672842L;
    private Short cogido;
    private String descricao;
    private String codigoExterno;

    public StatusContrato(){
        
    }

    /**
     * @return the cogido
     */
    public Short getCogido() {
        return cogido;
    }

    /**
     * @param cogido the cogido to set
     */
    public void setCogido(Short cogido) {
        this.cogido = cogido;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the codigoExterno
     */
    public String getCodigoExterno() {
        return codigoExterno;
    }

    /**
     * @param codigoExterno the codigoExterno to set
     */
    public void setCodigoExterno(String codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    

}
