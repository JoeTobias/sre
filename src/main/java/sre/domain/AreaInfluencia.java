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
@Table(schema = "public",name = "area_influencia")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "area_influencia", schema = "public")
//@RooDbManaged(automaticallyDelete = true)
public class AreaInfluencia {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
	
	@Version
    @Column(name = "version")
    private Integer version;

	@OneToMany(mappedBy = "area")
    private Set<PessoaInfluencia> pessoaInfluencias;

	@Column(name = "descricao", length = 100)
    @NotNull
    private String descricao;

	@Column(name = "importancia")
    @NotNull
    private Integer importancia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<PessoaInfluencia> getPessoaInfluencias() {
        return pessoaInfluencias;
    }

	public void setPessoaInfluencias(Set<PessoaInfluencia> pessoaInfluencias) {
        this.pessoaInfluencias = pessoaInfluencias;
    }

	public String getDescricao() {
        return descricao;
    }

	public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	public Integer getImportancia() {
        return importancia;
    }

	public void setImportancia(Integer importancia) {
        this.importancia = importancia;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
