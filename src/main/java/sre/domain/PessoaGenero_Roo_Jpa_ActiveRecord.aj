// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sre.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import sre.domain.PessoaGenero;

privileged aspect PessoaGenero_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager PessoaGenero.entityManager;
    
    public static final EntityManager PessoaGenero.entityManager() {
        EntityManager em = new PessoaGenero().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long PessoaGenero.countPessoaGeneroes() {
        return entityManager().createQuery("SELECT COUNT(o) FROM PessoaGenero o", Long.class).getSingleResult();
    }
    
    public static List<PessoaGenero> PessoaGenero.findAllPessoaGeneroes() {
        return entityManager().createQuery("SELECT o FROM PessoaGenero o", PessoaGenero.class).getResultList();
    }
    
    public static PessoaGenero PessoaGenero.findPessoaGenero(Long id) {
        if (id == null) return null;
        return entityManager().find(PessoaGenero.class, id);
    }
    
    public static List<PessoaGenero> PessoaGenero.findPessoaGeneroEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM PessoaGenero o", PessoaGenero.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void PessoaGenero.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void PessoaGenero.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            PessoaGenero attached = PessoaGenero.findPessoaGenero(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void PessoaGenero.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void PessoaGenero.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public PessoaGenero PessoaGenero.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        PessoaGenero merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}