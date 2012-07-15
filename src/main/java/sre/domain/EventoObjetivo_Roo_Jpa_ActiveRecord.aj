// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sre.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import sre.domain.EventoObjetivo;

privileged aspect EventoObjetivo_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager EventoObjetivo.entityManager;
    
    public static final EntityManager EventoObjetivo.entityManager() {
        EntityManager em = new EventoObjetivo().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long EventoObjetivo.countEventoObjetivoes() {
        return entityManager().createQuery("SELECT COUNT(o) FROM EventoObjetivo o", Long.class).getSingleResult();
    }
    
    public static List<EventoObjetivo> EventoObjetivo.findAllEventoObjetivoes() {
        return entityManager().createQuery("SELECT o FROM EventoObjetivo o", EventoObjetivo.class).getResultList();
    }
    
    public static EventoObjetivo EventoObjetivo.findEventoObjetivo(Long id) {
        if (id == null) return null;
        return entityManager().find(EventoObjetivo.class, id);
    }
    
    public static List<EventoObjetivo> EventoObjetivo.findEventoObjetivoEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM EventoObjetivo o", EventoObjetivo.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void EventoObjetivo.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void EventoObjetivo.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            EventoObjetivo attached = EventoObjetivo.findEventoObjetivo(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void EventoObjetivo.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void EventoObjetivo.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public EventoObjetivo EventoObjetivo.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        EventoObjetivo merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
