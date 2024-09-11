/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.bookstore.controller.admin;

import com.bookstore.entity.Users;
import com.bookstore.service.UserServices;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


/**
 *
 * @author DELL
 */
@WebServlet(name = "ListUsersServlet", urlPatterns = {"/admin/list_users"})
public class ListUsersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserServices userServices = new UserServices();
        List<Users> listUsers = userServices.listUsers();
        request.setAttribute("listUsers", listUsers);
        String listUser ="user_list.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(listUser);
        requestDispatcher.forward(request, response);
    }



}
