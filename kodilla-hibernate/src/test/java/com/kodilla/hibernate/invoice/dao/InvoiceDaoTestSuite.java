package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
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
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){

        //Given

        Product product = new Product ("laptop HP");
        Product product2 = new Product ("laptop Alien");
        Product product3 = new Product("laptop DreamMachine");

        Item item = new Item(new BigDecimal(5),5,new BigDecimal(5));
        Item item2 = new Item(new BigDecimal(3),3 ,new BigDecimal(3));
        Item item3 = new Item(new BigDecimal(2),2,new BigDecimal(2));

        product.getItemList().add(item);
        item.setProduct(product);
        product2.getItemList().add(item2);
        item2.setProduct(product2);
        product3.getItemList().add(item3);
        item3.setProduct(product3);

        Invoice invoice = new Invoice("01/19/04/2020");

        invoice.getItems().add(item);
        item.setInvoice(invoice);

        invoice.getItems().add(item2);
        item2.setInvoice(invoice);

        invoice.getItems().add(item3);
        item3.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();


      //Then
        Assert.assertEquals(3,invoice.getItems().size());

    }
}
