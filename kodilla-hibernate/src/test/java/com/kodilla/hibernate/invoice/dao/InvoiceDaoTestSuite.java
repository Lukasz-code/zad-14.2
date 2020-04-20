package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){

        //Given

        Product product = new Product ("laptop HP");
        Product product2 = new Product ("laptop Alien");
        Product product3 = new Product("laptop DreamMachine");

        Item item = new Item(new BigDecimal(5),5,new BigDecimal(5));
        Item item2 = new Item(new BigDecimal(3),3 ,new BigDecimal(3));
        Item item3 = new Item(new BigDecimal(2),2,new BigDecimal(2));

        item.getProducts().add(product);
        item.getProducts().add(product2);

        item2.getProducts().add(product2);
        item2.getProducts().add(product3);

        item3.getProducts().add(product3);
        item3.getProducts().add(product);

        Invoice invoice = new Invoice("01/19/04/2020");
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);


        //When

//        invoiceDao.save(invoice);

    }
}
