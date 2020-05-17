package kz.epam.bookstore.controller;

import kz.epam.bookstore.action.BaseAction;
import kz.epam.bookstore.connection.ConnectionPoolException;
import kz.epam.bookstore.factory.ActionFactory;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Controller extends javax.servlet.http.HttpServlet {
    private Logger logger = Logger.getLogger(this.getClass());

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        getAction(request, response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        getAction(request, response);
    }

    private void getAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            BaseAction baseAction = ActionFactory.getActionFactory().getAction(request);
            if (baseAction != null) {
                baseAction.execute(request, response);
            } else {
                //todo
            }
        } catch (ServletException | IOException | ConnectionPoolException e) {
            logger.error(e);
        }
    }
}
