package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.Stock;

import java.sql.SQLException;
import java.util.List;

public class StockDao implements BaseDao<Stock> {

    @Override
    public List<Stock> getAll() throws ConnectionPoolException {
        return null;
    }

    @Override
    public Stock getById(int id) throws ConnectionPoolException {
        return null;
    }

    @Override
    public void update(Stock stock) throws ConnectionPoolException {

    }

    @Override
    public void delete(Stock stock) throws ConnectionPoolException {

    }

    @Override
    public void create(Stock stock) throws ConnectionPoolException {

    }
}
