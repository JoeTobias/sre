// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sre.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import sre.domain.PessoaEndereco;

privileged aspect PessoaEndereco_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager PessoaEndereco.entityManager;
    
    public static final EntityManager PessoaEndereco.entityManager() {
        EntityManager em = new PessoaEndereco().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long PessoaEndereco.countPessoaEnderecoes() {
        return entityManager().createQuery("SELECT COUNT(o) FROM PessoaEndereco o", Long.class).getSingleResult();
    }
    
    public static List<PessoaEndereco> PessoaEndereco.findAllPessoaEnderecoes() {
        return entityManager().createQuery("SELECT o FROM PessoaEndereco o", PessoaEndereco.class).getResultList();
    }
    
    public static PessoaEndereco PessoaEndereco.findPessoaEndereco(Long id) {
        if (id == null) return null;
        return entityManager().find(PessoaEndereco.class, id);
    }
    
    public static List<PessoaEndereco> PessoaEndereco.findPessoaEnderecoEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM PessoaEndereco o", PessoaEndereco.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void PessoaEndereco.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void PessoaEndereco.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            PessoaEndereco attached = PessoaEndereco.findPessoaEndereco(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void PessoaEndereco.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void PessoaEndereco.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public PessoaEndereco PessoaEndereco.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        PessoaEndereco merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}