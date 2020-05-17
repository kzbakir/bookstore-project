package kz.epam.bookstore.action;

import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.dao.AccountDao;
import kz.epam.bookstore.entity.Account;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginAction implements BaseAction {
    private Account account;
    private AccountDao accountDao = new AccountDao();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ConnectionPoolException {
        login(request, response);
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws ConnectionPoolException, ServletException, IOException {

        request.getRequestDispatcher("/login.jsp").forward(request,response);
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (login.equals("Aidyn") && password.equals("123")){
            System.out.println("Значение приняты!");
            response.sendRedirect("http://www.google.com");
        }
    }
}
