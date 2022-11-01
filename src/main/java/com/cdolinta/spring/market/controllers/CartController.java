package com.cdolinta.spring.market.controllers;

import com.cdolinta.spring.market.dto.Cart;
import com.cdolinta.spring.market.entities.Product;
import com.cdolinta.spring.market.services.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/cart")
public class CartController {
    private final CartService cartService;

    @GetMapping("/add/{id}")
    public void addToCart(@PathVariable Long id){
        cartService.add(id);
    }

    @GetMapping
    public Cart getCurrentCart(){
       return cartService.getCurrentCart();
    }
}
