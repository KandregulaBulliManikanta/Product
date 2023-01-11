package com.example.productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productmodel.Productmodel;
import com.example.productrepository.Productrepository;

@Service
public class Productserviceimplemantation implements Productservice {


    @Autowired
    private Productrepository productRepo;

    @Override
    public String addProduct(Productmodel product) {
        productRepo.save(product);
        return "Product added Successfully with id" + product.getProductId();
    }




    @Override
    public Productmodel findProduct(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public String deleteProduct(int id) {
        productRepo.deleteById(id);
        return "Product Deleted Successfully with id" + id;
    }


}
