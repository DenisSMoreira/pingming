package web.login.enity.bean;

import java.io.Serializable;

/**
 * Bean StatusLogin.
 * */
public class StatusLogin implements Serializable {


    /**
     * 
     */
    private static final long serialVersionUID = 4465136663554280418L;

     private Short codigo;
     
     private String descricao;

    /**
     * @return the codigo
     */
    public Short getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Short codigo) {
        this.codigo = codigo;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    

}