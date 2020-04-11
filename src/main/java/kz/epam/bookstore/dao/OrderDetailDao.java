package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.OrderDetail;

import java.sql.SQLException;
import java.util.List;

public class OrderDetailDao implements BaseDao<OrderDetail> {

    @Override
    public List<OrderDetail> getAll() throws ConnectionPoolException {
        return null;
    }

    @Override
    public OrderDetail getById(int id) throws ConnectionPoolException {
        return null;
    }

    @Override
    public void update(OrderDetail orderDetail) throws ConnectionPoolException {

    }

    @Override
    public void delete(OrderDetail orderDetail) throws ConnectionPoolException {

    }

    @Override
    public void create(OrderDetail orderDetail) throws ConnectionPoolException {

    }
}
