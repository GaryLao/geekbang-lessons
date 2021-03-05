package org.geektimes.projects.user.web.controller;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.DatabaseUserRepository;
import org.geektimes.projects.user.service.UserServiceImpl;
import org.geektimes.projects.user.sql.DBConnectionManager;
import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 输出 “注册” Controller
 */
@Path("/register")
public class RegisterController implements PageController {

    @GET
    @POST
    public String execute(HttpServletRequest request, HttpServletResponse response) throws Throwable {
        System.out.println("--"+request.getMethod()+"--");
        if (request.getMethod().equals("POST")) {
            try {
                String username = request.getParameter("username");
                String userpassword = request.getParameter("userpassword");
                String email = request.getParameter("email");
                String phonenumber = request.getParameter("phonenumber");

                //
                //DBConnectionManager dbConnectionManager = new DBConnectionManager();
                //
                //String databaseURL = "jdbc:derby:db/UserPlatformDB;create=true";
                //Connection connection = DriverManager.getConnection(databaseURL);
                //dbConnectionManager.setConnection(connection);
                //
                //try {
                //    dbConnectionManager.CreateUsersTable();
                //}catch (SQLException e){
                //    //throw new SQLException(e.getCause());
                //}

                //DatabaseUserRepository databaseUserRepository = new DatabaseUserRepository(dbConnectionManager);
                DatabaseUserRepository databaseUserRepository = new DatabaseUserRepository();

                User user = databaseUserRepository.getByName(username);

                //System.out.println(user.toString());
                if (user != null && user.getName() != null) {
                    return "register-user-exists.jsp";
                } else {
                    //System.out.println("username="+username);

                    //User user = new User();
                    user.setName(username);
                    user.setPassword(userpassword);
                    user.setEmail(email);
                    user.setPhoneNumber(phonenumber);

                    UserServiceImpl userService = new UserServiceImpl(databaseUserRepository);
                    if (!userService.register(user)) {
                        return "register-false.jsp";
                    } else {
                        return "register-success.jsp";
                    }
                }
            } catch (Exception throwable) {
                throwable.printStackTrace();
                return "register-false.jsp";
            }

        }else {
            return "register-form.jsp";
        }
    }
}
