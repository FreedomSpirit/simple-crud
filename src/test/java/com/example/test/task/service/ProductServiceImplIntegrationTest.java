package com.example.test.task.service;

import com.example.test.task.TestTaskApplication;
import com.example.test.task.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestTaskApplication.class)
@WebAppConfiguration
public class ProductServiceImplIntegrationTest {

    @Autowired
    private ProductService service;

    @Test
    public void createProductTest() throws  Exception {
        service.createNewProduct("New","test");
        Product loadedProduct = service.getProductByName("New");
        assertEquals(loadedProduct.getName(), "New");
        assertEquals(loadedProduct.getDescription(), "test");
    }
}