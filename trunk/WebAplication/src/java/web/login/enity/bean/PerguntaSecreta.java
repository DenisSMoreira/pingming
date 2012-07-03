package web.login.enity.bean;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 * Classe BEAN Pergunta Secreta
 *
 */
@Entity
public class PerguntaSecreta implements Serializable {

    /**
     * Numero Serial
     */
    @Id
    private Integer codPerguntaSecreta;
    private String pergunta;
    private Date dtExclusao;

    public PerguntaSecreta() {
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
