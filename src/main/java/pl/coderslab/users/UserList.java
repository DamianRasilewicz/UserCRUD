package pl.coderslab.users;

import org.apache.taglibs.standard.lang.jstl.Logger;
import pl.coderslab.DAO.UserDao;
import pl.coderslab.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.LogManager;

@WebServlet("/user/list")
public class UserList extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();

        try {
            request.setAttribute("users", userDao.findALL());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        getServletContext().getRequestDispatcher("/users/list.jsp")
                .forward(request, response);
    }
}