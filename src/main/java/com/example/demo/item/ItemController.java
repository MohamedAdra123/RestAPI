package com.example.demo.item;

import com.example.demo.cart.Cart;
import com.example.demo.cart.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/items")
public class ItemController {
    @Autowired
    private ItemRepository itemRepository;
    @GetMapping
    public List<Item> findAllUsers() {
        return (List<Item>) itemRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> findUserById(@PathVariable(value = "id") long id) {
        Optional<Item> item = itemRepository.findById(id);

        if(item.isPresent()) {
            return ResponseEntity.ok().body(item.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping(path = "/save")
    public Item saveUser(@Validated @RequestBody  Item item) {

        System.out.println(item);
        return itemRepository.save(item);
    }
}
