package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPool;
import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.BookImage;
import java.sql.Connection;
import java.util.List;


public class BookImageDao implements BaseDao<BookImage> {
    private ConnectionPool connectionPool;
    private Connection connection;

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
