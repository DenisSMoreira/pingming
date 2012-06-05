package web.bean.canonico;

import java.io.Serializable;
import java.util.Date;

public class Funcionario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idCartao;
	private String cpf;
	private String nome;
	private Date dataNasc;
	private String statusCartao;
	private String statusFuncionario;
	private Date periodoInicial;
	private Date periodoFinal;

	public Funcionario() {
		super();
	}

	public Funcionario(Long idCartao, String cpf, String nome, Date dataNasc,
			String statusCartao) {
		super();
		this.idCartao = idCartao;
		this.cpf = cpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.statusCartao = statusCartao;
	}

	public Funcionario(Long idCartao, String cpf, String nome, Date dataNasc,
			String statusCartao, String statusFuncionario, Date periodoInicial,
			Date periodoFinal) {
		super();
		this.idCartao = idCartao;
		this.cpf = cpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.statusCartao = statusCartao;
		this.statusFuncionario = statusFuncionario;
		this.periodoInicial = periodoInicial;
		this.periodoFinal = periodoFinal;
	}

	public Long getIdCartao() {
		return idCartao;
	}

	public void setIdCartao(Long idCartao) {
		this.idCartao = idCartao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getStatusCartao() {
		return statusCartao;
	}

	public void setStatusCartao(String statusCartao) {
		this.statusCartao = statusCartao;
	}

	public String getStatusFuncionario() {
		return statusFuncionario;
	}

	public void setStatusFuncionario(String statusFuncionario) {
		this.statusFuncionario = statusFuncionario;
	}

	public Date getPeriodoInicial() {
		return periodoInicial;
	}

	public void setPeriodoInicial(Date periodoInicial) {
		this.periodoInicial = periodoInicial;
	}

	public Date getPeriodoFinal() {
		return periodoFinal;
	}

	public void setPeriodoFinal(Date periodoFinal) {
		this.periodoFinal = periodoFinal;
	}
	
	
}
