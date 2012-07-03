package web.login.enity.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * Bean Cargo
 *
 *
 */
@Entity
public class Cargo implements Serializable {

    /**
     *
     * Atributo = Serial Version
     *
     */
    private static final long serialVersionUID = 1L;
    /**
     *
     * Atributo = Codigo Cargo
     *
     */
    @Id
    private Integer codigoCargo;
    /**
     *
     * Atributo = Descri��o do Cargo
     *
     */
  
    private String descricaoCargo;

    /**
     * @return the codigoCargo
     */
    public Integer getCodigoCargo() {
        return codigoCargo;
    }

    /**
     * @param codigoCargo the codigoCargo to set
     */
    public void setCodigoCargo(Integer codigoCargo) {
        this.codigoCargo = codigoCargo;
    }

    /**
     * @return the descricaoCargo
     */
    public String getDescricaoCargo() {
        return descricaoCargo;
    }

    /**
     * @param descricaoCargo the descricaoCargo to set
     */
    public void setDescricaoCargo(String descricaoCargo) {
        this.descricaoCargo = descricaoCargo;
    }
}
