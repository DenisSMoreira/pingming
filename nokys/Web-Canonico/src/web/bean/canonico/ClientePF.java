package web.bean.canonico;

import java.sql.Date;

/**
 * 
 * Bean Cliente Pessoa Fisica
 * 
 */
public class ClientePF implements java.io.Serializable {

   
    private static final long serialVersionUID = 7934397679086221259L;
    private Cliente cliente;
    private Long codigo;
    private Long numeroCpf;
    private Date dataNascimento;
    private String rg;
    private Long numeroINSS;
    private AtividadeProfissional atividadeProfissional;

    public ClientePF(){
        
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
     * @return the numeroCpf
     */
    public Long getNumeroCpf() {
        return numeroCpf;
    }

    /**
     * @param numeroCpf the numeroCpf to set
     */
    public void setNumeroCpf(Long numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the numeroINSS
     */
    public Long getNumeroINSS() {
        return numeroINSS;
    }

    /**
     * @param numeroINSS the numeroINSS to set
     */
    public void setNumeroINSS(Long numeroINSS) {
        this.numeroINSS = numeroINSS;
    }

    /**
     * @return the atividadeProfissional
     */
    public AtividadeProfissional getAtividadeProfissional() {
        return atividadeProfissional;
    }

    /**
     * @param atividadeProfissional the atividadeProfissional to set
     */
    public void setAtividadeProfissional(AtividadeProfissional atividadeProfissional) {
        this.atividadeProfissional = atividadeProfissional;
    }
    
	
    

}


