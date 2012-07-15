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
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@Configurable
@Entity
@Table(schema = "public",name = "zonas_secoes")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "zonas_secoes", schema = "public")
public class ZonasSecoes {

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

	@Column(name = "zona", length = 10)
    @NotNull
    private String zona;

	@Column(name = "secao", length = 10)
    @NotNull
    private String secao;

	@Column(name = "complemento", length = 70)
    @NotNull
    private String complemento;

	public EndBairros getBairro() {
        return bairro;
    }

	public void setBairro(EndBairros bairro) {
        this.bairro = bairro;
    }

	public String getZona() {
        return zona;
    }

	public void setZona(String zona) {
        this.zona = zona;
    }

	public String getSecao() {
        return secao;
    }

	public void setSecao(String secao) {
        this.secao = secao;
    }

	public String getComplemento() {
        return complemento;
    }

	public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
