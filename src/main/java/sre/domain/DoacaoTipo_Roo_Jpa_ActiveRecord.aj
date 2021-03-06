// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sre.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import sre.domain.DoacaoTipo;

privileged aspect DoacaoTipo_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager DoacaoTipo.entityManager;
    
    public static final EntityManager DoacaoTipo.entityManager() {
        EntityManager em = new DoacaoTipo().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long DoacaoTipo.countDoacaoTipoes() {
        return entityManager().createQuery("SELECT COUNT(o) FROM DoacaoTipo o", Long.class).getSingleResult();
    }
    
    public static List<DoacaoTipo> DoacaoTipo.findAllDoacaoTipoes() {
        return entityManager().createQuery("SELECT o FROM DoacaoTipo o", DoacaoTipo.class).getResultList();
    }
    
    public static DoacaoTipo DoacaoTipo.findDoacaoTipo(Long id) {
        if (id == null) return null;
        return entityManager().find(DoacaoTipo.class, id);
    }
    
    public static List<DoacaoTipo> DoacaoTipo.findDoacaoTipoEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM DoacaoTipo o", DoacaoTipo.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void DoacaoTipo.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void DoacaoTipo.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            DoacaoTipo attached = DoacaoTipo.findDoacaoTipo(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void DoacaoTipo.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void DoacaoTipo.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public DoacaoTipo DoacaoTipo.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        DoacaoTipo merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
