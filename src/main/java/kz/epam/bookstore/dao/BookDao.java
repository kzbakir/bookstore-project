package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPool;
import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.Book;
import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDao implements BaseDao<Book> {
    private ConnectionPool connectionPool;
    private Connection connection;
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private final String GET_BY_ID_QUERY = "SELECT * FROM Book WHERE ID=?;";
    private final String GET_ALL_QUERY = "SELECT * FROM Book;";
    private final String UPDATE_QUERY = "UPDATE Book SET title = ?, description = ?,price = ?,publisher_id= ?,language_id =?, image_id =? WHERE id = ?";
    private final String DELETE_QUERY = "DELETE FROM Book WHERE id=?";
    private final String CREATE_QUERY = "INSERT INTO Book (title, description,price,publisher_id,language_id, image_id VALUES(?,?,?,?,?,?)";

    @Override
    public List<Book> getAll() throws ConnectionPoolException {
        List<Book> list = new ArrayList<>();
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_QUERY)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setTitle(rs.getString("title"));
                book.setDescription(rs.getString("description"));
                book.setPrice(rs.getDouble("price"));
                book.setLanguageId(rs.getInt("language_id"));
                book.setPublisherId(rs.getInt("publisher_id"));
                book.setImageId(rs.getInt("image_id"));
                list.add(book);
            }
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
        return list;
    }

    @Override
    public Book getById(int id) throws ConnectionPoolException {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        Book book = new Book();
        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_ID_QUERY)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            book.setId(rs.getInt("id"));
            book.setTitle(rs.getString("title"));
            book.setDescription(rs.getString("description"));
            book.setPrice(rs.getDouble("price"));
            book.setLanguageId(rs.getInt("language_id"));
            book.setPublisherId(rs.getInt("publisher_id"));
            book.setImageId(rs.getInt("image_id"));
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
        return book;
    }

    @Override
    public void update(Book book) throws ConnectionPoolException {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2, book.getDescription());
            preparedStatement.setDouble(3, book.getPrice());
            preparedStatement.setInt(4, book.getPublisherId());
            preparedStatement.setInt(5, book.getLanguageId());
            preparedStatement.setInt(6, book.getImageId());
            preparedStatement.setInt(7,book.getId());
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
    }

    @Override
    public void delete(Book book) throws ConnectionPoolException {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setInt(1, book.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
    }

    @Override
    public void create(Book book) throws ConnectionPoolException {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(CREATE_QUERY)) {
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2, book.getDescription());
            preparedStatement.setDouble(3, book.getPrice());
            preparedStatement.setInt(4,book.getPublisherId());
            preparedStatement.setInt(5,book.getLanguageId());
            preparedStatement.setInt(6,book.getImageId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
    }
}
