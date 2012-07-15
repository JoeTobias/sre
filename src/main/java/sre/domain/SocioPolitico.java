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
@Table(schema = "public",name = "socio_politico")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "socio_politico", schema = "public")
public class SocioPolitico {

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
    @JoinColumn(name = "voto", referencedColumnName = "id")
    private AuxRespostas voto;

	@ManyToOne
    @JoinColumn(name = "placa", referencedColumnName = "id")
    private AuxRespostas placa;

	@ManyToOne
    @JoinColumn(name = "captador_relacionameto", referencedColumnName = "id")
    private CaptadorRelacionamento captadorRelacionameto;

	@ManyToOne
    @JoinColumn(name = "bairro_voto", referencedColumnName = "id")
    private EndBairros bairroVoto;

	@ManyToOne
    @JoinColumn(name = "municipio_voto", referencedColumnName = "id")
    private EndMunicipios municipioVoto;

	@ManyToOne
    @JoinColumn(name = "escolaridade", referencedColumnName = "id")
    private Escolaridade escolaridade;

	@ManyToOne
    @JoinColumn(name = "grupo", referencedColumnName = "id")
    private GruposAcao grupo;

	@ManyToOne
    @JoinColumn(name = "orientacao_politica", referencedColumnName = "id")
    private OrientacaoPolitica orientacaoPolitica;

	@ManyToOne
    @JoinColumn(name = "captador", referencedColumnName = "id")
    private PessoaFisica captador;

	@ManyToOne
    @JoinColumn(name = "pessoa", referencedColumnName = "id", nullable = false)
    private PessoaFisica pessoa;

	@ManyToOne
    @JoinColumn(name = "profissao", referencedColumnName = "id")
    private Profissoes profissao;

	@ManyToOne
    @JoinColumn(name = "qualificacao", referencedColumnName = "id")
    private Qualificacao qualificacao;

	@ManyToOne
    @JoinColumn(name = "religiao", referencedColumnName = "id")
    private Religiao religiao;

	@Column(name = "renda_individual", precision = 9, scale = 2)
    private BigDecimal rendaIndividual;

	@Column(name = "renda_familiar", precision = 9, scale = 2)
    private BigDecimal rendaFamiliar;

	@Column(name = "pessoas_casa")
    private Integer pessoasCasa;

	@Column(name = "empregado")
    @NotNull
    private boolean empregado;

	@Column(name = "local_trabalho", length = 70)
    private String localTrabalho;

	@Column(name = "orientacao_sexual", length = 45)
    private String orientacaoSexual;

	@Column(name = "localidade_voto", length = 70)
    private String localidadeVoto;

	@Column(name = "sobre_pessoa")
    private String sobrePessoa;

	@Column(name = "ultima_atualizacao")
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    private Date ultimaAtualizacao;

	public AuxRespostas getVoto() {
        return voto;
    }

	public void setVoto(AuxRespostas voto) {
        this.voto = voto;
    }

	public AuxRespostas getPlaca() {
        return placa;
    }

	public void setPlaca(AuxRespostas placa) {
        this.placa = placa;
    }

	public CaptadorRelacionamento getCaptadorRelacionameto() {
        return captadorRelacionameto;
    }

	public void setCaptadorRelacionameto(CaptadorRelacionamento captadorRelacionameto) {
        this.captadorRelacionameto = captadorRelacionameto;
    }

	public EndBairros getBairroVoto() {
        return bairroVoto;
    }

	public void setBairroVoto(EndBairros bairroVoto) {
        this.bairroVoto = bairroVoto;
    }

	public EndMunicipios getMunicipioVoto() {
        return municipioVoto;
    }

	public void setMunicipioVoto(EndMunicipios municipioVoto) {
        this.municipioVoto = municipioVoto;
    }

	public Escolaridade getEscolaridade() {
        return escolaridade;
    }

	public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

	public GruposAcao getGrupo() {
        return grupo;
    }

	public void setGrupo(GruposAcao grupo) {
        this.grupo = grupo;
    }

	public OrientacaoPolitica getOrientacaoPolitica() {
        return orientacaoPolitica;
    }

	public void setOrientacaoPolitica(OrientacaoPolitica orientacaoPolitica) {
        this.orientacaoPolitica = orientacaoPolitica;
    }

	public PessoaFisica getCaptador() {
        return captador;
    }

	public void setCaptador(PessoaFisica captador) {
        this.captador = captador;
    }

	public PessoaFisica getPessoa() {
        return pessoa;
    }

	public void setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
    }

	public Profissoes getProfissao() {
        return profissao;
    }

	public void setProfissao(Profissoes profissao) {
        this.profissao = profissao;
    }

	public Qualificacao getQualificacao() {
        return qualificacao;
    }

	public void setQualificacao(Qualificacao qualificacao) {
        this.qualificacao = qualificacao;
    }

	public Religiao getReligiao() {
        return religiao;
    }

	public void setReligiao(Religiao religiao) {
        this.religiao = religiao;
    }

	public BigDecimal getRendaIndividual() {
        return rendaIndividual;
    }

	public void setRendaIndividual(BigDecimal rendaIndividual) {
        this.rendaIndividual = rendaIndividual;
    }

	public BigDecimal getRendaFamiliar() {
        return rendaFamiliar;
    }

	public void setRendaFamiliar(BigDecimal rendaFamiliar) {
        this.rendaFamiliar = rendaFamiliar;
    }

	public Integer getPessoasCasa() {
        return pessoasCasa;
    }

	public void setPessoasCasa(Integer pessoasCasa) {
        this.pessoasCasa = pessoasCasa;
    }

	public boolean isEmpregado() {
        return empregado;
    }

	public void setEmpregado(boolean empregado) {
        this.empregado = empregado;
    }

	public String getLocalTrabalho() {
        return localTrabalho;
    }

	public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

	public String getOrientacaoSexual() {
        return orientacaoSexual;
    }

	public void setOrientacaoSexual(String orientacaoSexual) {
        this.orientacaoSexual = orientacaoSexual;
    }

	public String getLocalidadeVoto() {
        return localidadeVoto;
    }

	public void setLocalidadeVoto(String localidadeVoto) {
        this.localidadeVoto = localidadeVoto;
    }

	public String getSobrePessoa() {
        return sobrePessoa;
    }

	public void setSobrePessoa(String sobrePessoa) {
        this.sobrePessoa = sobrePessoa;
    }

	public Date getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

	public void setUltimaAtualizacao(Date ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
