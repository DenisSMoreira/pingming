/**
 * 
 */
package web.bean.canonico;

import java.io.Serializable;

/**
 * Bean Cargo
 * 
 */
public class CargoWebAdmin implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 7792311034857239740L;

    /**
     * Codigo Cargo
     */
    private Integer codigo;

    /**
     * Descricao do Cargo
     */
    private String descricao;

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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
    
        

}
