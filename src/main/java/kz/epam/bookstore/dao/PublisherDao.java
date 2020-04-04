package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.Publisher;

import java.sql.SQLException;
import java.util.List;

public class PublisherDao implements BaseDao<Publisher> {

    @Override
    public List<Publisher> getAll() throws SQLException, ConnectionPoolException {
        return null;
    }

    @Override
    public Publisher getById(int id) throws SQLException, ConnectionPoolException {
        return null;
    }

    @Override
    public void update(Publisher publisher) throws SQLException, ConnectionPoolException {

    }

    @Override
    public void delete(Publisher publisher) throws ConnectionPoolException {

    }

    @Override
    public void create(Publisher publisher) throws ConnectionPoolException {

    }
}
