// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package sre.domain;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import sre.domain.Usuarios;

privileged aspect Usuarios_Roo_Jpa_ActiveRecord {
    
    @PersistenceContext
    transient EntityManager Usuarios.entityManager;
    
    public static final EntityManager Usuarios.entityManager() {
        EntityManager em = new Usuarios().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    public static long Usuarios.countUsuarioses() {
        return entityManager().createQuery("SELECT COUNT(o) FROM Usuarios o", Long.class).getSingleResult();
    }
    
    public static List<Usuarios> Usuarios.findAllUsuarioses() {
        return entityManager().createQuery("SELECT o FROM Usuarios o", Usuarios.class).getResultList();
    }
    
    public static Usuarios Usuarios.findUsuarios(Long id) {
        if (id == null) return null;
        return entityManager().find(Usuarios.class, id);
    }
    
    public static List<Usuarios> Usuarios.findUsuariosEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("SELECT o FROM Usuarios o", Usuarios.class).setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
    @Transactional
    public void Usuarios.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Usuarios.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Usuarios attached = Usuarios.findUsuarios(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Usuarios.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Usuarios.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Usuarios Usuarios.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Usuarios merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
}
