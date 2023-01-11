package com.example.productservice;

import com.example.productmodel.Productmodel;

public interface Productservice {
    public String addProduct(Productmodel product);

    public Productmodel findProduct(int id);

    public String deleteProduct(int id);
}
