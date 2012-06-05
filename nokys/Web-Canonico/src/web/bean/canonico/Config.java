package web.bean.canonico;

public class Config implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5938695390069524542L;
	private Long codConfig;
	private Long tempoRecarga;
	private String email;

	public Long getTempoRecarga() {
		return tempoRecarga;
	}

	public void setTempoRecarga(Long tempoRecarga) {
		this.tempoRecarga = tempoRecarga;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCodConfig() {
		return codConfig;
	}

	public void setCodConfig(Long codConfig) {
		this.codConfig = codConfig;
	}

}
