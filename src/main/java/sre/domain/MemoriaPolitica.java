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
@Table(schema = "public",name = "memoria_politica")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "memoria_politica", schema = "public")
public class MemoriaPolitica {

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
    @JoinColumn(name = "situacao", referencedColumnName = "id", nullable = false)
    private MemoriaSituacao situacao;

	@ManyToOne
    @JoinColumn(name = "pessoa", referencedColumnName = "id", nullable = false)
    private PessoaFisica pessoa;

	@Column(name = "data")
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    private Date data;

	@Column(name = "local", length = 70)
    @NotNull
    private String local;

	@Column(name = "assunto")
    @NotNull
    private String assunto;

	@Column(name = "obs")
    private String obs;

	@Column(name = "atendente", length = 70)
    @NotNull
    private String atendente;

	@Column(name = "usuario")
    @NotNull
    private Integer usuario;

	@Column(name = "horario")
    @NotNull
    private String horario;

	public MemoriaSituacao getSituacao() {
        return situacao;
    }

	public void setSituacao(MemoriaSituacao situacao) {
        this.situacao = situacao;
    }

	public PessoaFisica getPessoa() {
        return pessoa;
    }

	public void setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
    }

	public Date getData() {
        return data;
    }

	public void setData(Date data) {
        this.data = data;
    }

	public String getLocal() {
        return local;
    }

	public void setLocal(String local) {
        this.local = local;
    }

	public String getAssunto() {
        return assunto;
    }

	public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

	public String getObs() {
        return obs;
    }

	public void setObs(String obs) {
        this.obs = obs;
    }

	public String getAtendente() {
        return atendente;
    }

	public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

	public Integer getUsuario() {
        return usuario;
    }

	public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

	public String getHorario() {
        return horario;
    }

	public void setHorario(String horario) {
        this.horario = horario;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
