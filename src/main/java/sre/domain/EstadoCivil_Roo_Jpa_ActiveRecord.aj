// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sre.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import sre.domain.EstadoCivil;

privileged aspect EstadoCivil_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager EstadoCivil.entityManager;
    
    public static final EntityManager EstadoCivil.entityManager() {
        EntityManager em = new EstadoCivil().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long EstadoCivil.countEstadoCivils() {
        return entityManager().createQuery("SELECT COUNT(o) FROM EstadoCivil o", Long.class).getSingleResult();
    }
    
    public static List<EstadoCivil> EstadoCivil.findAllEstadoCivils() {
        return entityManager().createQuery("SELECT o FROM EstadoCivil o", EstadoCivil.class).getResultList();
    }
    
    public static EstadoCivil EstadoCivil.findEstadoCivil(Long id) {
        if (id == null) return null;
        return entityManager().find(EstadoCivil.class, id);
    }
    
    public static List<EstadoCivil> EstadoCivil.findEstadoCivilEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM EstadoCivil o", EstadoCivil.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void EstadoCivil.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void EstadoCivil.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            EstadoCivil attached = EstadoCivil.findEstadoCivil(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void EstadoCivil.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void EstadoCivil.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public EstadoCivil EstadoCivil.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        EstadoCivil merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
