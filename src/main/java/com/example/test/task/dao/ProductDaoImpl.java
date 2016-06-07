package com.example.test.task.dao;


import com.example.test.task.domain.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("userDao")
public class ProductDaoImpl implements ProductDao {

    @PersistenceContext
    EntityManager entityManager;

    protected Session getCurrentSession()  {
        return entityManager.unwrap(Session.class);
    }

    @Override
    public Product create(String name, String description) {
        Session session = getCurrentSession();

        Product newProduct = new Product(name, description);
        session.save(newProduct);

        return newProduct;
    }

    @Override
    public Product getByName(String name) {
        Query query = getCurrentSession().createQuery("from product where name = :name");
        query.setParameter("name", name);
        List results = query.list();

        if(results.size() < 1){
            throw new ProductNotFoundException("Product '" + name + "' not found");
        }

        Product product = (Product) results.get(0);
        return product;
    }

    @Override
    public Product getById(Long id) {
        Query query = getCurrentSession().createQuery("from Product where id = :id");
        query.setParameter("id", id);
        List results = query.list();

        if(results.size() < 1){
            throw new ProductNotFoundException("Product #'" + id + "' not found");
        }

        Product product = (Product) results.get(0);
        return product;
    }

    @Override
    public void save(Product product) {
        Session session = getCurrentSession();

        session.saveOrUpdate(product);
    }

    @Override
    public void deleteById(long id) {
        Query query = getCurrentSession().createQuery("delete from Product where id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public boolean isExist(Product product) {
        Query query = getCurrentSession().createQuery("select exist(*) from Product where id = :id");
        query.setParameter("id", product.getId());
        List results = query.list();
        return (Boolean) results.get(0);
    }

    @Override
    public List<Product> findAll() {
        Query query = getCurrentSession().createQuery("from Product");
        List results = query.list();

        return results;
    }
}
