package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.Book;

import java.sql.SQLException;
import java.util.List;

public class BookDao implements BaseDao<Book> {

    @Override
    public List<Book> getAll() throws SQLException, ConnectionPoolException {
        return null;
    }

    @Override
    public Book getById(int id) throws SQLException, ConnectionPoolException {
        return null;
    }

    @Override
    public void update(Book book) throws SQLException, ConnectionPoolException {

    }

    @Override
    public void delete(Book book) throws ConnectionPoolException {

    }

    @Override
    public void create(Book book) throws ConnectionPoolException {

    }
}
