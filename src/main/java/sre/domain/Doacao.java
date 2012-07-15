package sre.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@Configurable
@Entity
@Table(schema = "public",name = "doacao")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "doacao", schema = "public")
public class Doacao {

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
    private DoacaoTipo tipo;

	@ManyToOne
    @JoinColumn(name = "pessoa", referencedColumnName = "id", nullable = false)
    private PessoaFisica pessoa;

	@Column(name = "data")
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    private Date data;

	@Column(name = "qtd")
    @NotNull
    private Integer qtd;

	@Column(name = "valor", precision = 9, scale = 2)
    @NotNull
    private BigDecimal valor;

	@Column(name = "obs")
    @NotNull
    private String obs;

	public DoacaoTipo getTipo() {
        return tipo;
    }

	public void setTipo(DoacaoTipo tipo) {
        this.tipo = tipo;
    }

	public PessoaFisica getPessoa() {
        return pessoa;
    }

	public void setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
    }

	public Date getData() {
        return data;
    }

	public void setData(Date data) {
        this.data = data;
    }

	public Integer getQtd() {
        return qtd;
    }

	public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

	public BigDecimal getValor() {
        return valor;
    }

	public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

	public String getObs() {
        return obs;
    }

	public void setObs(String obs) {
        this.obs = obs;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
