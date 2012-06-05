package web.bean.canonico;

import java.util.Date;
import java.util.List;

/**
 * Bean Usuario
 */
public class Usuario implements java.io.Serializable {

    /**
     * serialVersionUID gerado automaticamente.
     */
    private static final long serialVersionUID = -6186905301960203040L;

    /**
     * Codigo do usuario.
     */
    private Integer codigo;

    /**
     * Codigo da empresa.
     */
    private EmpresaWebAdmin empresa;
    /**
     * Cpf do usuario
     */
    private String cpf;
    /**
     * Cargo do usuario
     */
    private CargoWebAdmin cargo;
    /**
     * Nome do usuario
     */
    private String nome;
    /**
     * Sobrenome do usuario.
     */
    private String sobrenome;
    /**
     * DDD do telefone do usuario
     */
    private Integer ddd;
    /**
     * Telefone principal do usuario
     */
    private Long telefonePrincipal;
    /**
     * E-mail do usuario.
     */
    private String email;
    /**
     * Area.
     */
    private String area;
    /**
     * Gestor.
     */
    private String gestor;
    /**
     * DDD do gestor
     */
    private Integer dddGestor;
    /**
     * Telefone do gestor
     */
    private Long telefoneGestor;
    /**
     * Data de criacao do usuario
     */
    private Date dataCriacaoUsuario;
    /**
     * Data de expiracao da conta
     */
    private Date dataExpiracao;
    /**
     * Comentario
     */
    private String comentario;
    /**
     * Terceiro
     */
    private Boolean terceiro;
    /**
     * Conta expirada
     */
    private Boolean contaExpirada;
    /**
     * Bloquear
     */
    private Boolean bloquear;
    /**
     * Senha nunca expira
     */
    private Boolean senhaNuncaExpira;
    /**
     * Troca senha no proximo acesso
     */
    private Boolean trocaSenhaProxAc;
    /**
     * Nao troca a senha
     */
    private Boolean naoTrocaSenha;
    /**
     * Mudar senha
     */
    private Boolean mudarSenha;
    /**
     * Lista de perfis.
     */
    private List<Perfil> listaPerfis;

    /**
     * Metodo para resgatar o valor do codigo do usuario
     * 
     * @return codigo do usuario
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * Metodo para setar o valor do usuario
     * 
     * @param codigo
     *            codigo
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     * Metodo para resgatar o codigo da empresa
     * 
     * @return codigo da empresa
     */
    public EmpresaWebAdmin getEmpresa() {
        return empresa;
    }

    /**
     * Metodo para setar o codigo da epresa
     * 
     * @param empresa
     *            empresa
     */
    public void setEmpresa(EmpresaWebAdmin empresa) {
        this.empresa = empresa;
    }

    /**
     * Metodo para resgatar o CPF do usuario
     * 
     * @return cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Metodo para setar o cpf do usuario
     * 
     * @param cpf
     *            cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Metodo para resgatar o cargo do usuario
     * 
     * @return cargo
     */
    public CargoWebAdmin getCargo() {
        return cargo;
    }

    /**
     * Metodo para setar o cargo do usuario
     * 
     * @param cargo
     *            cargo
     */
    public void setCargo(CargoWebAdmin cargo) {
        this.cargo = cargo;
    }

    /**
     * Metodo para resgatar o nome do usuario
     * 
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo para setar o nome do usuario
     * 
     * @param nome
     *            nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo para resgatar o ddd do usuario
     * 
     * @return ddd
     */
    public Integer getDdd() {
        return ddd;
    }

    /**
     * Metodo para setar o ddd do usuario
     * 
     * @param ddd
     *            ddd
     */
    public void setDdd(Integer ddd) {
        this.ddd = ddd;
    }

    /**
     * Metodo para resgatar o telefone do usuario
     * 
     * @return telefone
     */
    public Long getTelefonePrincipal() {
        return telefonePrincipal;
    }

    /**
     * Metodo para setar o telefone do usuario
     * 
     * @param telefonePrincipal
     *            telefonePrincipal
     */
    public void setTelefonePrincipal(Long telefonePrincipal) {
        this.telefonePrincipal = telefonePrincipal;
    }

    /**
     * Metodo para resgatar o e-mail do usuario
     * 
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodo para setar o email do usuario
     * 
     * @param email
     *            email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metodo para resgatar o area do usuario
     * 
     * @return area area
     */
    public String getArea() {
        return area;
    }

    /**
     * Metodo para setar o area do usuario
     * 
     * @param area
     *            area
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * Metodo para resgatar o nome do gestor
     * 
     * @return nome do gestor
     */
    public String getGestor() {
        return gestor;
    }

    /**
     * Metodo para setar o nome do gestor
     * 
     * @param gestor
     *            gestor
     */
    public void setGestor(String gestor) {
        this.gestor = gestor;
    }

    /**
     * Metodo para resgatar o ddd do gestor
     * 
     * @return ddd do gestor
     */
    public Integer getDddGestor() {
        return dddGestor;
    }

    /**
     * Metodo para setar o ddd do gestor
     * 
     * @param dddGestor
     *            dddGestor
     */
    public void setDddGestor(Integer dddGestor) {
        this.dddGestor = dddGestor;
    }

