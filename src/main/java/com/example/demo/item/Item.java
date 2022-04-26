package com.example.demo.item;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="item")
public class Item {
    @Id
    private long id;
    @Column
    private String name;
    @Column
    private double price;

}
