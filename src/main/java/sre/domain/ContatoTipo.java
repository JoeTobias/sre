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
@Table(schema = "public",name = "contato_tipo")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "contato_tipo", schema = "public")
public class ContatoTipo {

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

	@OneToMany(mappedBy = "tipo")
    private Set<PessoaContatos> pessoaContatoss;

	@Column(name = "descricao", length = 70)
    @NotNull
    private String descricao;

	@Column(name = "telefone")
    @NotNull
    private boolean telefone;

	public Set<PessoaContatos> getPessoaContatoss() {
        return pessoaContatoss;
    }

	public void setPessoaContatoss(Set<PessoaContatos> pessoaContatoss) {
        this.pessoaContatoss = pessoaContatoss;
    }

	public String getDescricao() {
        return descricao;
    }

	public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	public boolean isTelefone() {
        return telefone;
    }

	public void setTelefone(boolean telefone) {
        this.telefone = telefone;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
