package com.example.productcontroller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.productmodel.Productmodel;
import com.example.productservice.Productservice;

@RestController
@RequestMapping("/productdetails")
public class Productcontroller {

    @Autowired
    private Productservice productService;

    @PostMapping("/add")
    public String addProduct(@RequestBody Productmodel product) {
        return productService.addProduct(product) ;
    }



    @GetMapping("/find/{id}")
    public Productmodel findProduct(@PathVariable int id) {
        return productService.findProduct(id);
    }



    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return productService.deleteProduct(id);
    }




}




