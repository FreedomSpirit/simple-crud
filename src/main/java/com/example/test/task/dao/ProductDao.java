package com.example.test.task.dao;


import com.example.test.task.domain.Product;

import java.util.List;

public interface ProductDao {
    Product create(String name, String password);
    Product getByName(String name);
    Product getById(Long id);
    public void save(Product currentProduct);
    public void deleteById(long id);
    public boolean isExist(Product product);
    public List<Product> findAll();
}
