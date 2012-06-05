package web.bean.canonico;

import java.io.Serializable;
import java.util.List;

/**
 * Bean Perfil do Servi�o WebAdmin
 * 
 * @author scopus
 */
public class PerfilWebAdmin implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -4049307134142721552L;

    /**
     * Codigo do perfil
     */
    private Integer codigo;

    /**
     * Descricao do Perfil
     */
    private String descricao;

    /**
     * Funcionalidades relacionadas ao perfil
     */
    private List<FuncionalidadeWebAdmin> funcionalidades;

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo
     *            the codigo to set
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
     * @param descricao
     *            the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the funcionalidades
     */
    public List<FuncionalidadeWebAdmin> getFuncionalidades() {
        return funcionalidades;
    }

    /**
     * @param funcionalidades
     *            the funcionalidades to set
     */
    public void setFuncionalidades(List<FuncionalidadeWebAdmin> funcionalidades) {
        this.funcionalidades = funcionalidades;
    }
}