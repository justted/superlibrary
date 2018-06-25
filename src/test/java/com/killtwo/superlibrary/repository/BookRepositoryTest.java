package com.killtwo.superlibrary.repository;

import com.killtwo.superlibrary.entity.Book;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;


@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookRepositoryTest {


    @Autowired
    private BookRepository bookRepository;

    private static Integer bookId;

    @Test
    public void testAInsert() {
        Book book = new Book();
        book.setBookName("book");
        book.setBookPress("10.00");
        book.setBookPress("wiley");
        book.setCallNumber("TPE231.324L");
        book.setBookInventory(5);
        book.setBookAuthor("author");
        book.setPublishTime(new Date());
        book.setCurrentInventory(3);
        book.setBookAbstract("abstract");
        book.setContentIntroduction("introduction");
        book.setCatalog("catalog");
        book.setAuthorIntroduction("author introduction");
        book.setBorrowStatus((byte)0);
        book.setCreateTime(new Date());
        book.setUpdateTime(new Date());
        Book res = bookRepository.save(book);
        assertNotNull(res);
        bookId = book.getBookId();
    }

    @Test
    public void testBGetByBookId() {
        Book book = bookRepository.getByBookId(bookId);
        assertNotNull(book);
    }

    @Test
    public void testCUpdate() {
        Book book = bookRepository.getByBookId(bookId);
        String press = "O'Reilly";
        book.setBookPress(press);
        book.setUpdateTime(new Date());
        Book res = bookRepository.save(book);
        assertNotNull(res);
        assertEquals(res.getBookPress(), press);
    }

    @Test
    public void testDDelete() {
        Book book = bookRepository.getByBookId(bookId);
        bookRepository.delete(book);
        book = bookRepository.getByBookId(bookId);
        assertNull(book);
    }




}