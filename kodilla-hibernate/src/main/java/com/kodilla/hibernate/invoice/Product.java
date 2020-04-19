package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class Product {
    private int id;
    private String name;
    private Item item;


    @ManyToOne
    @JoinColumn(name="ITEM_ID")
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Product (){

    }

    public Product(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue
    @Column(name = "PRODUCT_ID", nullable = false, unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "PRODUCT_NAME")
    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
