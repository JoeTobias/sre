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
@Table(schema = "public",name = "familia")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "familia", schema = "public")
public class Familia {

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
    @JoinColumn(name = "parentesco", referencedColumnName = "id", nullable = false)
    private FamiliaParentesco parentesco;

	@ManyToOne
    @JoinColumn(name = "pessoa", referencedColumnName = "id", nullable = false)
    private PessoaFisica pessoa;

	@ManyToOne
    @JoinColumn(name = "pessoa_parent", referencedColumnName = "id", nullable = false)
    private PessoaFisica pessoaParent;

	@Column(name = "nome", length = 100)
    @NotNull
    private String nome;

	@Column(name = "contato", length = 120)
    private String contato;

	public FamiliaParentesco getParentesco() {
        return parentesco;
    }

	public void setParentesco(FamiliaParentesco parentesco) {
        this.parentesco = parentesco;
    }

	public PessoaFisica getPessoa() {
        return pessoa;
    }

	public void setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
    }

	public PessoaFisica getPessoaParent() {
        return pessoaParent;
    }

	public void setPessoaParent(PessoaFisica pessoaParent) {
        this.pessoaParent = pessoaParent;
    }

	public String getNome() {
        return nome;
    }

	public void setNome(String nome) {
        this.nome = nome;
    }

	public String getContato() {
        return contato;
    }

	public void setContato(String contato) {
        this.contato = contato;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
