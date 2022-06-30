package com.rubin.user.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rubin.user.dao.userDAO;
import com.rubin.user.dao.userDAOImpl;
import com.rubin.user.dto.User;
@WebServlet
public class DisplayUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		userDAO dao = new userDAOImpl();
		User users = dao.read(Integer.parseInt(request.getParameter("id")));
		
		PrintWriter out= response.getWriter();
		out.print(dao.read(Integer.parseInt(request.getParameter("id"))));
		out.print("User ID: "+users.getId());
		out.print("User Email: "+users.getEmail());
		out.print("User Name: "+users.getName());
	}

}