    /**
     * Metodo para resgatar o telefone do gestor
     * 
     * @return telefone do gestor
     */
    public Long getTelefoneGestor() {
        return telefoneGestor;
    }

    /**
     * Metodo para setar o telefone do usuario
     * 
     * @param telefoneGestor
     *            telefoneGestor
     */
    public void setTelefoneGestor(Long telefoneGestor) {
        this.telefoneGestor = telefoneGestor;
    }

    /**
     * Metodo para resgatar a data de cria�ao do usuario
     * 
     * @return data de cria�ao do usuario
     */
    public Date getDataCriacaoUsuario() {
        return dataCriacaoUsuario;
    }

    /**
     * Metodo para setar a data de cria�ao do usuario
     * 
     * @param dataCriacaoUsuario
     *            dataCriacaoUsuario
     */
    public void setDataCriacaoUsuario(Date dataCriacaoUsuario) {
        this.dataCriacaoUsuario = dataCriacaoUsuario;
    }

    /**
     * Metodo para resgatar o comentario
     * 
     * @return comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Metodo para setar o comentario do usuario
     * 
     * @param comentario
     *            comentario
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Metodo para resgatar se o usuario e terceiro ou nao
     * 
     * @return terceiro
     */
    public Boolean getTerceiro() {
        return terceiro;
    }

    /**
     * Metodo para setar se o usuario e terceiro ou nao
     * 
     * @param terceiro
     *            terceiro
     */
    public void setTerceiro(Boolean terceiro) {
        this.terceiro = terceiro;
    }

    /**
     * Metodo para resgatar a data de expira�ao do usuario.
     * 
     * @return data de expira�ao
     */
    public Date getDataExpiracao() {
        return dataExpiracao;
    }

    /**
     * Metodo para setar se a data de expira�ao do usuario
     * 
     * @param dataExpiracao
     *            dataExpiracao
     */
    public void setDataExpiracao(Date dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    /**
     * Metodo para resgatar se a conta esta expirada
     * 
     * @return conta expirada
     */
    public Boolean getContaExpirada() {
        return contaExpirada;
    }

    /**
     * Metodo para setar se a conta esta expirada
     * 
     * @param contaExpirada
     *            contaExpirada
     */
    public void setContaExpirada(Boolean contaExpirada) {
        this.contaExpirada = contaExpirada;
    }

    /**
     * Metodo para resgatar se o usuario esta bloqueado
     * 
     * @return bloquear
     */
    public Boolean getBloquear() {
        return bloquear;
    }

    /**
     * Metodo para setar se a conta esta bloqueada
     * 
     * @param bloquear
     *            bloquear
     */
    public void setBloquear(Boolean bloquear) {
        this.bloquear = bloquear;
    }

    /**
     * Metodo para resgatar se a senha nunca expira
     * 
     * @return senha nunca expira
     */
    public Boolean getSenhaNuncaExpira() {
        return senhaNuncaExpira;
    }

    /**
     * Metodo para setar se a senha nunca expira
     * 
     * @param senhaNuncaExpira
     *            senhaNuncaExpira
     */
    public void setSenhaNuncaExpira(Boolean senhaNuncaExpira) {
        this.senhaNuncaExpira = senhaNuncaExpira;
    }

    /**
     * Metodo para resgatar se usuario deve trocar a senha no prox acesso
     * 
     * @return troca de senha no proximo acesso
     */
    public Boolean getTrocaSenhaProxAc() {
        return trocaSenhaProxAc;
    }

    /**
     * Metodo para setar se o usuario deve trocar a senha no proximo acesso
     * 
     * @param trocaSenhaProxAc
     *            trocaSenhaProxAc
     */
    public void setTrocaSenhaProxAc(Boolean trocaSenhaProxAc) {
        this.trocaSenhaProxAc = trocaSenhaProxAc;
    }

    /**
     * Metodo para resgatar o usuario nao troca a senha
     * 
     * @return nao troca senha
     */
    public Boolean getNaoTrocaSenha() {
        return naoTrocaSenha;
    }

    /**
     * Metodo para setar se o usuario nao troca a senha
     * 
     * @param naoTrocaSenha
     *            naoTrocaSenha
     */
    public void setNaoTrocaSenha(Boolean naoTrocaSenha) {
        this.naoTrocaSenha = naoTrocaSenha;
    }

    /**
     * Metodo para resgatar o pode mudar a senha
     * 
     * @return mudar senha
     */
    public Boolean getMudarSenha() {
        return mudarSenha;
    }

    /**
     * Metodo para setar se o muda a senha
     * 
     * @param mudarSenha
     *            mudarSenha
     */
    public void setMudarSenha(Boolean mudarSenha) {
        this.mudarSenha = mudarSenha;
    }

    /**
     * Metodo para setar o sobrenome do usuario
     * 
     * @param sobrenome
     *            sobrenome
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * Metodo para resgatar o sobrenome do usuario
     * 
     * @return nao troca senha
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Metodo para setar a lista de perfis que o usuario esta associado
     * 
     * @param listaPerfis
     *            listaPerfis
     */
    public void setListaPerfis(List<Perfil> listaPerfis) {
        this.listaPerfis = listaPerfis;
    }

    /**
     * Metodo para resgatar a lista de perfis que o usuario esta associado
     * 
     * @return lista de perfis
     */
    public List<Perfil> getListaPerfis() {
        return listaPerfis;
    }
}
