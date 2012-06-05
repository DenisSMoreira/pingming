package web.bean.canonico;

import java.io.Serializable;



/**
 * Bean - Dados do produto
 */
public class Produto  implements Serializable{


    private static final long serialVersionUID = -5856609054442863560L;
    private Integer codigo;
    private Emissao emissao;
    private String nomeProduto;
    private Short codigoExterno;

    public Produto(){      
    }

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
     * @return the emissao
     */
    public Emissao getEmissao() {
        return emissao;
    }

    /**
     * @param emissao the emissao to set
     */
    public void setEmissao(Emissao emissao) {
        this.emissao = emissao;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the codigoExterno
     */
    public Short getCodigoExterno() {
        return codigoExterno;
    }

    /**
     * @param codigoExterno the codigoExterno to set
     */
    public void setCodigoExterno(Short codigoExterno) {
        this.codigoExterno = codigoExterno;
    }
    
    
    
}
