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
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");

		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		userDAO dao=new userDAOImpl();
		
		
		dao.create(user);
		
		PrintWriter out=response.getWriter();
		out.print("User Created Successfully");
		
	}
}