package com.cdolinta.spring.market.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import java.util.List;

@Scope("singleton")
@Component
@NoArgsConstructor
@Getter
@Setter
public class Cart {

    private List<Product> cart;

    public void add(Product product){
        cart.add(product);
    }

    public List<Product> findAll(){
        return this.cart;
    }
}
