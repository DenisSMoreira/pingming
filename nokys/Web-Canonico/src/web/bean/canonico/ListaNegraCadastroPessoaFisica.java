package web.bean.canonico;

import java.io.Serializable;

public class ListaNegraCadastroPessoaFisica implements Serializable {


	private static final long serialVersionUID = -4392169637863804910L;
	private ListaNegraCadastroPessoaFisicaId listaNegraCadastroPessoaFisicaId;
	private MotivoInclusaoListaNegra motivoInclusaoListaNegra;
	private Byte codigoSituacaoListaNegra;
	private Login login;

	public ListaNegraCadastroPessoaFisica() {

	}



	public Byte getCodigoSituacaoListaNegra() {
		return codigoSituacaoListaNegra;
	}

	public void setCodigoSituacaoListaNegra(Byte codigoSituacaoListaNegra) {
		this.codigoSituacaoListaNegra = codigoSituacaoListaNegra;
	}

	public void setListaNegraCadastroPessoaFisicaId(ListaNegraCadastroPessoaFisicaId listaNegraCadastroPessoaFisicaId) {
		this.listaNegraCadastroPessoaFisicaId = listaNegraCadastroPessoaFisicaId;
	}

	public ListaNegraCadastroPessoaFisicaId getListaNegraCadastroPessoaFisicaId() {
		return listaNegraCadastroPessoaFisicaId;
	}



	public void setMotivoInclusaoListaNegra(MotivoInclusaoListaNegra motivoInclusaoListaNegra) {
		this.motivoInclusaoListaNegra = motivoInclusaoListaNegra;
	}



	public MotivoInclusaoListaNegra getMotivoInclusaoListaNegra() {
		return motivoInclusaoListaNegra;
	}



	public void setLogin(Login login) {
		this.login = login;
	}



	public Login getLogin() {
		return login;
	}




}
