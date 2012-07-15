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
@Table(schema = "public",name = "pessoa_endereco")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "pessoa_endereco", schema = "public")
public class PessoaEndereco {

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

	@ManyToOne
    @JoinColumn(name = "descricao", referencedColumnName = "id", nullable = false)
    private EnderecoDescricao descricao;

	@ManyToOne
    @JoinColumn(name = "pessoa", referencedColumnName = "id", nullable = false)
    private PessoaFisica pessoa;

	@Column(name = "cep", length = 10)
    private String cep;

	@Column(name = "estado", length = 100)
    @NotNull
    private String estado;

	@Column(name = "cidade", length = 100)
    @NotNull
    private String cidade;

	@Column(name = "logradouro")
    @NotNull
    private String logradouro;

	@Column(name = "numero", length = 12)
    private String numero;

	@Column(name = "complemento", length = 50)
    private String complemento;

	@Column(name = "gps_latitude", precision = 17, scale = 17)
    private Double gpsLatitude;

	@Column(name = "gps_longitude", precision = 17, scale = 17)
    private Double gpsLongitude;

	@Column(name = "telefone_local")
    @NotNull
    private String telefoneLocal;

	public EndBairros getBairro() {
        return bairro;
    }

	public void setBairro(EndBairros bairro) {
        this.bairro = bairro;
    }

	public EnderecoDescricao getDescricao() {
        return descricao;
    }

	public void setDescricao(EnderecoDescricao descricao) {
        this.descricao = descricao;
    }

	public PessoaFisica getPessoa() {
        return pessoa;
    }

	public void setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
    }

	public String getCep() {
        return cep;
    }

	public void setCep(String cep) {
        this.cep = cep;
    }

	public String getEstado() {
        return estado;
    }

	public void setEstado(String estado) {
        this.estado = estado;
    }

	public String getCidade() {
        return cidade;
    }

	public void setCidade(String cidade) {
        this.cidade = cidade;
    }

	public String getLogradouro() {
        return logradouro;
    }

	public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

	public String getNumero() {
        return numero;
    }

	public void setNumero(String numero) {
        this.numero = numero;
    }

	public String getComplemento() {
        return complemento;
    }

	public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

	public Double getGpsLatitude() {
        return gpsLatitude;
    }

	public void setGpsLatitude(Double gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

	public Double getGpsLongitude() {
        return gpsLongitude;
    }

	public void setGpsLongitude(Double gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

	public String getTelefoneLocal() {
        return telefoneLocal;
    }

	public void setTelefoneLocal(String telefoneLocal) {
        this.telefoneLocal = telefoneLocal;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
