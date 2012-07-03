package web.login.enity.bean;

import java.sql.Date;

/**
 * 
 * Classe BEAN Login
 *
 */
public class Login implements java.io.Serializable {

    private static final long serialVersionUID = -4647147468778964937L;
    private Long nroCpf;
    private PerguntaSecreta perguntaSecreta;
    private StatusLogin statusLogin;
    private String senha;
    private String respostaSecreta;
    private Date dataUltimoAcesso;
    private Integer qtdTentativasAcesso;
    private Date dataUltimaAlteracaoSenha;
    private Boolean flagExclusao;
    private Funcionario funcionario;
    
    public Login(){
        
    }

    /**
     * @return the nroCpf
     */
    public Long getNroCpf() {
        return nroCpf;
    }

    /**
     * @param nroCpf the nroCpf to set
     */
    public void setNroCpf(Long nroCpf) {
        this.nroCpf = nroCpf;
    }

    /**
     * @return the perguntaSecreta
     */
    public PerguntaSecreta getPerguntaSecreta() {
        return perguntaSecreta;
    }

    /**
     * @param perguntaSecreta the perguntaSecreta to set
     */
    public void setPerguntaSecreta(PerguntaSecreta perguntaSecreta) {
        this.perguntaSecreta = perguntaSecreta;
    }

    /**
     * @return the statusLogin
     */
    public StatusLogin getStatusLogin() {
        return statusLogin;
    }

    /**
     * @param statusLogin the statusLogin to set
     */
    public void setStatusLogin(StatusLogin statusLogin) {
        this.statusLogin = statusLogin;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the respostaSecreta
     */
    public String getRespostaSecreta() {
        return respostaSecreta;
    }

    /**
     * @param respostaSecreta the respostaSecreta to set
     */
    public void setRespostaSecreta(String respostaSecreta) {
        this.respostaSecreta = respostaSecreta;
    }

    /**
     * @return the dataUltimoAcesso
     */
    public Date getDataUltimoAcesso() {
        return dataUltimoAcesso;
    }

    /**
     * @param dataUltimoAcesso the dataUltimoAcesso to set
     */
    public void setDataUltimoAcesso(Date dataUltimoAcesso) {
        this.dataUltimoAcesso = dataUltimoAcesso;
    }

    /**
     * @return the qtdTentativasAcesso
     */
    public Integer getQtdTentativasAcesso() {
        return qtdTentativasAcesso;
    }

    /**
     * @param qtdTentativasAcesso the qtdTentativasAcesso to set
     */
    public void setQtdTentativasAcesso(Integer qtdTentativasAcesso) {
        this.qtdTentativasAcesso = qtdTentativasAcesso;
    }

    /**
     * @return the dataUltimaAlteracaoSenha
     */
    public Date getDataUltimaAlteracaoSenha() {
        return dataUltimaAlteracaoSenha;
    }

    /**
     * @param dataUltimaAlteracaoSenha the dataUltimaAlteracaoSenha to set
     */
    public void setDataUltimaAlteracaoSenha(Date dataUltimaAlteracaoSenha) {
        this.dataUltimaAlteracaoSenha = dataUltimaAlteracaoSenha;
    }

    /**
     * @return the flagExclusao
     */
    public Boolean getFlagExclusao() {
        return flagExclusao;
    }

    /**
     * @param flagExclusao the flagExclusao to set
     */
    public void setFlagExclusao(Boolean flagExclusao) {
        this.flagExclusao = flagExclusao;
    }


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}


}
