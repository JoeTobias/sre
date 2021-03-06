// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sre.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import sre.domain.GrupoDificuldades;

privileged aspect GrupoDificuldades_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager GrupoDificuldades.entityManager;
    
    public static final EntityManager GrupoDificuldades.entityManager() {
        EntityManager em = new GrupoDificuldades().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long GrupoDificuldades.countGrupoDificuldadeses() {
        return entityManager().createQuery("SELECT COUNT(o) FROM GrupoDificuldades o", Long.class).getSingleResult();
    }
    
    public static List<GrupoDificuldades> GrupoDificuldades.findAllGrupoDificuldadeses() {
        return entityManager().createQuery("SELECT o FROM GrupoDificuldades o", GrupoDificuldades.class).getResultList();
    }
    
    public static GrupoDificuldades GrupoDificuldades.findGrupoDificuldades(Long id) {
        if (id == null) return null;
        return entityManager().find(GrupoDificuldades.class, id);
    }
    
    public static List<GrupoDificuldades> GrupoDificuldades.findGrupoDificuldadesEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM GrupoDificuldades o", GrupoDificuldades.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void GrupoDificuldades.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void GrupoDificuldades.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            GrupoDificuldades attached = GrupoDificuldades.findGrupoDificuldades(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void GrupoDificuldades.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void GrupoDificuldades.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public GrupoDificuldades GrupoDificuldades.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        GrupoDificuldades merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
