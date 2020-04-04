package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.Language;

import java.sql.SQLException;
import java.util.List;

public class LanguageDao implements BaseDao<Language> {

    @Override
    public List<Language> getAll() throws SQLException, ConnectionPoolException {
        return null;
    }

    @Override
    public Language getById(int id) throws SQLException, ConnectionPoolException {
        return null;
    }

    @Override
    public void update(Language language) throws SQLException, ConnectionPoolException {

    }

    @Override
    public void delete(Language language) throws ConnectionPoolException {

    }

    @Override
    public void create(Language language) throws ConnectionPoolException {

    }
}
