package web.bean.canonico;

import java.io.Serializable;
import java.sql.Date;




/**
 * Bean - Dados da simulacao
 */
public class Simula implements Serializable{
 
    private static final long serialVersionUID = -3244328964079412306L;
    private Integer codigo;
    private Integer codigoTipoCliente;
    private Date dataCriacao;
    private Integer codigoCadastroCurto;
    
    public Simula(){
        
    }

    /**
     * Retorna o codigo do tipo de cliente
     * @return the codigoTipoCliente
     */
    public Integer getCodigoTipoCliente() {
        return codigoTipoCliente;
    }

    /**
     * 
     * Armazena o tipo de clietne
     * @param codigoTipoCliente
     *            the codigoTipoCliente to set
     */
    public void setCodigoTipoCliente(Integer codigoTipoCliente) {
        this.codigoTipoCliente = codigoTipoCliente;
    }

    /**
     * Retorna o codigo da simulacao
     * @return codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Armazena o codigo da simulacao
     * @param codigo codigo
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    /**
     * Retorna a data da simulacao
     * @return dataCriacao
     */
    public Date getDataCriacao() {
        return dataCriacao;
    }

    /**
     * Armazena data de criacao 
     * @param dataCriacao dataCriacao
     */
    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    /**
     * @param codigoCadastroCurto the codigoCadastroCurto to set
     */
    public void setCodigoCadastroCurto(Integer codigoCadastroCurto) {
        this.codigoCadastroCurto = codigoCadastroCurto;
    }

    /**
     * @return the codigoCadastroCurto
     */
    public Integer getCodigoCadastroCurto() {
        return codigoCadastroCurto;
    }
}
