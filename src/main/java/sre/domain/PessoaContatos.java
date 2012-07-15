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
@Table(schema = "public",name = "pessoa_contatos")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "pessoa_contatos", schema = "public")
public class PessoaContatos {

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
    @JoinColumn(name = "tipo", referencedColumnName = "id", nullable = false)
    private ContatoTipo tipo;

	@ManyToOne
    @JoinColumn(name = "pessoa", referencedColumnName = "id", nullable = false)
    private PessoaFisica pessoa;

	@Column(name = "contato")
    @NotNull
    private String contato;

	public ContatoTipo getTipo() {
        return tipo;
    }

	public void setTipo(ContatoTipo tipo) {
        this.tipo = tipo;
    }

	public PessoaFisica getPessoa() {
        return pessoa;
    }

	public void setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
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
