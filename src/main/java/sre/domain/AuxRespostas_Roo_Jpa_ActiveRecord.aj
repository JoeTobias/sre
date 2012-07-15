// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sre.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import sre.domain.AuxRespostas;

privileged aspect AuxRespostas_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager AuxRespostas.entityManager;
    
    public static final EntityManager AuxRespostas.entityManager() {
        EntityManager em = new AuxRespostas().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long AuxRespostas.countAuxRespostases() {
        return entityManager().createQuery("SELECT COUNT(o) FROM AuxRespostas o", Long.class).getSingleResult();
    }
    
    public static List<AuxRespostas> AuxRespostas.findAllAuxRespostases() {
        return entityManager().createQuery("SELECT o FROM AuxRespostas o", AuxRespostas.class).getResultList();
    }
    
    public static AuxRespostas AuxRespostas.findAuxRespostas(Long id) {
        if (id == null) return null;
        return entityManager().find(AuxRespostas.class, id);
    }
    
    public static List<AuxRespostas> AuxRespostas.findAuxRespostasEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM AuxRespostas o", AuxRespostas.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void AuxRespostas.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void AuxRespostas.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            AuxRespostas attached = AuxRespostas.findAuxRespostas(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void AuxRespostas.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void AuxRespostas.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public AuxRespostas AuxRespostas.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        AuxRespostas merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
