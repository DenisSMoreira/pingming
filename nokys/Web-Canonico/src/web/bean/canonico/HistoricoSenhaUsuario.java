package web.bean.canonico;

import java.util.Date;

/**
 * Bens Historico de senha de Usuarios 
 */
public class HistoricoSenhaUsuario implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -367676020033455181L;
    
    /**
     * Codigo do historico de senha do usuario 
     */
    private Integer codigo;
    /**
     * Codigo do usuario
     */
	private Integer codigoUsuario;
	/**
     * senha
     */
	private String senha;

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
     * @return the codigoUsuario
     */
    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }
    /**
     * @param codigoUsuario the codigoUsuario to set
     */
    public void setCodigoUsuario(Integer codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }
    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }
    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
    /**
     * @return the dataAlteracao
     */
    public Date getDataAlteracao() {
        return dataAlteracao;
    }
    /**
     * @param dataAlteracao the dataAlteracao to set
     */
    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }
    private Date dataAlteracao;
    
	
}