package com.example.demo.cart;

import com.example.demo.User;
import com.example.demo.item.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/cart")
public class CartController {
    @Autowired
    private CartRepository cartRepository;
    @GetMapping
    public List<Cart> findAllUsers() {
        return (List<Cart>) cartRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cart> findUserById(@PathVariable(value = "id") long id) {
        Optional<Cart> cart = cartRepository.findById(id);

        if(cart.isPresent()) {
            return ResponseEntity.ok().body(cart.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(path = "/save")
    public Cart saveUser(@Validated @RequestBody  Cart cart) {

        System.out.println(cart);
        return cartRepository.save(cart);
    }
  /*  @PostMapping(path = "/addItem")
    public ResponseEntity<List<Item>> addItem(@Validated @RequestBody Item item){
        List<Item> items =cartRepository.addItem(item);
        if(items.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else{
            return new ResponseEntity<>(items,HttpStatus.OK);
        }

    }
    */

}
