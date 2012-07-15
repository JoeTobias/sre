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
@Table(schema = "public",name = "end_paises")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "end_paises", schema = "public")
public class EndPaises {

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

	@OneToMany(mappedBy = "pais")
    private Set<EndEstados> endEstadoss;

	@Column(name = "pais", length = 100)
    @NotNull
    private String pais;

	@Column(name = "sigla", length = 3)
    @NotNull
    private String sigla;

	public Set<EndEstados> getEndEstadoss() {
        return endEstadoss;
    }

	public void setEndEstadoss(Set<EndEstados> endEstadoss) {
        this.endEstadoss = endEstadoss;
    }

	public String getPais() {
        return pais;
    }

	public void setPais(String pais) {
        this.pais = pais;
    }

	public String getSigla() {
        return sigla;
    }

	public void setSigla(String sigla) {
        this.sigla = sigla;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
