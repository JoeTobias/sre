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
@Table(schema = "public",name = "eventos")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "eventos", schema = "public")
public class Eventos {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
	
	@Version
    @Column(name = "version")
    private Integer version;

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
    @JoinColumn(name = "publico_alvo", referencedColumnName = "id", nullable = false)
    private PublicoAlvo publicoAlvo;

	@Column(name = "descricao", length = 100)
    @NotNull
    private String descricao;

	@Column(name = "data_agenda")
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    private Date dataAgenda;

	@Column(name = "horario_agenda", length = 9)
    @NotNull
    private String horarioAgenda;

	@Column(name = "satisfacao")
    @NotNull
    private Integer satisfacao;

	@Column(name = "realizado")
    @NotNull
    private boolean realizado;

	@Column(name = "pessoas_estimativa")
    @NotNull
    private Integer pessoasEstimativa;

	@Column(name = "pessoas_presentes")
    @NotNull
    private Integer pessoasPresentes;

	@Column(name = "gps_latitude", precision = 17, scale = 17)
    private Double gpsLatitude;

	@Column(name = "gps_longitude", precision = 17, scale = 17)
    private Double gpsLongitude;

	public EndBairros getBairro() {
        return bairro;
    }

	public void setBairro(EndBairros bairro) {
        this.bairro = bairro;
    }

	public PublicoAlvo getPublicoAlvo() {
        return publicoAlvo;
    }

	public void setPublicoAlvo(PublicoAlvo publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

	public String getDescricao() {
        return descricao;
    }

	public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	public Date getDataAgenda() {
        return dataAgenda;
    }

	public void setDataAgenda(Date dataAgenda) {
        this.dataAgenda = dataAgenda;
    }

	public String getHorarioAgenda() {
        return horarioAgenda;
    }

	public void setHorarioAgenda(String horarioAgenda) {
        this.horarioAgenda = horarioAgenda;
    }

	public Integer getSatisfacao() {
        return satisfacao;
    }

	public void setSatisfacao(Integer satisfacao) {
        this.satisfacao = satisfacao;
    }

	public boolean isRealizado() {
        return realizado;
    }

	public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }

	public Integer getPessoasEstimativa() {
        return pessoasEstimativa;
    }

	public void setPessoasEstimativa(Integer pessoasEstimativa) {
        this.pessoasEstimativa = pessoasEstimativa;
    }

	public Integer getPessoasPresentes() {
        return pessoasPresentes;
    }

	public void setPessoasPresentes(Integer pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

	public Double getGpsLatitude() {
        return gpsLatitude;
    }

	public void setGpsLatitude(Double gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

	public Double getGpsLongitude() {
        return gpsLongitude;
    }

	public void setGpsLongitude(Double gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
