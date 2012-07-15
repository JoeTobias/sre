// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sre.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import sre.domain.Comites;

privileged aspect Comites_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Comites.entityManager;
    
    public static final EntityManager Comites.entityManager() {
        EntityManager em = new Comites().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Comites.countComiteses() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Comites o", Long.class).getSingleResult();
    }
    
    public static List<Comites> Comites.findAllComiteses() {
        return entityManager().createQuery("SELECT o FROM Comites o", Comites.class).getResultList();
    }
    
    public static Comites Comites.findComites(Long id) {
        if (id == null) return null;
        return entityManager().find(Comites.class, id);
    }
    
    public static List<Comites> Comites.findComitesEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Comites o", Comites.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Comites.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Comites.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Comites attached = Comites.findComites(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Comites.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Comites.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Comites Comites.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Comites merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}