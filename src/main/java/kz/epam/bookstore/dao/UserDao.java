package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.User;

import java.sql.SQLException;
import java.util.List;

public class UserDao implements BaseDao<User> {

    @Override
    public List<User> getAll() throws SQLException, ConnectionPoolException {
        return null;
    }

    @Override
    public User getById(int id) throws SQLException, ConnectionPoolException {
        return null;
    }

    @Override
    public void update(User user) throws SQLException, ConnectionPoolException {

    }

    @Override
    public void delete(User user) throws ConnectionPoolException {

    }

    @Override
    public void create(User user) throws ConnectionPoolException {

    }
}
