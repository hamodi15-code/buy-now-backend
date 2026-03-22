package com.dailycodework.buynowdotcom.controller;

import com.dailycodework.buynowdotcom.dtos.CartDto;
import com.dailycodework.buynowdotcom.model.Cart;
import com.dailycodework.buynowdotcom.response.ApiResponse;
import com.dailycodework.buynowdotcom.service.cart.ICartItemService;
import com.dailycodework.buynowdotcom.service.cart.ICartService;
import com.dailycodework.buynowdotcom.service.user.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5174")
@RestController
@RequiredArgsConstructor
@RequestMapping("${api.prefix}/carts")
public class CartController {
    private final ICartItemService cartItemService;
    private final IUserService userService;
    private final ICartService cartService;

    @GetMapping("/user/{userId}/cart")
    public ResponseEntity<ApiResponse> getUserCart(@PathVariable Long userId){
        Cart cart = cartService.getCartByUserId(userId);
        CartDto cartDto = cartService.convertToDto(cart);
        return ResponseEntity.ok(new ApiResponse("Success",cartDto));
    }
    @DeleteMapping("/cart/{cartId}/cart")
    public void clearCart(@PathVariable Long cartId){
        cartService.clearCart(cartId);
    }

}
