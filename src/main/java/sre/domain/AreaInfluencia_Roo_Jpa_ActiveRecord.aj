// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sre.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import sre.domain.AreaInfluencia;

privileged aspect AreaInfluencia_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager AreaInfluencia.entityManager;
    
    public static final EntityManager AreaInfluencia.entityManager() {
        EntityManager em = new AreaInfluencia().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long AreaInfluencia.countAreaInfluencias() {
        return entityManager().createQuery("SELECT COUNT(o) FROM AreaInfluencia o", Long.class).getSingleResult();
    }
    
    public static List<AreaInfluencia> AreaInfluencia.findAllAreaInfluencias() {
        return entityManager().createQuery("SELECT o FROM AreaInfluencia o", AreaInfluencia.class).getResultList();
    }
    
    public static AreaInfluencia AreaInfluencia.findAreaInfluencia(Long id) {
        if (id == null) return null;
        return entityManager().find(AreaInfluencia.class, id);
    }
    
    public static List<AreaInfluencia> AreaInfluencia.findAreaInfluenciaEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM AreaInfluencia o", AreaInfluencia.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void AreaInfluencia.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void AreaInfluencia.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            AreaInfluencia attached = AreaInfluencia.findAreaInfluencia(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void AreaInfluencia.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void AreaInfluencia.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public AreaInfluencia AreaInfluencia.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        AreaInfluencia merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
