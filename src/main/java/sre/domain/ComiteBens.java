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
@Table(schema = "public",name = "comite_bens")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "comite_bens", schema = "public")
public class ComiteBens {

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
    @JoinColumn(name = "comite", referencedColumnName = "id", nullable = false)
    private Comites comite;

	@ManyToOne
    @JoinColumn(name = "responsavel", referencedColumnName = "id", nullable = false)
    private PessoaFisica responsavel;

	@Column(name = "descricao")
    @NotNull
    private String descricao;

	@Column(name = "origem", length = 100)
    @NotNull
    private String origem;

	public Comites getComite() {
        return comite;
    }

	public void setComite(Comites comite) {
        this.comite = comite;
    }

	public PessoaFisica getResponsavel() {
        return responsavel;
    }

	public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }

	public String getDescricao() {
        return descricao;
    }

	public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	public String getOrigem() {
        return origem;
    }

	public void setOrigem(String origem) {
        this.origem = origem;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
