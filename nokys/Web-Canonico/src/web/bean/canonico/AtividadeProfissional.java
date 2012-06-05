package web.bean.canonico;

/**
 * bean Atividade Profissional
 */
public class AtividadeProfissional {
	
	/**
	 * Atributo = codigo
	 */
	private Integer codigo;
	
	/**
	 * Atributo=Atividade Profissional
	 */
	private String nomeAtividadeProfissional;

	/**
	 * 
	 * @return codigo
	 */
	public Integer getCodigo() {
		return codigo;
	}

	/**
	 * 
	 * @param codigo
	 */
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

    /**
     * @param nomeAtividadeProfissional the nomeAtividadeProfissional to set
     */
    public void setNomeAtividadeProfissional(String nomeAtividadeProfissional) {
        this.nomeAtividadeProfissional = nomeAtividadeProfissional;
    }

    /**
     * @return the nomeAtividadeProfissional
     */
    public String getNomeAtividadeProfissional() {
        return nomeAtividadeProfissional;
    }

	
	
	
}
