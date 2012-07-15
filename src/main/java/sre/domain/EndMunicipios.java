package sre.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@Configurable
@Entity
@Table(schema = "public",name = "end_municipios")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "end_municipios", schema = "public")
public class EndMunicipios {

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

	@OneToMany(mappedBy = "municipio")
    private Set<EndBairros> endBairross;

	@OneToMany(mappedBy = "naturalde")
    private Set<PessoaFisica> pessoaFisicas;

	@OneToMany(mappedBy = "municipioVoto")
    private Set<SocioPolitico> socioPoliticoes;

	@ManyToOne
    @JoinColumn(name = "estado", referencedColumnName = "id", nullable = false)
    private EndEstados estado;

	@Column(name = "municipio", length = 100)
    @NotNull
    private String municipio;

	@Column(name = "ibge", length = 12)
    private String ibge;

	public Set<EndBairros> getEndBairross() {
        return endBairross;
    }

	public void setEndBairross(Set<EndBairros> endBairross) {
        this.endBairross = endBairross;
    }

	public Set<PessoaFisica> getPessoaFisicas() {
        return pessoaFisicas;
    }

	public void setPessoaFisicas(Set<PessoaFisica> pessoaFisicas) {
        this.pessoaFisicas = pessoaFisicas;
    }

	public Set<SocioPolitico> getSocioPoliticoes() {
        return socioPoliticoes;
    }

	public void setSocioPoliticoes(Set<SocioPolitico> socioPoliticoes) {
        this.socioPoliticoes = socioPoliticoes;
    }

	public EndEstados getEstado() {
        return estado;
    }

	public void setEstado(EndEstados estado) {
        this.estado = estado;
    }

	public String getMunicipio() {
        return municipio;
    }

	public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

	public String getIbge() {
        return ibge;
    }

	public void setIbge(String ibge) {
        this.ibge = ibge;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
