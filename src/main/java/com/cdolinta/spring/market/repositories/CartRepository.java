package com.cdolinta.spring.market.repositories;

import com.cdolinta.spring.market.entities.Cart;
import com.cdolinta.spring.market.entities.Product;
import lombok.NoArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@NoArgsConstructor

public class CartRepository {
    @Autowired
    private Cart cart;

    public List<Product> findAll(){
        return cart.findAll();
    }

    public void addProduct(Product product){
        cart.add(product);
    }


}
