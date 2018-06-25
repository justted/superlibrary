package com.killtwo.superlibrary.repository;

import com.killtwo.superlibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Book getByBookId(Integer bookId);

}
