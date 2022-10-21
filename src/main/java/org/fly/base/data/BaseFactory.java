package org.fly.base.data;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Component
@Transactional
public class BaseFactory<T extends BaseTO> {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(T t) {
        entityManager.persist(t);
    }

    public void update(T t) {
        entityManager.merge(t);
    }

    public void delete(T t) {
        entityManager.remove(t);
    }

    public List<T> findAll(Class<T> aClass) {
        return entityManager.createQuery("select entity from " + aClass.getAnnotation(Entity.class).name() + " entity ").getResultList();
    }
}
