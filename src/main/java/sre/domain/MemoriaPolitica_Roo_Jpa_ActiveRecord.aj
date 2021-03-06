// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sre.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import sre.domain.MemoriaPolitica;

privileged aspect MemoriaPolitica_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager MemoriaPolitica.entityManager;
    
    public static final EntityManager MemoriaPolitica.entityManager() {
        EntityManager em = new MemoriaPolitica().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long MemoriaPolitica.countMemoriaPoliticas() {
        return entityManager().createQuery("SELECT COUNT(o) FROM MemoriaPolitica o", Long.class).getSingleResult();
    }
    
    public static List<MemoriaPolitica> MemoriaPolitica.findAllMemoriaPoliticas() {
        return entityManager().createQuery("SELECT o FROM MemoriaPolitica o", MemoriaPolitica.class).getResultList();
    }
    
    public static MemoriaPolitica MemoriaPolitica.findMemoriaPolitica(Long id) {
        if (id == null) return null;
        return entityManager().find(MemoriaPolitica.class, id);
    }
    
    public static List<MemoriaPolitica> MemoriaPolitica.findMemoriaPoliticaEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM MemoriaPolitica o", MemoriaPolitica.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void MemoriaPolitica.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void MemoriaPolitica.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            MemoriaPolitica attached = MemoriaPolitica.findMemoriaPolitica(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void MemoriaPolitica.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void MemoriaPolitica.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public MemoriaPolitica MemoriaPolitica.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        MemoriaPolitica merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
