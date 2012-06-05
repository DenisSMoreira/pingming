package web.bean.canonico;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;

import javax.swing.text.MaskFormatter;

/**
 * 
 * Bean Filial
 *
 */
public class Filial implements java.io.Serializable {

    /**
	 * serialVersionUID gerada
	 */
    private static final long serialVersionUID = -754335444841394169L;
	/**
     * O Codigo da filial
     */
    private Long codigo;
    /**
     * O cliente relacionado a filial
     */
    private Cliente cliente;
    /**
     * O endereco da filial
     */
    private Endereco endereco;
    /**
     * Nome da filial
     */
    private String nome;
    /**
     * N�mero do documento
     */
    private BigDecimal documento;
    /**
     * Inscricao Estadual
     */
    private String inscricaoEstadual;
    /**
     * Inscricao Municipal
     */
    private String inscricaoMunicipal;
    /**
     * N�mero de telefone principal
     */
    private Long telefonePrincipal;
    /**
     * N�mero de telefone opcional
     */
    private Long telefoneOpcional;
    /**
     * N�mero do fax
     */
    private Long fax;
    /**
     * DDD do telefone principal
     */
    private Integer dddPrincipal;
    /**
     * Quantidade de funcion�rios da filial
     */
    private Short quantidadeFuncionarios;
    /**
     * Ramal do telefone principal
     */
    private Integer ramalPrincipal;
    /**
     * Ramal do telefone Opcional
     */
    private Integer ramalOpcional;
    /**
     * Ramal do fax
     */
    private Integer ramalFax;
    /**
     * C�digo do tipo de filial
     */
    private Character tipoFilial;
    /**
     * Email
     */
    private String email;
    /**
     * Sincronizacao
     */
    private Boolean sincronizacao;
    /**
     * Beneficio
     */
    private Boolean beneficio;
    /**
     * Data da criacao
     */
    private Date dataCriacao;
    /**
     * Data da atualizacao
     */
    private Date dataAtualizacao;
    /**
     * DDD do telefone opcional
     */
    private Integer dddOpcional;
    /**
     * DDD do fax
     */
    private Integer dddFax;
    /**
     * @return the codigo
     */
    public Long getCodigo() {
        return codigo;
    }
    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }
    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @return the documento
     */
    public BigDecimal getDocumento() {
        return documento;
    }
    /**
     * @param documento the documento to set
     */
    public void setDocumento(BigDecimal documento) {
        this.documento = documento;
    }
    /**
     * @return the inscricaoEstadual
     */
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    /**
     * @param inscricaoEstadual the inscricaoEstadual to set
     */
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    /**
     * @return the inscricaoMunicipal
     */
    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }
    /**
     * @param inscricaoMunicipal the inscricaoMunicipal to set
     */
    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }
    /**
     * @return the telefonePrincipal
     */
    public Long getTelefonePrincipal() {
        return telefonePrincipal;
    }
    /**
     * @param telefonePrincipal the telefonePrincipal to set
     */
    public void setTelefonePrincipal(Long telefonePrincipal) {
        this.telefonePrincipal = telefonePrincipal;
    }
    /**
     * @return the telefoneOpcional
     */
    public Long getTelefoneOpcional() {
        return telefoneOpcional;
    }
    /**
     * @param telefoneOpcional the telefoneOpcional to set
     */
    public void setTelefoneOpcional(Long telefoneOpcional) {
        this.telefoneOpcional = telefoneOpcional;
    }
    /**
     * @return the fax
     */
    public Long getFax() {
        return fax;
    }
    /**
     * @param fax the fax to set
     */
    public void setFax(Long fax) {
        this.fax = fax;
    }
    /**
     * @return the dddPrincipal
     */
    public Integer getDddPrincipal() {
        return dddPrincipal;
    }
    /**
     * @param dddPrincipal the dddPrincipal to set
     */
    public void setDddPrincipal(Integer dddPrincipal) {
        this.dddPrincipal = dddPrincipal;
    }
    /**
     * @return the quantidadeFuncionarios
     */
    public Short getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    /**
     * @param quantidadeFuncionarios the quantidadeFuncionarios to set
     */
    public void setQuantidadeFuncionarios(Short quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    /**
     * @return the ramalPrincipal
     */
    public Integer getRamalPrincipal() {
        return ramalPrincipal;
    }
    /**
     * @param ramalPrincipal the ramalPrincipal to set
     */
    public void setRamalPrincipal(Integer ramalPrincipal) {
        this.ramalPrincipal = ramalPrincipal;
    }
    /**
     * @return the ramalOpcional
     */
    public Integer getRamalOpcional() {
        return ramalOpcional;
    }
    /**
     * @param ramalOpcional the ramalOpcional to set
     */
    public void setRamalOpcional(Integer ramalOpcional) {
        this.ramalOpcional = ramalOpcional;
    }
    /**
     * @return the ramalFax
     */
    public Integer getRamalFax() {
        return ramalFax;
    }
    /**
     * @param ramalFax the ramalFax to set
     */
    public void setRamalFax(Integer ramalFax) {
        this.ramalFax = ramalFax;
    }
    /**
     * @return the tipoFilial
     */
    public Character getTipoFilial() {
        return tipoFilial;
    }
    /**
     * @param tipoFilial the tipoFilial to set
     */
    public void setTipoFilial(Character tipoFilial) {
        this.tipoFilial = tipoFilial;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * @return the sincronizacao
     */
    public Boolean getSincronizacao() {
        return sincronizacao;
    }
    /**
     * @param sincronizacao the sincronizacao to set
     */
    public void setSincronizacao(Boolean sincronizacao) {
        this.sincronizacao = sincronizacao;
    }
    /**
     * @return the beneficio
     */
    public Boolean getBeneficio() {
        return beneficio;
    }
    /**
     * @param beneficio the beneficio to set
     */
    public void setBeneficio(Boolean beneficio) {
        this.beneficio = beneficio;
    }
    /**
     * @return the dataCriacao
     */
    public Date getDataCriacao() {
        return dataCriacao;
    }
    /**
     * @param dataCriacao the dataCriacao to set
     */
    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    /**
     * @return the dataAtualizacao
     */
    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }
    /**
     * @param dataAtualizacao the dataAtualizacao to set
     */
    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
    /**
     * @return the dddOpcional
     */
    public Integer getDddOpcional() {
        return dddOpcional;
    }
    /**
     * @param dddOpcional the dddOpcional to set
     */
    public void setDddOpcional(Integer dddOpcional) {
        this.dddOpcional = dddOpcional;
    }
    /**
     * @return the dddFax
     */
    public Integer getDddFax() {
        return dddFax;
    }
    /**
     * @param dddFax the dddFax to set
     */
    public void setDddFax(Integer dddFax) {
        this.dddFax = dddFax;
    }


   public String getDocumentoFormatado() {
   	MaskFormatter mf;
		try {
			mf = new MaskFormatter("##.###.###/####-##");
		    mf.setValueContainsLiteralCharacters(false);   	  
			return mf.valueToString(documento);
		} catch (ParseException e) {
			return String.valueOf(documento);
		}   
   }
    

  

    

}
