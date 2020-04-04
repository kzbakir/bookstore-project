package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.Sale;

import java.sql.SQLException;
import java.util.List;

public class SaleDao implements BaseDao<Sale> {

    @Override
    public List<Sale> getAll() throws SQLException, ConnectionPoolException {
        return null;
    }

    @Override
    public Sale getById(int id) throws SQLException, ConnectionPoolException {
        return null;
    }

    @Override
    public void update(Sale sale) throws SQLException, ConnectionPoolException {

    }

    @Override
    public void delete(Sale sale) throws ConnectionPoolException {

    }

    @Override
    public void create(Sale sale) throws ConnectionPoolException {

    }
}
