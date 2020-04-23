package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "ITEM")
public class Item {
    private int id;
    private Product product;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Invoice invoice;


    @ManyToOne
    @JoinColumn(name = "ON_INOVICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }



    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn (name ="PRODUCT")
    public Product getProduct() {
        return product;
    }


    public Item () {
    }

    public Item(BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }
    @Id
    @GeneratedValue
    @Column(name = "ITEM_ID", nullable = false, unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }
    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }
    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setId(int id) {
        this.id = id;
    }


}
