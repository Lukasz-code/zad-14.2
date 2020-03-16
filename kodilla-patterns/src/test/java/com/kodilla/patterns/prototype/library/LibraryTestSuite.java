package com.kodilla.patterns.prototype.library;


import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {
    Library library = new Library("Books 1-3");
    Library clonedLibrary = null;
    Library deepClonedLibrary = null;

    @Test
    public void testGetBooks() {
        //Given
        Book book1 = new Book("book1","Author 1", LocalDate.of(2017,1,1));
        Book book2 = new Book("book2","Author 2", LocalDate.of(2016,1,1));
        Book book3 = new Book("book3","Author 3", LocalDate.of(2015,1,1));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Readed Books 1-3");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Books readed again ");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        //When
        library.getBooks().remove(book2);
        library.getBooks().remove(book1);


        //Then
        Assert.assertEquals(1,library.getBooks().size());
        Assert.assertEquals(1, clonedLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
