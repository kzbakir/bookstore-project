package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.GenreBook;

import java.sql.SQLException;
import java.util.List;

public class GenreBookDao implements BaseDao<GenreBook> {

    @Override
    public List<GenreBook> getAll() throws ConnectionPoolException {
        return null;
    }

    @Override
    public GenreBook getById(int id) throws ConnectionPoolException {
        return null;
    }

    @Override
    public void update(GenreBook genreBook) throws ConnectionPoolException {

    }

    @Override
    public void delete(GenreBook genreBook) throws ConnectionPoolException {

    }

    @Override
    public void create(GenreBook genreBook) throws ConnectionPoolException {

    }
}
