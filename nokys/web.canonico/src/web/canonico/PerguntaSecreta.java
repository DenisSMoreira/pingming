package web.canonico;

import java.io.Serializable;
import java.sql.Date;


/**
 * 
 * Classe BEAN Pergunta Secreta
 *
 */
public class PerguntaSecreta implements Serializable {

    /**
	 * Numero Serial
	 */
    private static final long serialVersionUID = 5379424373753525014L;
    private Integer codPerguntaSecreta;
    private String pergunta;
    private Date dtExclusao;
    
    public PerguntaSecreta(){
        
    }

    /**
     * @return the codPerguntaSecreta
     */
    public Integer getCodPerguntaSecreta() {
        return codPerguntaSecreta;
    }

    /**
     * @param codPerguntaSecreta the codPerguntaSecreta to set
     */
    public void setCodPerguntaSecreta(Integer codPerguntaSecreta) {
        this.codPerguntaSecreta = codPerguntaSecreta;
    }

    /**
     * @return the pergunta
     */
    public String getPergunta() {
        return pergunta;
    }

    /**
     * @param pergunta the pergunta to set
     */
    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    /**
     * @return the dtExclusao
     */
    public Date getDtExclusao() {
        return dtExclusao;
    }

    /**
     * @param dtExclusao the dtExclusao to set
     */
    public void setDtExclusao(Date dtExclusao) {
        this.dtExclusao = dtExclusao;
    }

  

}
