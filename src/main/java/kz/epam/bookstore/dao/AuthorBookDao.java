package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPool;
import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.Author;
import kz.epam.bookstore.entity.AuthorBook;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorBookDao implements BaseDao<AuthorBook> {
    private ConnectionPool connectionPool;
    private Connection connection;
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private final String GET_BY_ID_QUERY = "SELECT * FROM author_book WHERE ID=?;";
    private final String GET_ALL_QUERY = "SELECT * FROM author_book;";
    private final String UPDATE_QUERY = "UPDATE author_book SET author_id = ?,book_id = ? WHERE author_id = ?";
    private final String DELETE_QUERY = "DELETE FROM author_book WHERE id=?";
    private final String CREATE_QUERY = "INSERT INTO author_book (author_id,book_id) VALUES(?,?)";

    @Override
    public List<AuthorBook> getAll() throws ConnectionPoolException {
        List<AuthorBook> list = new ArrayList<>();
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_QUERY)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                AuthorBook authorBook = new AuthorBook();
                authorBook.setAuthorId(rs.getInt("author_id"));
                authorBook.setBookId(rs.getInt("book_id"));
                list.add(authorBook);
            }
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
        return list;
    }

    @Override
    public AuthorBook getById(int id) throws ConnectionPoolException {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        AuthorBook authorBook = new AuthorBook();
        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_ID_QUERY)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            authorBook.setAuthorId(rs.getInt("author_id"));
            authorBook.setBookId(rs.getInt("book_id"));
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
        return authorBook;
    }

    @Override
    public void update(AuthorBook authorBook) throws ConnectionPoolException {

    }

    @Override
    public void delete(AuthorBook authorBook) throws ConnectionPoolException {

    }

    @Override
    public void create(AuthorBook authorBook) throws ConnectionPoolException {

    }
}
