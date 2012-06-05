package web.bean.canonico;

import java.io.Serializable;

public class TipoCanal implements Serializable{


    private static final long serialVersionUID = 8971371381584023167L;
    private Long codigo;
    private String descricao;
    
    
    public TipoCanal(){
        
        
    }


    /**
     * @return the codigo
     */
    public Long getCodigo() {
        return codigo;
    }


    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Long codigo) {
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

