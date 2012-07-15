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
@Table(schema = "public",name = "end_estados")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "end_estados", schema = "public")
public class EndEstados {

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

	@OneToMany(mappedBy = "estado")
    private Set<EndMunicipios> endMunicipioss;

	@ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id", nullable = false)
    private EndPaises pais;

	@Column(name = "uf", length = 2)
    @NotNull
    private String uf;

	@Column(name = "estado", length = 100)
    @NotNull
    private String estado;

	public Set<EndMunicipios> getEndMunicipioss() {
        return endMunicipioss;
    }

	public void setEndMunicipioss(Set<EndMunicipios> endMunicipioss) {
        this.endMunicipioss = endMunicipioss;
    }

	public EndPaises getPais() {
        return pais;
    }

	public void setPais(EndPaises pais) {
        this.pais = pais;
    }

	public String getUf() {
        return uf;
    }

	public void setUf(String uf) {
        this.uf = uf;
    }

	public String getEstado() {
        return estado;
    }

	public void setEstado(String estado) {
        this.estado = estado;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
