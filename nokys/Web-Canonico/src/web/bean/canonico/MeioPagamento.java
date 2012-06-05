package web.bean.canonico;

/**
 * Bean - Informa��es do meio de pagamento
 */
public class MeioPagamento {

    /**
     * Codigo do meio de pagamento
     */
    private Long codigo;
    /**
     * Descri��o do meio de pagamento
     */
    private String meioPagamento;
    
    private String codigoExterior;

    /**
     * Recupera codigo do meio de pagamento
     * @return codigo
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * Armazena o codigo do meio de pagamento
     * @param codigo codigo
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

	public String getMeioPagamento() {
		return meioPagamento;
	}

	public void setMeioPagamento(String meioPagamento) {
		this.meioPagamento = meioPagamento;
	}

	public String getCodigoExterior() {
		return codigoExterior;
	}

	public void setCodigoExterior(String codigoExterior) {
		this.codigoExterior = codigoExterior;
	}
    


}
