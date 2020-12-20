package pl.coderslab.users;

import pl.coderslab.DAO.UserDao;
import pl.coderslab.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/add")
public class UserAdd extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/users/add.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        UserDao userDao = new UserDao();
        User user = new User();
        String userName = req.getParameter("userName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        user.setUserName(userName);
        user.setEmail(email);
        user.setPassword(password);
        userDao.create(user);
        resp.sendRedirect("/user/list");
    }
    }