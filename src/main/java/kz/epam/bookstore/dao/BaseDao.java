package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPoolException;

import java.sql.SQLException;
import java.util.List;

public interface BaseDao<T> {

    List<T> getAll() throws SQLException, ConnectionPoolException;

    T getById(int id) throws SQLException, ConnectionPoolException;

    void update(T t) throws SQLException, ConnectionPoolException;

    void delete(T t) throws ConnectionPoolException;

    void create(T t) throws ConnectionPoolException;
}
