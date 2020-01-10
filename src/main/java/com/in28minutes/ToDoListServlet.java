package com.in28minutes;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/toDo.do")

public class ToDoListServlet extends HttpServlet {

    ToDoList doList = new ToDoList();
    private int slot = 0;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String toDo = request.getParameter("doEntry");
        doList.listAdd(toDo);




//        StringBuilder list = new StringBuilder();
//
//        for(int i = 0 ; i < doList.getSize(); i++){
//            list.append(String.format("%n", doList.getValueAt(i)));
//        }
//
//        String l = list.toString(); //also why not have this bee in the todolist class, but hey it waas whipped up
//
//        request.getSession().setAttribute("nud", l); //var name doesn't change the fact this doesn't appear

        if(!("remove".isEmpty())){
            String remove = request.getParameter("remove");
            if(!doList.isEmpty() && remove != null){
                doList.remove(remove);
            }
        }

        request.getSession().setAttribute("tbd", doList.print());


        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);


    }

}
