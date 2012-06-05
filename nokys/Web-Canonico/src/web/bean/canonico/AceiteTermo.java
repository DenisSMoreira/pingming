package web.bean.canonico;

import java.io.Serializable;
import java.sql.Date;

public class AceiteTermo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1421510860922868230L;
	
	private Long numeroCpf;
	private Long codigoCliente;
	private Date dataAceiteTermo;
	private Integer codigoTermo;
	
	public Long getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(Long numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public Long getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(Long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public Date getDataAceiteTermo() {
		return dataAceiteTermo;
	}
	public void setDataAceiteTermo(Date dataAceiteTermo) {
		this.dataAceiteTermo = dataAceiteTermo;
	}
	public Integer getCodigoTermo() {
		return codigoTermo;
	}
	public void setCodigoTermo(Integer codigoTermo) {
		this.codigoTermo = codigoTermo;
	}
 
	
}
