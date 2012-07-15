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
@Table(schema = "public",name = "end_zona")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "end_zona", schema = "public")
public class EndZona {

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

	@OneToMany(mappedBy = "zona")
    private Set<EndBairros> endBairross;

	@Column(name = "zona", length = 100)
    @NotNull
    private String zona;

	public Set<EndBairros> getEndBairross() {
        return endBairross;
    }

	public void setEndBairross(Set<EndBairros> endBairross) {
        this.endBairross = endBairross;
    }

	public String getZona() {
        return zona;
    }

	public void setZona(String zona) {
        this.zona = zona;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
