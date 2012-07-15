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
@Table(schema = "public",name = "comites")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "comites", schema = "public")
public class Comites {

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

	@OneToMany(mappedBy = "comite")
    private Set<ComiteBens> comiteBenss;

	@ManyToOne
    @JoinColumn(name = "bairro", referencedColumnName = "id", nullable = false)
    private EndBairros bairro;

	@ManyToOne
    @JoinColumn(name = "responsavel", referencedColumnName = "id", nullable = false)
    private PessoaFisica responsavel;

	@ManyToOne
    @JoinColumn(name = "publico_alvo", referencedColumnName = "id", nullable = false)
    private PublicoAlvo publicoAlvo;

	@Column(name = "descricao", length = 100)
    @NotNull
    private String descricao;

	@Column(name = "localizacao")
    @NotNull
    private String localizacao;

	@Column(name = "contato_local")
    @NotNull
    private String contatoLocal;

	public Set<ComiteBens> getComiteBenss() {
        return comiteBenss;
    }

	public void setComiteBenss(Set<ComiteBens> comiteBenss) {
        this.comiteBenss = comiteBenss;
    }

	public EndBairros getBairro() {
        return bairro;
    }

	public void setBairro(EndBairros bairro) {
        this.bairro = bairro;
    }

	public PessoaFisica getResponsavel() {
        return responsavel;
    }

	public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }

	public PublicoAlvo getPublicoAlvo() {
        return publicoAlvo;
    }

	public void setPublicoAlvo(PublicoAlvo publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

	public String getDescricao() {
        return descricao;
    }

	public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	public String getLocalizacao() {
        return localizacao;
    }

	public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

	public String getContatoLocal() {
        return contatoLocal;
    }

	public void setContatoLocal(String contatoLocal) {
        this.contatoLocal = contatoLocal;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
