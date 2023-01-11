package com.example.productrepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.productmodel.Productmodel;

@Repository
public interface Productrepository extends MongoRepository<Productmodel,Integer>
{}