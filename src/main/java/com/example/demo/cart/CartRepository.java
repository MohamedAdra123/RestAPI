package com.example.demo.cart;

import com.example.demo.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface CartRepository extends JpaRepository<Cart,Long> {

}
