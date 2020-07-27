package pl.coderslab.users;

import pl.coderslab.DAO.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/user/delete")
public class UserDelete extends HttpServlet {
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            UserDao userDao = new UserDao();
            int id = Integer.parseInt(request.getParameter("id"));
            try {
                userDao.delete(id);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            response.sendRedirect("/user/list");
        }
}
