package com.cdolinta.spring.market.services;

import com.cdolinta.spring.market.entities.Product;
import com.cdolinta.spring.market.repositories.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {

    private final CartRepository cartRepository;
    private final ProductService productService;

    public List<Product> findAll(){
       return cartRepository.findAll();
    }

    public void addProduct(Long  id){
        Product product = productService.findById(id).orElseThrow(()-> new RuntimeException("Product not found !"));
        cartRepository.addProduct(product);
    }
}
