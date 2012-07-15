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
@Table(schema = "public",name = "end_logradouros")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "end_logradouros", schema = "public")
public class EndLogradouros {

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

	@OneToMany(mappedBy = "logradouro")
    private Set<Enderecos> enderecoss;

	@ManyToOne
    @JoinColumn(name = "tipo", referencedColumnName = "id", nullable = false)
    private EndLogradouroTipo tipo;

	@Column(name = "logradouro", length = 120)
    @NotNull
    private String logradouro;

	@Column(name = "logradouro_antigo")
    @NotNull
    private Integer logradouroAntigo;

	public Set<Enderecos> getEnderecoss() {
        return enderecoss;
    }

	public void setEnderecoss(Set<Enderecos> enderecoss) {
        this.enderecoss = enderecoss;
    }

	public EndLogradouroTipo getTipo() {
        return tipo;
    }

	public void setTipo(EndLogradouroTipo tipo) {
        this.tipo = tipo;
    }

	public String getLogradouro() {
        return logradouro;
    }

	public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

	public Integer getLogradouroAntigo() {
        return logradouroAntigo;
    }

	public void setLogradouroAntigo(Integer logradouroAntigo) {
        this.logradouroAntigo = logradouroAntigo;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
