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
@Table(schema = "public",name = "grupos_acao")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "grupos_acao", schema = "public")
public class GruposAcao {

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

	@OneToMany(mappedBy = "grupo")
    private Set<GrupoAtuacao> grupoAtuacaos;

	@OneToMany(mappedBy = "grupo")
    private Set<SocioPolitico> socioPoliticoes;

	@ManyToOne
    @JoinColumn(name = "pessoa_lider", referencedColumnName = "id", nullable = false)
    private PessoaFisica pessoaLider;

	@Column(name = "descricao", length = 70)
    @NotNull
    private String descricao;

	public Set<GrupoAtuacao> getGrupoAtuacaos() {
        return grupoAtuacaos;
    }

	public void setGrupoAtuacaos(Set<GrupoAtuacao> grupoAtuacaos) {
        this.grupoAtuacaos = grupoAtuacaos;
    }

	public Set<SocioPolitico> getSocioPoliticoes() {
        return socioPoliticoes;
    }

	public void setSocioPoliticoes(Set<SocioPolitico> socioPoliticoes) {
        this.socioPoliticoes = socioPoliticoes;
    }

	public PessoaFisica getPessoaLider() {
        return pessoaLider;
    }

	public void setPessoaLider(PessoaFisica pessoaLider) {
        this.pessoaLider = pessoaLider;
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
