package kz.epam.bookstore;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.dao.AuthorDao;
import java.sql.SQLException;

public class Runner {
    public static void main(String[] args) throws ConnectionPoolException, SQLException {
        AuthorDao authorDao = new AuthorDao();
        System.out.println(authorDao.getById(1));
    }
}
