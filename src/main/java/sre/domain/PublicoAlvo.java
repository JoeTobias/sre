package sre.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(schema = "public",name = "publico_alvo")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "publico_alvo", schema = "public")
public class PublicoAlvo {

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

	@OneToMany(mappedBy = "publicoAlvo")
    private Set<Comites> comiteses;

	@OneToMany(mappedBy = "publicoAlvo")
    private Set<Eventos> eventoss;

	@OneToMany(mappedBy = "publicoAlvo")
    private Set<GrupoAtuacao> grupoAtuacaos;

	@Column(name = "descricao", length = 100)
    @NotNull
    private String descricao;

	public Set<Comites> getComiteses() {
        return comiteses;
    }

	public void setComiteses(Set<Comites> comiteses) {
        this.comiteses = comiteses;
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

	public String getDescricao() {
        return descricao;
    }

	public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
