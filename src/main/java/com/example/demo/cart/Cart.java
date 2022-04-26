package com.example.demo.cart;

import com.example.demo.User;
import com.example.demo.item.Item;
import com.example.demo.item.ItemList;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cardId")
    private Long cardId;
    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    @JsonIgnoreProperties("cart")
    private User user;
    @Column
    @OneToMany(targetEntity = Item.class)
    private List<Item> items;
    @Column
    private String cartName;


}
