// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sre.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import sre.domain.Escolaridade;

privileged aspect Escolaridade_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Escolaridade.entityManager;
    
    public static final EntityManager Escolaridade.entityManager() {
        EntityManager em = new Escolaridade().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Escolaridade.countEscolaridades() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Escolaridade o", Long.class).getSingleResult();
    }
    
    public static List<Escolaridade> Escolaridade.findAllEscolaridades() {
        return entityManager().createQuery("SELECT o FROM Escolaridade o", Escolaridade.class).getResultList();
    }
    
    public static Escolaridade Escolaridade.findEscolaridade(Long id) {
        if (id == null) return null;
        return entityManager().find(Escolaridade.class, id);
    }
    
    public static List<Escolaridade> Escolaridade.findEscolaridadeEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Escolaridade o", Escolaridade.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Escolaridade.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Escolaridade.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Escolaridade attached = Escolaridade.findEscolaridade(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Escolaridade.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Escolaridade.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Escolaridade Escolaridade.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Escolaridade merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}