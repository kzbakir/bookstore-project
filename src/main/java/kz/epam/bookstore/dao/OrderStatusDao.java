package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.OrderStatus;

import java.sql.SQLException;
import java.util.List;

public class OrderStatusDao implements BaseDao<OrderStatus> {

    @Override
    public List<OrderStatus> getAll() throws ConnectionPoolException {
        return null;
    }

    @Override
    public OrderStatus getById(int id) throws ConnectionPoolException {
        return null;
    }

    @Override
    public void update(OrderStatus orderStatus) throws ConnectionPoolException {

    }

    @Override
    public void delete(OrderStatus orderStatus) throws ConnectionPoolException {

    }

    @Override
    public void create(OrderStatus orderStatus) throws ConnectionPoolException {

    }
}
