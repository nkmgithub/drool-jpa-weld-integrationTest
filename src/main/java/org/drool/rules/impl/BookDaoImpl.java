package org.drool.rules.impl;

import org.drool.rules.bean.Book;
import org.drool.rules.api.BookDao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class BookDaoImpl implements BookDao {

    @Inject
    private EntityManager entityManager;

    @Override
    public Book save(Book book) {
        entityManager.getTransaction().begin();
        entityManager.persist(book);
        entityManager.getTransaction().commit();
        return book;
    }

    @Override
    public List<Book> findAll() {
        Query namedQuery = entityManager.createNamedQuery("Book.getAll");
        return namedQuery.getResultList();
    }
}
