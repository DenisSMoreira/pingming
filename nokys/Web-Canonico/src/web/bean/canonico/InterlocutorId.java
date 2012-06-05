package web.bean.canonico;

import java.io.Serializable;

/**
 * Classe Bean Interlocutor ID
 * 
 */
public class InterlocutorId implements Serializable {

    /**
     * Atributo do Serial Version 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Atributo codEmpresa Codigo da Empresa
     */
    private Long codEmpresa;
    
    /**
     * Atributo codInterlocutor Codigo do Interlocutor
     */
    private Long codInterlocutor;
    /**
     * @return the codEmpresa
     */
    public Long getCodEmpresa() {
        return codEmpresa;
    }
    /**
     * @param codEmpresa the codEmpresa to set
     */
    public void setCodEmpresa(Long codEmpresa) {
        this.codEmpresa = codEmpresa;
    }
    /**
     * @return the codInterlocutor
     */
    public Long getCodInterlocutor() {
        return codInterlocutor;
    }
    /**
     * @param codInterlocutor the codInterlocutor to set
     */
    public void setCodInterlocutor(Long codInterlocutor) {
        this.codInterlocutor = codInterlocutor;
    }
   

    
}
