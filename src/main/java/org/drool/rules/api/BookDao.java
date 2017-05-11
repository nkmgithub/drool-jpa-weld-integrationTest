package org.drool.rules.api;

import org.drool.rules.bean.Book;

import java.util.List;

public interface BookDao {
    Book save(Book book);
    List<Book> findAll();
}
