package org.geektimes.projects.user.web.controller;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.DatabaseUserRepository;
import org.geektimes.web.mvc.controller.PageController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

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

            //String username = request.getParameter("username");
            //String userpassword = request.getParameter("userpassword");
            //String email = request.getParameter("email");
            //String phonenumber = request.getParameter("phonenumber");

            //User user = new User();
            //user.setId(username);
            //user.setName(userpassword);
            //user.setPassword(email);
            //user.setEmail(phonenumber);

            //DatabaseUserRepository datauser = new DatabaseUserRepository();
            //datauser.deleteById();

            return "register-success.jsp";
        }else {
            return "register-form.jsp";
        }
    }
}
