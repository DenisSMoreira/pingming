package web.bean.canonico;

/**
 * 
 * Bean Cliente Pessoa Juridica
 * 
 */
public class ClientePJ implements java.io.Serializable {

    /**
     * Atributo = Serial Version
     */
    private static final long serialVersionUID = 3046777420349197217L;

    /**
     * Cliente
     */
    private Cliente cliente;
    
    /**
     * Atributo = Empresa
     */

    private TipoEmpresa tipoEmpresa;

    /**
     * Atributo = Codigo da Empresa
     */

    private Long codEmpresa;
    
    /**
     * Ramo Atividade
     */
    private RamoAtividade ramoAtividade;
    /**
     * Atributo = Divis�o Ramo Atividade
     */
    private DivisaoRamoAtividade divisaoRamoAtividade;

    /**
     * Atributo = Numero Raiz Cnpj
     */

    private Long nroRaizCnpj;

    /**
     * Atributo = Nome Fantasia
     */

    private String nomeFantasia;

    /**
     * Atributo = Inscricao Pat
     */

    private Long inscricaoPat;

    /**
     * Atributo = Inscricao Estadual
     */

    private String inscricaoEstadual;

    /**
     * Atributo = Inscricao Municipal
     */

    private String inscricaoMunicipal;

    /**
     * @return the empresa
     */

    /**
     * @return the codEmpresa
     */
    public Long getCodEmpresa() {
        return codEmpresa;
    }

    /**
     * @return the empresa
     */
    public TipoEmpresa getTipoEmpresa() {
        return tipoEmpresa;
    }

    /**
     * @param empresa
     *            the empresa to set
     */
    public void setTipoEmpresa(TipoEmpresa empresa) {
        this.tipoEmpresa = empresa;
    }

    /**
     * @param codEmpresa
     *            the codEmpresa to set
     */
    public void setCodEmpresa(Long codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    /**
     * @return the nroRaizCnpj
     */
    public Long getNroRaizCnpj() {
        return nroRaizCnpj;
    }

    /**
     * @param nroRaizCnpj
     *            the nroRaizCnpj to set
     */
    public void setNroRaizCnpj(Long nroRaizCnpj) {
        this.nroRaizCnpj = nroRaizCnpj;
    }

    /**
     * @return the nomeFantasia
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * @param nomeFantasia
     *            the nomeFantasia to set
     */
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    /**
     * @return the inscricaoPat
     */
    public Long getInscricaoPat() {
        return inscricaoPat;
    }

    /**
     * @param inscricaoPat
     *            the inscricaoPat to set
     */
    public void setInscricaoPat(Long inscricaoPat) {
        this.inscricaoPat = inscricaoPat;
    }

    /**
     * @return the inscricaoEstadual
     */
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    /**
     * @param inscricaoEstadual
     *            the inscricaoEstadual to set
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
     * @param inscricaoMunicipal
     *            the inscricaoMunicipal to set
     */
    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    /**
     * @return the ramoAtividade
     */
    public RamoAtividade getRamoAtividade() {
        return ramoAtividade;
    }

    /**
     * @param ramoAtividade
     *            the ramoAtividade to set
     */
    public void setRamoAtividade(RamoAtividade ramoAtividade) {
        this.ramoAtividade = ramoAtividade;
    }

    
    /**
     * @return the divisaoRamoAtividade
     */
    public DivisaoRamoAtividade getDivisaoRamoAtividade() {
        return divisaoRamoAtividade;
    }

    /**
     * @param divisaoRamoAtividade the divisaoRamoAtividade to set
     */
    public void setDivisaoRamoAtividade(DivisaoRamoAtividade divisaoRamoAtividade) {
        this.divisaoRamoAtividade = divisaoRamoAtividade;
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
    
    

}
