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
@Table(schema = "public",name = "end_bairros")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "end_bairros", schema = "public")
public class EndBairros {

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

	@OneToMany(mappedBy = "bairro")
    private Set<Comites> comiteses;

	@OneToMany(mappedBy = "bairro")
    private Set<Enderecos> enderecoss;

	@OneToMany(mappedBy = "bairro")
    private Set<Eventos> eventoss;

	@OneToMany(mappedBy = "bairro")
    private Set<GrupoAtuacao> grupoAtuacaos;

	@OneToMany(mappedBy = "bairro")
    private Set<PessoaEndereco> pessoaEnderecoes;

	@OneToMany(mappedBy = "bairroVoto")
    private Set<SocioPolitico> socioPoliticoes;

	@OneToMany(mappedBy = "bairro")
    private Set<ZonasSecoes> zonasSecoeses;

	@ManyToOne
    @JoinColumn(name = "municipio", referencedColumnName = "id", nullable = false)
    private EndMunicipios municipio;

	@ManyToOne
    @JoinColumn(name = "zona", referencedColumnName = "id", nullable = false)
    private EndZona zona;

	@Column(name = "bairro", length = 100)
    @NotNull
    private String bairro;

	public Set<Comites> getComiteses() {
        return comiteses;
    }

	public void setComiteses(Set<Comites> comiteses) {
        this.comiteses = comiteses;
    }

	public Set<Enderecos> getEnderecoss() {
        return enderecoss;
    }

	public void setEnderecoss(Set<Enderecos> enderecoss) {
        this.enderecoss = enderecoss;
    }

	public Set<Eventos> getEventoss() {
        return eventoss;
    }

	public void setEventoss(Set<Eventos> eventoss) {
        this.eventoss = eventoss;
    }

	public Set<GrupoAtuacao> getGrupoAtuacaos() {
        return grupoAtuacaos;
    }

	public void setGrupoAtuacaos(Set<GrupoAtuacao> grupoAtuacaos) {
        this.grupoAtuacaos = grupoAtuacaos;
    }

	public Set<PessoaEndereco> getPessoaEnderecoes() {
        return pessoaEnderecoes;
    }

	public void setPessoaEnderecoes(Set<PessoaEndereco> pessoaEnderecoes) {
        this.pessoaEnderecoes = pessoaEnderecoes;
    }

	public Set<SocioPolitico> getSocioPoliticoes() {
        return socioPoliticoes;
    }

	public void setSocioPoliticoes(Set<SocioPolitico> socioPoliticoes) {
        this.socioPoliticoes = socioPoliticoes;
    }

	public Set<ZonasSecoes> getZonasSecoeses() {
        return zonasSecoeses;
    }

	public void setZonasSecoeses(Set<ZonasSecoes> zonasSecoeses) {
        this.zonasSecoeses = zonasSecoeses;
    }

	public EndMunicipios getMunicipio() {
        return municipio;
    }

	public void setMunicipio(EndMunicipios municipio) {
        this.municipio = municipio;
    }

	public EndZona getZona() {
        return zona;
    }

	public void setZona(EndZona zona) {
        this.zona = zona;
    }

	public String getBairro() {
        return bairro;
    }

	public void setBairro(String bairro) {
        this.bairro = bairro;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
