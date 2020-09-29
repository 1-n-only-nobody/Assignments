package com.training.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FooterServlet
 */
@WebServlet(
		name = "footerServlet",
		urlPatterns = {"/FooterServlet", "/footerServlet"},
		initParams = { @WebInitParam(name = "adminId", value = "admin@abc.com") }
		)

public class FooterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private String paramValue = null;
    public FooterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
//		paramValue = getServletConfig().getInitParameter("adminId");
		paramValue = config.getInitParameter("adminId");
//		System.out.println(paramValue);
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
		
//		String paramValue = getServletConfig().getServletName();
		request.setAttribute("adminid", paramValue);
		request.setAttribute("designerName", "Manan");
		
//		System.out.println(paramValue);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/footer.jsp");
		
		dispatcher.forward(request, response);
		
//		doGet(request, response);
	}

}
