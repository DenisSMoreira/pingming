package web.bean.canonico;

import java.io.Serializable;

public class PerfilFuncionalidade implements Serializable {

	private static final long serialVersionUID = -9182514749392004454L;

	/**
	 * Perfil
	 */
	private Perfil perfil;

	/**
	 * Mode de Acesso
	 */
	private ModoAcesso modoAcesso;

	/**
	 * Funcionalidade
	 */
	private Funcionalidade funcionalidade;

	/**
	 * @return the perfil
	 */
	public Perfil getPerfil() {
		return perfil;
	}

	/**
	 * @param perfil
	 *            the perfil to set
	 */
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	/**
	 * @return the funcionalidade
	 */
	public Funcionalidade getFuncionalidade() {
		return funcionalidade;
	}

	/**
	 * @param funcionalidade
	 *            the funcionalidade to set
	 */
	public void setFuncionalidade(Funcionalidade funcionalidade) {
		this.funcionalidade = funcionalidade;
	}

	/**
	 * @param modoAcesso
	 *            the modoAcesso to set
	 */
	public void setModoAcesso(ModoAcesso modoAcesso) {
		this.modoAcesso = modoAcesso;
	}

	/**
	 * @return the modoAcesso
	 */
	public ModoAcesso getModoAcesso() {
		return modoAcesso;
	}

	@Override
	public boolean equals(Object perfilFuncionalidade) {

		if (perfilFuncionalidade instanceof PerfilFuncionalidade) {
			PerfilFuncionalidade perfilFuncionalidadeComp = (PerfilFuncionalidade) perfilFuncionalidade;

			return perfilFuncionalidadeComp.funcionalidade.getCodigo()
					.intValue() == this.funcionalidade.getCodigo().intValue()
					&& perfilFuncionalidadeComp.modoAcesso.getCodigo()
							.intValue() == this.modoAcesso.getCodigo()
							.intValue()
					&& perfilFuncionalidadeComp.getPerfil().getCodigo()
							.intValue() == this.perfil.getCodigo().intValue();

		}
		return false;

	}

	@Override
	public int hashCode() {
		int hash = 7;
		return hash +  this.funcionalidade.getCodigo().hashCode() +
				 this.modoAcesso.getCodigo().hashCode()
				* this.perfil.getCodigo().hashCode();
	}

}
