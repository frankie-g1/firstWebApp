package com.in28minutes;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login.do") //the web server has a status report, you must manually enter in login.do AFTER localhost:8080/ AND entering name and password.
                                        //the web.xml class would need changing for it to work automatically (lines 8 and 10 of web.xml)
public class LoginServlet extends HttpServlet{


    private UserValidationService service = new UserValidationService();

    private boolean isUserValid = false;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String name = request.getParameter("boof")    ; //?boof=whatever
//        request.setAttribute("boof", name);

//        request.setAttribute("boof", request.getParameter("boof"));
//        request.setAttribute("password", request.getParameter("password"));

        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);


    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       if(!isUserValid){
           String name = request.getParameter("boof");
           String password = request.getParameter("password");
           isUserValid = service.isUserValid(name, password);

           if(isUserValid){
               request.getSession().setAttribute("HELL", name);
               request.getSession().setAttribute("password", password);
               request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);

           }else{
               request.setAttribute("errorMessage", "Invalid Credentials!");
               request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
           }
       }



//        while(entry != null)
//            toDoList.listAdd(entry);
//            toDoList.print();



    }



}
