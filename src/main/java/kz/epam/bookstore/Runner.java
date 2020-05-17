package kz.epam.bookstore;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.dao.AccountDao;

import java.sql.SQLException;

public class Runner {
    public static void main(String[] args) throws ConnectionPoolException, SQLException {
        AccountDao accountDao = new AccountDao();
        System.out.println(accountDao.getAll().get(0).isAdmined());

    }
}
