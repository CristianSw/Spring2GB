package com.cdolinta.spring.market.services;

import com.cdolinta.spring.market.dto.Cart;
import com.cdolinta.spring.market.entities.Product;
import com.cdolinta.spring.market.exceptions.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {

    private final ProductService productService;
    private Cart tempCart;


    @PostConstruct
    public void init(){
        tempCart = new Cart();
    }

    public Cart getCurrentCart(){
        return tempCart;
    }

    public void add(Long productId){
        Product product = productService.findById(productId).orElseThrow(()-> new ResourceNotFoundException("Cant add product with id : " + productId + " to cart. Product not found"));
        tempCart.add(product);
    }
}
