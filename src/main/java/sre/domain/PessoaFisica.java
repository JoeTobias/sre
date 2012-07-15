package sre.domain;

import java.util.Date;
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
@Table(schema = "public",name = "pessoa_fisica")
@RooJavaBean
@RooToString
@RooJpaActiveRecord(table = "pessoa_fisica", schema = "public")
public class PessoaFisica {

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

	@OneToMany(mappedBy = "responsavel")
    private Set<ComiteBens> comiteBenss;

	@OneToMany(mappedBy = "responsavel")
    private Set<Comites> comiteses;

	@OneToMany(mappedBy = "pessoa")
    private Set<Doacao> doacaos;

	@OneToMany(mappedBy = "pessoaParent")
    private Set<Familia> familias;

	@OneToMany(mappedBy = "pessoa")
    private Set<Familia> familias1;

	@OneToMany(mappedBy = "pessoaLider")
    private Set<GruposAcao> gruposAcaos;

	@OneToMany(mappedBy = "pessoa")
    private Set<MemoriaPolitica> memoriaPoliticas;

	@OneToMany(mappedBy = "pessoa")
    private Set<PessoaContatos> pessoaContatoss;

	@OneToMany(mappedBy = "pessoa")
    private Set<PessoaEndereco> pessoaEnderecoes;

	@OneToMany(mappedBy = "pessoa")
    private Set<PessoaInfluencia> pessoaInfluencias;

	@OneToMany(mappedBy = "captador")
    private Set<SocioPolitico> socioPoliticoes;

	@OneToMany(mappedBy = "pessoa")
    private Set<SocioPolitico> socioPoliticoes1;

	@OneToMany(mappedBy = "pessoa")
    private Set<Usuarios> usuarioss;

	@ManyToOne
    @JoinColumn(name = "deficiencia_tipo", referencedColumnName = "id")
    private DeficienciaTipo deficienciaTipo;

	@ManyToOne
    @JoinColumn(name = "naturalde", referencedColumnName = "id")
    private EndMunicipios naturalde;

	@ManyToOne
    @JoinColumn(name = "estado_civil", referencedColumnName = "id")
    private EstadoCivil estadoCivil;

	@ManyToOne
    @JoinColumn(name = "sexo", referencedColumnName = "id", nullable = false)
    private PessoaGenero sexo;

	@Column(name = "nome", length = 100)
    @NotNull
    private String nome;

	@Column(name = "nome_social", length = 70)
    private String nomeSocial;

	@Column(name = "nascimento")
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(style = "M-")
    private Date nascimento;

	@Column(name = "usuario")
    @NotNull
    private Integer usuario;

	@Column(name = "filhos")
    @NotNull
    private boolean filhos;

	@Column(name = "deficiente")
    @NotNull
    private boolean deficiente;

	public Set<ComiteBens> getComiteBenss() {
        return comiteBenss;
    }

	public void setComiteBenss(Set<ComiteBens> comiteBenss) {
        this.comiteBenss = comiteBenss;
    }

	public Set<Comites> getComiteses() {
        return comiteses;
    }

	public void setComiteses(Set<Comites> comiteses) {
        this.comiteses = comiteses;
    }

	public Set<Doacao> getDoacaos() {
        return doacaos;
    }

	public void setDoacaos(Set<Doacao> doacaos) {
        this.doacaos = doacaos;
    }

	public Set<Familia> getFamilias() {
        return familias;
    }

	public void setFamilias(Set<Familia> familias) {
        this.familias = familias;
    }

	public Set<Familia> getFamilias1() {
        return familias1;
    }

	public void setFamilias1(Set<Familia> familias1) {
        this.familias1 = familias1;
    }

	public Set<GruposAcao> getGruposAcaos() {
        return gruposAcaos;
    }

	public void setGruposAcaos(Set<GruposAcao> gruposAcaos) {
        this.gruposAcaos = gruposAcaos;
    }

	public Set<MemoriaPolitica> getMemoriaPoliticas() {
        return memoriaPoliticas;
    }

	public void setMemoriaPoliticas(Set<MemoriaPolitica> memoriaPoliticas) {
        this.memoriaPoliticas = memoriaPoliticas;
    }

	public Set<PessoaContatos> getPessoaContatoss() {
        return pessoaContatoss;
    }

	public void setPessoaContatoss(Set<PessoaContatos> pessoaContatoss) {
        this.pessoaContatoss = pessoaContatoss;
    }

	public Set<PessoaEndereco> getPessoaEnderecoes() {
        return pessoaEnderecoes;
    }

	public void setPessoaEnderecoes(Set<PessoaEndereco> pessoaEnderecoes) {
        this.pessoaEnderecoes = pessoaEnderecoes;
    }

	public Set<PessoaInfluencia> getPessoaInfluencias() {
        return pessoaInfluencias;
    }

	public void setPessoaInfluencias(Set<PessoaInfluencia> pessoaInfluencias) {
        this.pessoaInfluencias = pessoaInfluencias;
    }

	public Set<SocioPolitico> getSocioPoliticoes() {
        return socioPoliticoes;
    }

	public void setSocioPoliticoes(Set<SocioPolitico> socioPoliticoes) {
        this.socioPoliticoes = socioPoliticoes;
    }

	public Set<SocioPolitico> getSocioPoliticoes1() {
        return socioPoliticoes1;
    }

	public void setSocioPoliticoes1(Set<SocioPolitico> socioPoliticoes1) {
        this.socioPoliticoes1 = socioPoliticoes1;
    }

	public Set<Usuarios> getUsuarioss() {
        return usuarioss;
    }

	public void setUsuarioss(Set<Usuarios> usuarioss) {
        this.usuarioss = usuarioss;
    }

	public DeficienciaTipo getDeficienciaTipo() {
        return deficienciaTipo;
    }

	public void setDeficienciaTipo(DeficienciaTipo deficienciaTipo) {
        this.deficienciaTipo = deficienciaTipo;
    }

	public EndMunicipios getNaturalde() {
        return naturalde;
    }

	public void setNaturalde(EndMunicipios naturalde) {
        this.naturalde = naturalde;
    }

	public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

	public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

	public PessoaGenero getSexo() {
        return sexo;
    }

	public void setSexo(PessoaGenero sexo) {
        this.sexo = sexo;
    }

	public String getNome() {
        return nome;
    }

	public void setNome(String nome) {
        this.nome = nome;
    }

	public String getNomeSocial() {
        return nomeSocial;
    }

	public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

	public Date getNascimento() {
        return nascimento;
    }

	public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

	public Integer getUsuario() {
        return usuario;
    }

	public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

	public boolean isFilhos() {
        return filhos;
    }

	public void setFilhos(boolean filhos) {
        this.filhos = filhos;
    }

	public boolean isDeficiente() {
        return deficiente;
    }

	public void setDeficiente(boolean deficiente) {
        this.deficiente = deficiente;
    }

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
}
