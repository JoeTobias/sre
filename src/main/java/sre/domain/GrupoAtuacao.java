package sre.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@Configurable
@Entity
@Table(schema = "public",name = "grupo_atuacao")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "grupo_atuacao", schema = "public")
public class GrupoAtuacao {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

	@Version
    @Column(name = "version")
    private Integer version;
	
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Long getId() {
        return this.id;
    }

	public void setId(Long id) {
        this.id = id;
    }

	@ManyToOne
    @JoinColumn(name = "bairro", referencedColumnName = "id", nullable = false)
    private EndBairros bairro;

	@ManyToOne
    @JoinColumn(name = "status", referencedColumnName = "id", nullable = false)
    private GrupoAtuacaoStatus status;

	@ManyToOne
    @JoinColumn(name = "dificuldade", referencedColumnName = "id", nullable = false)
    private GrupoDificuldades dificuldade;

	@ManyToOne
    @JoinColumn(name = "objetivo", referencedColumnName = "id", nullable = false)
    private GrupoObjetivo objetivo;

	@ManyToOne
    @JoinColumn(name = "grupo", referencedColumnName = "id", nullable = false)
    private GruposAcao grupo;

	@ManyToOne
    @JoinColumn(name = "publico_alvo", referencedColumnName = "id", nullable = false)
    private PublicoAlvo publicoAlvo;

	@Column(name = "adesivos")
    @NotNull
    private Integer adesivos;

	@Column(name = "panfletos")
    @NotNull
    private Integer panfletos;

	@Column(name = "periodo_inicio")
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    private Date periodoInicio;

	@Column(name = "periodo_fim")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    private Date periodoFim;

	@Column(name = "obs")
    @NotNull
    private String obs;

	@Column(name = "participacao_candidato")
    @NotNull
    private boolean participacaoCandidato;

	public EndBairros getBairro() {
        return bairro;
    }

	public void setBairro(EndBairros bairro) {
        this.bairro = bairro;
    }

	public GrupoAtuacaoStatus getStatus() {
        return status;
    }

	public void setStatus(GrupoAtuacaoStatus status) {
        this.status = status;
    }

	public GrupoDificuldades getDificuldade() {
        return dificuldade;
    }

	public void setDificuldade(GrupoDificuldades dificuldade) {
        this.dificuldade = dificuldade;
    }

	public GrupoObjetivo getObjetivo() {
        return objetivo;
    }

	public void setObjetivo(GrupoObjetivo objetivo) {
        this.objetivo = objetivo;
    }

	public GruposAcao getGrupo() {
        return grupo;
    }

	public void setGrupo(GruposAcao grupo) {
        this.grupo = grupo;
    }

	public PublicoAlvo getPublicoAlvo() {
        return publicoAlvo;
    }

	public void setPublicoAlvo(PublicoAlvo publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

	public Integer getAdesivos() {
        return adesivos;
    }

	public void setAdesivos(Integer adesivos) {
        this.adesivos = adesivos;
    }

	public Integer getPanfletos() {
        return panfletos;
    }

	public void setPanfletos(Integer panfletos) {
        this.panfletos = panfletos;
    }

	public Date getPeriodoInicio() {
        return periodoInicio;
    }

	public void setPeriodoInicio(Date periodoInicio) {
        this.periodoInicio = periodoInicio;
    }

	public Date getPeriodoFim() {
        return periodoFim;
    }

	public void setPeriodoFim(Date periodoFim) {
        this.periodoFim = periodoFim;
    }

	public String getObs() {
        return obs;
    }

	public void setObs(String obs) {
        this.obs = obs;
    }

	public boolean isParticipacaoCandidato() {
        return participacaoCandidato;
    }

	public void setParticipacaoCandidato(boolean participacaoCandidato) {
        this.participacaoCandidato = participacaoCandidato;
    }
}
