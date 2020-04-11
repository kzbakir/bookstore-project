package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.OrderInfo;

import java.sql.SQLException;
import java.util.List;

public class OrderInfoDao implements BaseDao<OrderInfo> {

    @Override
    public List<OrderInfo> getAll() throws ConnectionPoolException {
        return null;
    }

    @Override
    public OrderInfo getById(int id) throws ConnectionPoolException {
        return null;
    }

    @Override
    public void update(OrderInfo orderInfo) throws ConnectionPoolException {

    }

    @Override
    public void delete(OrderInfo orderInfo) throws ConnectionPoolException {

    }

    @Override
    public void create(OrderInfo orderInfo) throws ConnectionPoolException {

    }
}
