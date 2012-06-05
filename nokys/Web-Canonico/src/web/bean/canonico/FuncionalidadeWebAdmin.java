package web.bean.canonico;

import java.io.Serializable;
/**
 * Bean de Funcionalidade WebAdmin
 * @author scopus
 */
public class FuncionalidadeWebAdmin  implements Serializable
{	
	/**
     * 
     */
    private static final long serialVersionUID = 6916178064002092353L;

    /**
	 * Codigo da funcionalidade
	 */
    private Integer codigo;
	
	/**
     * Descricao da funcionalidade
     */
    private String descricao;
    
    /**
     * Codigo do servico
     */
    private String codigoServico;
    
    /**
     * Assunto referente a funcionalidade 
     */
    private String assunto;
    
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

    /**
     * @return the codigoServico
     */
    public String getCodigoServico() {
        return codigoServico;
    }

    /**
     * @param codigoServico the codigoServico to set
     */
    public void setCodigoServico(String codigoServico) {
        this.codigoServico = codigoServico;
    }

    /**
     * @return the assunto
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * @param assunto the assunto to set
     */
    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}