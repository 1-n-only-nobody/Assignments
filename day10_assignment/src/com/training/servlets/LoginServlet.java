package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = {"/LoginServlet", "/loginServlet"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String strUsername = request.getParameter("username");
		String strPassword = request.getParameter("password");
		
		request.setAttribute("username", strUsername);
		
		RequestDispatcher dispatcher1 = request.getRequestDispatcher("/welcome.jsp");
		RequestDispatcher dispatcher2 = request.getRequestDispatcher("/failure.jsp");
		
		if(strPassword.trim().equals(strUsername.trim())) {
			dispatcher1.forward(request, response);
		} else {
			dispatcher2.forward(request, response);
		}
//		doGet(request, response);
	}

}
