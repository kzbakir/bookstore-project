package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.Image;

import java.sql.SQLException;
import java.util.List;

public class ImageDao implements BaseDao<Image> {

    @Override
    public List<Image> getAll() throws SQLException, ConnectionPoolException {
        return null;
    }

    @Override
    public Image getById(int id) throws SQLException, ConnectionPoolException {
        return null;
    }

    @Override
    public void update(Image image) throws SQLException, ConnectionPoolException {

    }

    @Override
    public void delete(Image image) throws ConnectionPoolException {

    }

    @Override
    public void create(Image image) throws ConnectionPoolException {

    }
}
