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
@Table(schema = "public",name = "usuarios")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "usuarios", schema = "public")
public class Usuarios {

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
    @JoinColumn(name = "perfil", referencedColumnName = "id", nullable = false)
    private Perfis perfil;

	@ManyToOne
    @JoinColumn(name = "pessoa", referencedColumnName = "id", nullable = false)
    private PessoaFisica pessoa;

	@Column(name = "usuario", length = 24)
    @NotNull
    private String usuario;

	@Column(name = "senha", length = 32)
    @NotNull
    private String senha;

	@Column(name = "ativo")
    @NotNull
    private boolean ativo;

	public Perfis getPerfil() {
        return perfil;
    }

	public void setPerfil(Perfis perfil) {
        this.perfil = perfil;
    }

	public PessoaFisica getPessoa() {
        return pessoa;
    }

	public void setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
    }

	public String getUsuario() {
        return usuario;
    }

	public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

	public String getSenha() {
        return senha;
    }

	public void setSenha(String senha) {
        this.senha = senha;
    }

	public boolean isAtivo() {
        return ativo;
    }

	public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
