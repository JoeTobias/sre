package sre.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@Configurable
@Entity
@Table(schema = "public",name = "enderecos")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "enderecos", schema = "public")
public class Enderecos {

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
    @JoinColumn(name = "logradouro", referencedColumnName = "id", nullable = false)
    private EndLogradouros logradouro;

	@Column(name = "cep", length = 10)
    private String cep;

	public EndBairros getBairro() {
        return bairro;
    }

	public void setBairro(EndBairros bairro) {
        this.bairro = bairro;
    }

	public EndLogradouros getLogradouro() {
        return logradouro;
    }

	public void setLogradouro(EndLogradouros logradouro) {
        this.logradouro = logradouro;
    }

	public String getCep() {
        return cep;
    }

	public void setCep(String cep) {
        this.cep = cep;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
