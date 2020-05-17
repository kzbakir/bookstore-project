package kz.epam.bookstore.action;

import kz.epam.bookstore.connection.ConnectionPoolException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainPageAction implements BaseAction {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ConnectionPoolException {
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

}
