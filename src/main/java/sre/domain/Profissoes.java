package sre.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(schema = "public",name = "profissoes")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "profissoes", schema = "public")
public class Profissoes {

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

	@OneToMany(mappedBy = "profissao")
    private Set<SocioPolitico> socioPoliticoes;

	@Column(name = "descricao", length = 70)
    @NotNull
    private String descricao;

	@Column(name = "comemorar")
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    private Date comemorar;

	public Set<SocioPolitico> getSocioPoliticoes() {
        return socioPoliticoes;
    }

	public void setSocioPoliticoes(Set<SocioPolitico> socioPoliticoes) {
        this.socioPoliticoes = socioPoliticoes;
    }

	public String getDescricao() {
        return descricao;
    }

	public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	public Date getComemorar() {
        return comemorar;
    }

	public void setComemorar(Date comemorar) {
        this.comemorar = comemorar;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
