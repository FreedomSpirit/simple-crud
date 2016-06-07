package com.example.test.task.service;

import com.example.test.task.domain.Product;

import java.util.List;

public interface ProductService {

    Product createNewProduct(String name, String password);

    Product getProductByName(String name);

    Product getProductById(Long id);

    void deleteProductById(long id);

    void saveProduct(Product product);

    boolean isProductExist(Product product);

    List<Product> findAllProducts();
}
