package web.bean.canonico;

public class Threshold implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3992039180166380674L;

	private Long codigo;

	private Servico servico;
	
	private Long tempoAmarelo;
	
	private Long tempoVermelho;
	
	private Long tempoReenvio;
	
	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Long getTempoAmarelo() {
		return tempoAmarelo;
	}

	public void setTempoAmarelo(Long tempoAmarelo) {
		this.tempoAmarelo = tempoAmarelo;
	}

	public Long getTempoVermelho() {
		return tempoVermelho;
	}

	public void setTempoVermelho(Long tempoVermelho) {
		this.tempoVermelho = tempoVermelho;
	}

	public Long getTempoReenvio() {
		return tempoReenvio;
	}

	public void setTempoReenvio(Long tempoReenvio) {
		this.tempoReenvio = tempoReenvio;
	}

	public void setCodigo(Long codigo) {
		this.codigo = servico.getCodigo();
	}

	public Long getCodigo() {
		return servico.getCodigo();
	}

}
