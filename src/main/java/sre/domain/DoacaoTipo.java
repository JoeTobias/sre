package sre.domain;

import java.math.BigDecimal;
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
@Table(schema = "public",name = "doacao_tipo")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "doacao_tipo", schema = "public")
public class DoacaoTipo {

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
    private Set<Doacao> doacaos;

	@Column(name = "descricao")
    @NotNull
    private String descricao;

	@Column(name = "valor", precision = 9, scale = 2)
    @NotNull
    private BigDecimal valor;

	@Column(name = "valor_min", precision = 9, scale = 2)
    @NotNull
    private BigDecimal valorMin;

	@Column(name = "valor_max", precision = 9, scale = 2)
    @NotNull
    private BigDecimal valorMax;

	@Column(name = "beneficio_coletivo")
    @NotNull
    private boolean beneficioColetivo;

	public Set<Doacao> getDoacaos() {
        return doacaos;
    }

	public void setDoacaos(Set<Doacao> doacaos) {
        this.doacaos = doacaos;
    }

	public String getDescricao() {
        return descricao;
    }

	public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	public BigDecimal getValor() {
        return valor;
    }

	public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

	public BigDecimal getValorMin() {
        return valorMin;
    }

	public void setValorMin(BigDecimal valorMin) {
        this.valorMin = valorMin;
    }

	public BigDecimal getValorMax() {
        return valorMax;
    }

	public void setValorMax(BigDecimal valorMax) {
        this.valorMax = valorMax;
    }

	public boolean isBeneficioColetivo() {
        return beneficioColetivo;
    }

	public void setBeneficioColetivo(boolean beneficioColetivo) {
        this.beneficioColetivo = beneficioColetivo;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
