package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPool;
import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.Author;
import org.apache.log4j.Logger;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AuthorDao implements BaseDao<Author> {
    private ConnectionPool connectionPool;
    private Connection connection;
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private final String GET_BY_ID_QUERY = "SELECT * FROM Author WHERE ID=?;";
    private final String GET_ALL_QUERY = "SELECT * FROM Author;";
    private final String UPDATE_QUERY = "UPDATE Author SET first_name = ?,last_name = ? WHERE id = ?";
    private final String DELETE_QUERY = "DELETE FROM Author WHERE id=?";
    private final String CREATE_QUERY = "INSERT INTO Author (first_name, last_name) VALUES(?,?)";

    @Override
    public Author getById(int id) throws ConnectionPoolException {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        Author author = new Author();
        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_ID_QUERY)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            author.setId(rs.getInt("id"));
            author.setFirstName(rs.getString("first_name"));
            author.setLastName(rs.getString("last_name"));
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
        return author;
    }

    @Override
    public List<Author> getAll() throws ConnectionPoolException {
        List<Author> list = new ArrayList<>();
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_QUERY)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Author author = new Author();
                author.setId(rs.getInt("id"));
                author.setFirstName(rs.getString("first_name"));
                author.setLastName(rs.getString("last_name"));
                list.add(author);
            }
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
        return list;
    }

    @Override
    public void update(Author author) throws ConnectionPoolException {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY);) {
            preparedStatement.setString(1, author.getFirstName());
            preparedStatement.setString(2, author.getLastName());
            preparedStatement.setInt(3, author.getId());
            preparedStatement.executeQuery();
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
    }

    @Override
    public void delete(Author author) throws ConnectionPoolException {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setInt(1, author.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
    }

    @Override
    public void create(Author author) throws ConnectionPoolException {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(CREATE_QUERY)) {
            preparedStatement.setString(1, author.getFirstName());
            preparedStatement.setString(2, author.getLastName());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
    }
}

