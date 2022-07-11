package com.example.PP_3_1_1.dao;

import com.example.PP_3_1_1.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getListUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(int id) {
        entityManager.createQuery("delete from users where id =:id").setParameter("id", id).executeUpdate();
    }

    @Override
    public void update(User user, int id) {
        entityManager.merge(user);
    }

    @Override
    public User getById(int id) {
        return entityManager.find(User.class,id);
    }
}