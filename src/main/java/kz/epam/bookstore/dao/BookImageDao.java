package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.BookImage;

import java.sql.SQLException;
import java.util.List;

public class BookImageDao implements BaseDao<BookImage> {

    @Override
    public List<BookImage> getAll() throws ConnectionPoolException {
        return null;
    }

    @Override
    public BookImage getById(int id) throws ConnectionPoolException {
        return null;
    }

    @Override
    public void update(BookImage bookImage) throws ConnectionPoolException {

    }

    @Override
    public void delete(BookImage bookImage) throws ConnectionPoolException {

    }

    @Override
    public void create(BookImage bookImage) throws ConnectionPoolException {

    }
}
