package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.Classification;

import java.sql.SQLException;
import java.util.List;

public class ClassificationDao implements BaseDao<Classification> {

    @Override
    public List<Classification> getAll() throws ConnectionPoolException {
        return null;
    }

    @Override
    public Classification getById(int id) throws ConnectionPoolException {
        return null;
    }

    @Override
    public void update(Classification classification) throws ConnectionPoolException {

    }

    @Override
    public void delete(Classification classification) throws ConnectionPoolException {

    }

    @Override
    public void create(Classification classification) throws ConnectionPoolException {

    }
}
