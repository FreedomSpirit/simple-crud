package com.example.test.task.service;


import com.example.test.task.dao.ProductDao;
import com.example.test.task.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    public Product createNewProduct(String name, String description) {
        return productDao.create(name, description);
    }

    @Override
    public Product getProductByName(String name) {
        return productDao.getByName(name);
    }

    @Override
    public Product getProductById(Long id) {
        return productDao.getById(id);
    }


    @Override
    public void deleteProductById(long id) {
        productDao.deleteById(id);
    }

    @Override
    public void saveProduct(Product product) {
        productDao.save(product);
    }

    @Override
    public boolean isProductExist(Product product) {
        return productDao.isExist(product);
    }

    @Override
    public List<Product> findAllProducts() {
        return productDao.findAll();
    }
}
