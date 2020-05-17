package kz.epam.bookstore.dao;

import kz.epam.bookstore.connection.ConnectionPool;
import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.entity.Account;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDao implements BaseDao<Account> {

    private ConnectionPool connectionPool;
    private Connection connection;
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private final String GET_BY_ID_QUERY = "SELECT * FROM account WHERE ID=?;";
    private final String GET_ALL_QUERY = "SELECT * FROM account;";
    private final String UPDATE_QUERY = "UPDATE account SET username = ?,password = ?,email = ?,phone_number = ?,is_admin =? WHERE id = ?";
    private final String DELETE_QUERY = "DELETE FROM account WHERE id=?";
    private final String CREATE_QUERY = "INSERT INTO account (username, password,email,phone_number,is_admin) VALUES(?,?,?,?,?)";
    private final String FIND_BY_USERNAME_QUERY = "SELECT * FROM account WHERE username = ?";

    public Account findByUsername(String username) throws ConnectionPoolException {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        Account account = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_USERNAME_QUERY)) {
            preparedStatement.setString(1, username);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            account.setUsername(rs.getString("username"));
            account.setPassword(rs.getString("password"));
            account.setEmail(rs.getString("email"));
            account.setPhoneNumber(rs.getString("phone_number"));
            account.setAdmin(rs.getBoolean("is_admin"));

        } catch (SQLException e) {
            logger.error(e);
        } finally {
            connectionPool.putConnection(connection);
        }
        return account;
    }

    @Override
    public List<Account> getAll() throws ConnectionPoolException {
        List<Account> list = new ArrayList<>();
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_QUERY)) {
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Account account = new Account();
                account.setId(rs.getInt("id"));
                account.setUsername(rs.getString("login"));
                account.setPassword(rs.getString("password"));
                account.setEmail(rs.getString("email"));
                account.setPhoneNumber(rs.getString("phone_number"));
                account.setAdmin(rs.getBoolean("is_admin"));
                list.add(account);
            }
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
        return list;
    }

    @Override
    public Account getById(int id) throws ConnectionPoolException {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        Account account = new Account();
        try (PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_ID_QUERY)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            rs.next();
            account.setId(rs.getInt("id"));
            account.setUsername(rs.getString("login"));
            account.setPassword(rs.getString("password"));
            account.setEmail(rs.getString("email"));
            account.setPhoneNumber(rs.getString("phone_number"));
            account.setAdmin(rs.getBoolean("is_admin"));
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
        return account;
    }

    @Override
    public void update(Account account) throws ConnectionPoolException {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY)) {
            preparedStatement.setString(1, account.getUsername());
            preparedStatement.setString(2, account.getPassword());
            preparedStatement.setString(3, account.getEmail());
            preparedStatement.setString(4, account.getPhoneNumber());
            preparedStatement.setBoolean(5, account.isAdmined());
            preparedStatement.setInt(6, account.getId());
            preparedStatement.executeQuery();
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
    }

    @Override
    public void delete(Account account) throws ConnectionPoolException {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY)) {
            preparedStatement.setInt(1, account.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
    }

    @Override
    public void create(Account account) throws ConnectionPoolException {
        connectionPool = ConnectionPool.getInstance();
        connection = connectionPool.takeConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(CREATE_QUERY)) {
            preparedStatement.setString(1, account.getUsername());
            preparedStatement.setString(2, account.getPassword());
            preparedStatement.setString(3, account.getEmail());
            preparedStatement.setString(4, account.getPhoneNumber());
            preparedStatement.setBoolean(5, account.isAdmined());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            logger.error(e, e);
        } finally {
            connectionPool.putConnection(connection);
        }
    }
}
