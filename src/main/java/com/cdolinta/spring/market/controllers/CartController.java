package com.cdolinta.spring.market.controllers;

import com.cdolinta.spring.market.entities.Product;
import com.cdolinta.spring.market.services.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/cart")
public class CartController {
    private final CartService cartService;

    @GetMapping
    public List<Product> findAllProducts(){
        return cartService.findAll();
    }

    @PostMapping("/{id}")
    public void addProductToCart(@PathVariable long id){
        cartService.addProduct(id);
    }
}
