package web.bean.canonico;

import java.util.Date;

public class Tempo implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3272440594691782127L;

	private Long codTempo;
	
	private Servico servico;
	
	private Date horaDia;
	
	private Long tempoSegundos;

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Long getCodTempo() {
		return codTempo;
	}

	public void setCodTempo(Long codTempo) {
		this.codTempo = codTempo;
	}

	public Date getHoraDia() {
		return horaDia;
	}

	public void setHoraDia(Date horaDia) {
		this.horaDia = horaDia;
	}

	public Long getTempoSegundos() {
		return tempoSegundos;
	}

	public void setTempoSegundos(Long tempoSegundos) {
		this.tempoSegundos = tempoSegundos;
	}

}